package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SellerDAO;
import model.Seller;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			Seller s = new Seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = SellerDAO.checkEmail(email);
			if(flag == false){
				SellerDAO.insertSeller(s);
				response.sendRedirect("seller-login.jsp");
			}
			else {
				request.setAttribute("msg", "account already registered");
				request.getRequestDispatcher("seller-registration.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login")) {
			Seller s = new Seller();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			Seller s1= SellerDAO.sellerLogin(s);
			if(s1!=null) {
				HttpSession session  = request.getSession();
				session.setAttribute("data", s1);
				request.getRequestDispatcher("seller-home.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			Seller s = new Seller();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			SellerDAO.updateProfile(s);
			HttpSession session  = request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("cp")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np  = request.getParameter("np");
			String cnp  = request.getParameter("cnp");
			boolean flag =  SellerDAO.checkOP(id, op);
			if(flag == true) {
				if(np.equals(cnp)) {
					SellerDAO.updatePassword(id, np);
					response.sendRedirect("seller-home.jsp");
				}
				else {
					request.setAttribute("msg1", "np and cnp is not matched");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old password is incorrect");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}
		}
	}

}
