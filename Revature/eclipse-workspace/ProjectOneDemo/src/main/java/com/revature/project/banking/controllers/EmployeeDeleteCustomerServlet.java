package com.revature.project.banking.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeleteCustomerServlet
 */
public class EmployeeDeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDeleteCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int customerId = Integer.parseInt((String) request.getParameter("customerId"));
		EmployeeService employeeService = new EmployeeServiceImpl();
		boolean result = employeeService.deleteAnCustomerById(customerId);
		
		if(result) {
			out.write("<html><head>");
			out.write("<title>Imran Banking</title>");
			out.write("<link rel=\"stylesheet\" href=\"css/DeleteCustomer.css\">");
			out.write("<link\r\n"
					+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n"
					+ "	rel=\"stylesheet\"\r\n"
					+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n"
					+ "	crossorigin=\"anonymous\">");
			out.write("</head><body>");
			out.write("<header>\r\n" + "\r\n" + "		<br>\r\n" + "		<h3>IMRAN'S BANKING APP</h3>\r\n"
					+ "		<br>\r\n" + "		<div class=\"nav\"> \r\n" + "			<a href=\"EmployeeHome.html\">HOME</a> \r\n"
					+ "			<a href=\"#\">ABOUT US</a>\r\n"
					+ "			<a class = \"right\" href=\"Contact.html\">CONTACT</a>\r\n"
					+ " <a href = \"RegisterCustomer.html\">SIGN UP</a>"
					+ "		</div>\r\n" + "	</header>");
			out.write("<br><br>");
			out.write("<h4>Account Deleted Customer with the customer Id: " + customerId + " Successfully</h4>");
			out.write("<br><br>");
			out.write("<a href = \"EmployeeViewAllCustomerServlet\">BACK</a> ");
			out.write("<a href = \"EmployeeHome.html\">HOME</a> ");
			out.write("<br><br><br><br><br><br><br>");
			out.write("<footer>"
					+ "		<br>COPYRIGHT@IMRAN<br><br>"
					+ "	</footer>");
			out.write("</body></html>");
		}
			else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorHandlerServlets");
				requestDispatcher.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
