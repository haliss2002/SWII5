//Halisson de Oliveira Sousa CB3012051
//Marcel Crudelli  CB301181
package TP_01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");

		Emp e=new Emp();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);

		int status=EmpDao.save(e);
		if(status>0){ out.print("<p>Record saved successfully!</p>");
		request.getRequestDispatcher("index.html").include(request, response);
		}else{
		out.println("Sorry! unable to save record");
		}

		out.close();
		}
	}

