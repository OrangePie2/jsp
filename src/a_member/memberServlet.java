package a_member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class member
 */
@WebServlet("/memberServlet")
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("name");
		String num= request.getParameter("num");
		String num2= request.getParameter("num2");
		String id= request.getParameter("id");
		String pass= request.getParameter("pass");
		String email= request.getParameter("email");
		
		
		String useremailaddr= request.getParameter("useremailaddr");
		String autoemailaddr= request.getParameter("autoemailaddr");
		
		String addr= request.getParameter("addr");
		String addr2= request.getParameter("addr2");
		String phone= request.getParameter("phone");
		String job= request.getParameter("job");
		String SMS= request.getParameter("SMS");
		String items[]= request.getParameterValues("item");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\r\n" + 
				"\r\n" + 
				"<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\r\n" + 
				"");
		out.println("</head>");
		out.println("<body>");
		
		out.print("<table <span  width =\"850\" height=\"300\" align = \"center\" class=\"border border-danger\" border=\"1\">  </span>>");
		out.print("<tr>\r\n" + 
				"  	    <td ><div class=\"p-3 mb-2 bg-primary text-white\">이름: </div></td>");
		out.print("<td>"+"<div class=\"p-3 mb-2 bg-primary text-white\">"+name+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		<td><div class=\"p-3 mb-2 bg-secondary text-white\">주민등록번호: </div></td>");
		out.print("<td>"+"<div class=\"p-3 mb-2 bg-secondary text-white\">"+num+"</div>"+"-");
		out.print("<div class=\"p-3 mb-2 bg-secondary text-white\">"+num2+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		<td><div class=\"p-3 mb-2 bg-success text-white\">아이디: </div></td>");
		out.print("<td>"+"<div class=\"p-3 mb-2 bg-success text-white\">" +id+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		<td><div class=\"p-3 mb-2 bg-danger text-white\">비밀번호: </div></td>");
		out.print("<td>" +"<div class=\"p-3 mb-2 bg-danger text-white\">" +pass+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		<td><div class=\"p-3 mb-2 bg-info text-white\"> 이메일:  </div></td>");
		out.print("<td> "+"<div class=\"p-3 mb-2 bg-info text-white\">" +email+"</div>"+"@");
		
		if (autoemailaddr == null) {
			String email2 = useremailaddr;
			out.print("<div class=\"p-3 mb-2 bg-info text-white\">" +email2+"</div>" + "</td></tr>");
		} else {
			String email2 = autoemailaddr;
			out.print("<div class=\"p-3 mb-2 bg-info text-white\">" +email2+"</div>" + "</td></tr>");
		}
		
		out.print("<tr>\r\n" + 
				"  		<td><div class=\"p-3 mb-2 bg-light text-dark\"> 주소: </div></td>");
		out.print("<td>"+"<div class=\"p-3 mb-2 bg-light text-white\">"+addr+"</div>");
		out.print("<div class=\"p-3 mb-2 bg-light text-white\">"+addr2+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		<td> <div class=\"p-3 mb-2 bg-dark text-white\">핸드폰번호: </div></td>");
		out.print("<td>" +"<div class=\"p-3 mb-2 bg-dark text-white\">"+phone+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		<td><div class=\"p-3 mb-2 bg-white text-dark\">직업</div></td>\r\n" + 
				"  		<td>");
		out.print("<div class=\"p-3 mb-2 bg-white text-white\">"+job+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"        <td><div class=\"p-3 mb-2 bg-transparent text-dark\"> 메일/SMS정보수신:</div></td>\r\n" + 
				"        <td>");
		out.print("<div class=\"p-3 mb-2 bg-transparent text-white\">"+SMS+"</div>"+"</td></tr>");
		
		out.print("<tr>\r\n" + 
				"  		 <td>관심분야</td>\r\n" + 
				"  		 <td>");
		if (items == null) {
			out.print("선택한 항목이 없습니다</td></tr>");
		} else {
			for (String item : items) {
				out.print(item + " " + "</td></tr></table>");
			}
		}
		

		out.println("</b><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
