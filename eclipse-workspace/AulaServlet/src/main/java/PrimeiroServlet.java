

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrimeiroServlet() {
        super();
 
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			
			String user = request.getParameter("cliente");
			out.println("<h2> Bem vindo " + user + "</h2>");
		} finally {
			out.close();
		}
		
	}

}
