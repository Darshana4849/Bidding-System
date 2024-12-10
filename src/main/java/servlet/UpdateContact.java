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


@WebServlet("/UpdateContact")
public class UpdateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateContact() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		contact con = new contact();
		
		con.setName(request.getParameter("name"));
		con.setEmail(request.getParameter("email"));
		con.setNumber(request.getParameter("number"));
		con.setMessage(request.getParameter("Message"));
		
		
		contactService service = new contactService();
		service.updateCustomer(con);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("singleDataButton");
		dispatcher.forward(request, response);
	}

}
