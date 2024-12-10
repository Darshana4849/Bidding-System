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


@WebServlet("/SingleDataButton")
public class SingleDataButton extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SingleDataButton() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contact con = new contact();
		con.setEmail(request.getParameter("email"));
		contactService service = new contactService();
		contact contact= service.singleDataButton(con);
		RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
		request.setAttribute("contact", contact);
		
		dispatcher.forward(request, response);
	}

}
