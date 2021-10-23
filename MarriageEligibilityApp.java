package com.app.eligibility;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Eligibility")
public class EligibilityApp extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		int uage=Integer.parseInt(request.getParameter("age"));
		String ugender=request.getParameter("gender");
		PrintWriter out=response.getWriter();
		if(ugender.equals("Male")) {
			if(uage>=25) {
				out.println("<h1>"+name+",you're eligible to marry...</h1>");
			}
			else {
				out.println("<h1>"+name+",you're not eligible to marry!!!</h1>");
			}
		}
		else if(ugender.equals("Female")){
			if(uage>=21) {
				out.println("<h1>"+name+",you're eligible to marry...</h1>");
			}
			else {
				out.println("<h1>"+name+",you're not eligible to marry!!!</h1>");
			}
		}
		out.println("<a href='index.html'>Back</a>");
		out.close();
	}
}
