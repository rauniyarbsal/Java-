import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Servlet9")
public class Servlet9 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String str1 = request.getParameter("uname");
	String str2 = request.getParameter("pname");
	out.println("<html>");
	out.println("<body>");
	out.println("Username is :" + str1 + "<br/>");
	out.println("Password is :" + str2);
	out.println("</body>");
	out.println("</html>"); 
	}
}
