
package firstpkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.*;
import jakarta.servlet.*;
import jakarta.annotation.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


//@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher req= null;
	
	public SignupServlet() {
		super();
		
	}

   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Hello world");
//		 String fname = request.getParameter("firstname");
//         String lname = request.getParameter("lastname");
//         String email = request.getParameter("email");
//         String password = request.getParameter("password");
////         MemberRegister member = new MemberRegister(fname, lname, email, password);
////         WarehouseDb rdb = new WarehouseDb();
////         String result = rdb.insert(member);
////         response.getWriter().print(result);
//         
//         try {
//        	 Class.forName("com.mysql.cj.jdbc.Driver");
//        	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehousedata","root","Mahesh@1");
//        	 PreparedStatement stmt = con.prepareStatement("insert into signupdetails values(?,?,?,?)");
//        	 stmt.setString(1, fname);
//        	 stmt.setString(2, lname);
//        	 stmt.setString(3, email);
//        	 stmt.setString(4, password);
//        	 
//        	 int count = stmt.executeUpdate();
//        	 System.out.println(count);
//        	 
//        	 if(count>0) {
//        		 req = request.getRequestDispatcher("index.html");
//        		 request.setAttribute("status", "Success");
//        		 req.forward(request, response);
//        	 }
//         }
//         catch(Exception r)
//         {
//        	 System.out.println(r);
//         }
	}
}
