package firstpkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;

    /**
     * Default constructor. 
     */
    public loginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welcome to Home Page!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String userpassword = request.getParameter("password");
		HttpSession session = request.getSession(); 
		try {
			Class.forName("com.mysql.jdbc.Driver");
       	 	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehousedata","root","Mahesh@1");
       	 PreparedStatement stmt = con.prepareStatement("select * from signupdetails where email=? and password=?");
       	 	stmt.setString(1, username);
       	 	stmt.setString(2, userpassword);
       	 	
       	 ResultSet count = stmt.executeQuery();
    	 //System.out.println(count);
       	 if(count.next()) {
       		session.setAttribute("name",count.getString("firstname"));
       		 dispatcher = request.getRequestDispatcher("home.html");
       		 
//	       		PrintWriter out = response.getWriter();
//	    		out.print("Welcome to Home Page!");
//    		 request.setAttribute("status", "Success");
    		 dispatcher.forward(request, response);
       	 }
		}catch(Exception r)
		{
			System.out.println(r);
		}
		
		
	}

}
