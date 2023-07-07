

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalcSer")
public class CalcSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static int num1, num2;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(PrintWriter out = response.getWriter()){
			if(request.getParameter("btnsubmit").equals("+"))
			{
				num1 = Integer.parseInt(request.getParameter("txtnum1"));
				
				response.sendRedirect("PrimeiroJSP.jsp?q1="+num1);
			}
			else if(request.getParameter("btnsubmit").equals("="))
			{
				int num3 = num1+Integer.parseInt(request.getParameter("txtnum1"));
				response.sendRedirect("PrimeiroJSP.jsp?q="+num3);				
			}
			
			else if(request.getParameter("textnum1")!=null)
				response.sendRedirect("PrimeiroJSP.jsp?="+(request.getParameter("txtnum1")+request.getParameter("btnsubmit")));
			else
			{
				if(request.getParameter("q1")!=null)
					response.sendRedirect("PrimeiroJSP.jsp?q="+request.getParameter("btnsubmit")+"&q1="+request.getParameter("q1"));
				else
					response.sendRedirect("PrimeiroJSP.jsp?q="+request.getParameter("btnsubmit"));
			}
		}
	}

}
