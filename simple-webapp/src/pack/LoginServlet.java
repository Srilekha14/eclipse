package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      public LoginServlet() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("un");
		String password=request.getParameter("pw");
		PrintWriter pw=response.getWriter();
		if(user.equals("admin") && password.equals("cts")){
			RequestDispatcher rd=request.getRequestDispatcher("Success.html");
			pw.print("<html><body>Forward Content</body></html>");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			pw.print("<html><body>Authenticatio Error</body></html>");
			rd.include(request, response);
		}
	}



		
	}


