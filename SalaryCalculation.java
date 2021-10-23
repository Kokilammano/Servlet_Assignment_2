package com.app.salary;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalaryCalc")
public class SalaryCalcApp extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emp_id=request.getParameter("eid");
		String emp_name=request.getParameter("ename");
		long emp_mbl=Long.parseLong(request.getParameter("mobile"));
		String emp_mail=request.getParameter("email");
		int emp_sal=Integer.parseInt(request.getParameter("salary"));
		double pf=emp_sal * 1/100;
		double esi=emp_sal* 2/100;
		double hra=emp_sal * 2/100;
		double da=emp_sal * 1/100;
		double gross_sal=emp_sal+pf+hra+esi+da;
		double net_sal=gross_sal-(pf+esi);
		PrintWriter out=response.getWriter();
		out.println("<h1>Salary Breakup</h1>");
		out.println("<hr>");
		out.println("<table border=1px>");
		out.println("<tr><th>Eid</th><td>"+emp_id+"</td>");
		out.println("<tr><th>Ename</th><td>"+emp_name+"</td>");
		out.println("<tr><th>Mobile</th><td>"+emp_mbl+"</td>");
		out.println("<tr><th>Email</th><td>"+emp_mail+"</td>");
		out.println("<tr><th>Sal</th><td>"+emp_sal+"</td>");
		out.println("<tr><th>Pf</th><td>"+pf+"</td>");
		out.println("<tr><th>Esi</th><td>"+esi+"</td>");
		out.println("<tr><th>Hra</th><td>"+hra+"</td>");
		out.println("<tr><th>Da</th><td>"+da+"</td>");
		out.println("<tr><th>Gross</th><td>"+gross_sal+"</td>");
		out.println("<tr><th>Net</th><td>"+net_sal+"</td>");
		out.println("</table>");
		out.println("<br>");
		out.println("<a href='index.html'>Back</a>");
		out.close();
	}

}
