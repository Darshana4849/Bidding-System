package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.contact;
import services.contactService;


@WebServlet("/AdminContact")
public class AdminContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AdminContact() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contactService service = new contactService();
		ArrayList<contact> contact = service.getAllcustomer();
		request.setAttribute("contact", contact);
		
		RequestDispatcher dispacher = request.getRequestDispatcher("AdminTable.jsp");
		dispacher.forward(request, response);
	}

}
