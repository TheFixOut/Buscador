package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.*;
import model.*;
import service.BuscadorServiceFactory;

/**
 * Servlet implementation class Buscador
 */
@WebServlet("/Buscador")
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clave=request.getParameter("clave");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		List<Pagina> items=BuscadorServiceFactory.getBuscadorService().buscar(clave);
		items.forEach(it->
			out.println("<h2><a href='"+it.getUrl()+"'>"+it.getNombre()+"</a></h2>")
		);
			
		out.println("</body></html>");

	}
}
