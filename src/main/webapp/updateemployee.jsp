<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");		
	%>

	<form action="update" method="post">
		<table>
			<tr>
				<td>Employee ID</td>
				<td><input type="text" name="empid" value="<%= id %>" readonly></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<%= name %>"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%= email %>"></td>
			</tr>
			<tr>
				<td>Phone number</td>
				<td><input type="text" name="phone" value="<%= phone %>"></td>
			</tr>
			<tr>
				<td>User name</td>
				<td><input type="text" name="uname" value="<%= userName %>"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass" value="<%= password %>"></td>
			</tr>		
		</table>
		
	<br>
	<input type="submit" name="submit" value="Update My Data">
	
	</form>
	

	
</body>
</html>


<!--  		
	<form action="update" method="post">
		Employee ID<input type="text" name="empid" value="<%= id%>" readonly> <br>
		Name <input type="text" name="name" value="<%= name%>"> <br>
		Email <input type="text" name="email" value="<%= email%>"> <br>
		Phone number <input type="text" name="phone" value="<%= phone%>"> <br>
		User Name <input type="text" name="uname" value="<%= userName%>"> <br>
		Password <input type="password" name="pass" value="<%= password%>"> <br>
		
		<input type="submit" name="submit" value="Update My Data"> <br>
		
	</form>
-->