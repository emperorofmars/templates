
package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello_servlet")
public class hello_servlet extends HttpServlet{
	public void init()
	{
		//todo
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	{
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>hello</h1>");
		}
		catch(Exception e){
			//todo
		}
	}


	public void destroy()
	{
		//todo
	}
}

