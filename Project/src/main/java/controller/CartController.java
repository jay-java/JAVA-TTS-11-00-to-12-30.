package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CartDAO;
import dao.ProductDAO;
import model.Cart;
import model.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("addtocart")) {
			Cart c =new Cart();
			c.setCus_id(Integer.parseInt(request.getParameter("cusid")));
			c.setPid(Integer.parseInt(request.getParameter("pid")));
			int pid = Integer.parseInt(request.getParameter("pid"));
			Product p = ProductDAO.getProductById(pid);
			c.setQty(1);
			c.setPprice(p.getPprice());
			c.setTotal_price(p.getPprice());
			c.setSubtotal(p.getPprice());
			c.setPayment_status("pending");
			CartDAO.insertIntoCart(c);
			response.sendRedirect("customer-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		System.out.println(cart_id);
		System.out.println(qty);
		Cart c = CartDAO.getCartByCartId(cart_id);
		c.setCart_id(cart_id);
		c.setQty(qty);
		c.setTotal_price(qty*c.getPprice());
		int subtotal = qty*c.getPprice();
		c.setSubtotal(subtotal);
		CartDAO.updateCart(c);
		response.sendRedirect("cart.jsp");
	}

}
