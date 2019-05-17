<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import="java.util.List" %>
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="it.sincrono.corso.model.Actor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Esito ricerche</h1>
<hr>

	<table border="1">
		<tr>
			<td> Cognome Attore</td>
			<td>Nome Attore</td>
		
		</tr>
	
	<%
		List<Actor> list=(ArrayList)request.getAttribute("AttoriByName");	
		
	if(list!=null && !list.isEmpty()){
		for(int i=0;i<list.size();i++){
			out.println("<tr>");
			out.println("<td>"+list.get(i).getFirst_Name()+"</td>");
			out.println("<td>"+list.get(i).getName()+"</td>");
			out.println("</tr>");
		}
	}
	else{
		out.println("<h2>Attore non trovato</h2>");
	}
	%>
	
	
	</table>
</body>
</html>