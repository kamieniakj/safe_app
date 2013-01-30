package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Authenticator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Authenticator() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// authentication needs to be done server side to prevent
		
		/* Get username and password from request
		 * Instantiate a User from the username
		 * Compare the User password with the request password
		 * if they match, check if user is an admin
		 * 	if they are, send user portal
		 * 	if they are not, send client portal
		 * if they did not match, send back login page
		 */
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
				
		boolean match = true; //boolean match = ... compare passwords
		boolean admin = true; //boolean admin = ... are they an admin
		
		if(password.equals("password")){
			if(username.equals("admin")){
				request.getRequestDispatcher("/pages/user_portal.jsp").forward(request, response);
			}
			request.getRequestDispatcher("/pages/client_portal.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("/pages/errors/invalid_login.html");
		}
		
		
	}//end doPost

}//End class
