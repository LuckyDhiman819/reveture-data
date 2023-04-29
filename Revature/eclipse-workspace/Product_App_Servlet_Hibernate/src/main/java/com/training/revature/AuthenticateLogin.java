package com.training.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticateLogin
 */
public class AuthenticateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		out.println("<html><body>");
		out.println("<h2> you looged in at "+ new java.util.Date());
		out.println("<br>your user name is : "+ name);
		out.println("<br>your user passowrd is : "+ password);
		out.println("<h5>Please <a href=\"AddProduct.html\"> <button>Click me</button> </a> for show details</h5>\r\n");
		out.println("</body></html>");
	}

}
