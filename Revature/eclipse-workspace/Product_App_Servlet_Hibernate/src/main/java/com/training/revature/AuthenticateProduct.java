package com.training.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.pms.dao.ProductDaoHibernate;
import com.revature.pms.dao.ProductDaoImp;
import com.revature.pms.model.Product;

/**
 * Servlet implementation class AuthenticateProduct
 */
public class AuthenticateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticateProduct() {
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
		String name = request.getParameter("name");
		int  productid = Integer.parseInt(request.getParameter("productid"));
		int  quantity = Integer.parseInt(request.getParameter("quantity"));
		int  price = Integer.parseInt(request.getParameter("price"));
		String comments = request.getParameter("comments");
		
		
		
		Product product = new Product(productid, name, quantity, price, comments);
		
		ProductDaoHibernate productDao = new ProductDaoHibernate();
		productDao.addProduct(product);
		
		out.println("<html><body>");
		out.println("<h2> you looged in at "+ new java.util.Date());
		out.println("<br>your user name is : "+ name);
		out.println("<br>your user passowrd is : "+ productid);
		out.println("<h5>Please <a href=\"AddProduct.html\"> <button>Click me</button> </a> for show details</h5>\r\n");
		out.println("</body></html>");
	}

}
