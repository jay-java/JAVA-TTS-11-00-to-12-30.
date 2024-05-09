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
			c.setPayment_status("pending");
			CartDAO.insertIntoCart(c);
			response.sendRedirect("customer-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
