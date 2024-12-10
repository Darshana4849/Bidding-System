package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.contact;
import services.contactService;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		contact con = new contact();
		con.setEmail(request.getParameter("email"));
		con.setNumber(request.getParameter("number"));
		
		contactService service= new contactService();
		boolean status = service.validate(con);
		
		if(status) {
			contact loginedCus = service.getone(con);
			RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
			request.setAttribute("contact", loginedCus);
			dispatcher.forward(request,response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request,response);
		}
		
	}

}
