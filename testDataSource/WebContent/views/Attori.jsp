<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Pagina attori utility</h1>
	
	<form action="../ControllerActor" method="post">	
		<table border="1">
			<tr>
				<td><input type="text" name="nomeAttore"></td>
				<td><b>inserisci il nome dell'attore </b></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="invia"></td> 
				<td><input type="reset" value=azzera></td>
			</tr>
		</table>
		<br><br>
		<table border="1">
			<tr>
				<td><input type="text" value="actor_id"> </td>
				<td><b>inserisci l'id dell'attore <br>
						che vuoi eliminare</b></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="EliminaId" style="align:center"></td>
			</tr>	
		</table>
	

		
	</form>
</body>
</html>