<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	
	<table>
	<c:forEach var="emp" items="${empDetails}">
	
	<c:set var="id" value="${emp.id}"/>
	<c:set var="name" value="${emp.name}"/>
	<c:set var="email" value="${emp.email}"/>
	<c:set var="phone" value="${emp.telephone}"/>
	<c:set var="username" value="${emp.userName}"/>
	<c:set var="password" value="${emp.password}"/>
	
	<tr>
		<td>Employee ID</td>
		<td>${emp.id}</td>
	</tr>
	<tr>
		<td>Employee Name</td>
		<td>${emp.name}</td>
	</tr>
	<tr>
		<td>Employee Email</td>
		<td>${emp.email}</td>
	</tr>
	<tr>
		<td>Employee Phone</td>
		<td>${emp.telephone}</td>
	</tr>
	<tr>
		<td>Employee User Name</td>
		<td>${emp.userName}</td>
	</tr>
	<tr>
		<td>Employee Password</td>
		<td>${emp.password}</td>
	</tr>
	
		
	</c:forEach>
	</table>
	
	<c:url value="updateemployee.jsp" var="empupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
		
	<a href="${empupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br><br>


	<c:url value="deleteemployee.jsp" var="empdelete">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="phone" value="${phone}" />
		<c:param name="uname" value="${username}" />
		<c:param name="pass" value="${password}" />
	</c:url>
		
	
	<a href="${empdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	
	
	
</body>
</html>