package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmProduct
 */
public class ConfirmProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String products[] = request.getParameterValues("products");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("getname");
		out.println("<html><body>");
		String quanity[] = new String[5];
		String price[] = new String[5];
		int i = 0;
		if(products == null) {
			
			out.println("<h1>Please select atlest one product<a href = SelectProduct.html>Try Again<a/></h1>");
			
		}
		else {
			out.println("<h1>Thaks For Selecting products are "+username+" :</h1>");
			out.println("<form action = CalculateBill>");
			for( String s:products) {
				out.println(""+s + "<input type=text name = "+("quantity"+s)+" > <br><br>");
				
			}
			for(String str: products) {
				
				price[i] =  ((String) request.getParameter(str+"Price"));
				System.out.println(quanity[i]+" "+ price[i]+" "+ str);
				i++;
			}
		}
//		String  = request.getParameter("username");
		session.setAttribute("quanityProducts", quanity);
		session.setAttribute("priceProducts", price);
		session.setAttribute("products", products);
		
		

		out.println("<input type = submit value = cheakout />");
		out.println("</form>");
		out.println("</body></html>");

	}

	private int parseInteger(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
