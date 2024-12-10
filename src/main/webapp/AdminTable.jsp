<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href = "CSS/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Number</th>
      <th scope="col">Message</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="con" items="${contact}">
    	<tr>
    		<td>${con.name}</td>
    		<td>${con.email}</td>
    		<td>${con.number}</td>
    		<td>${con.message}</td>
    		<td>
    		<form action="SingleDataButton" method="post">
    		<input type="hidden" name="email" value="${con.email}">
    		<button type="submit">data</button>
    		</form>
    		</td>
    		
    		<td>
    		<form action="DeleteContact" method="post">
    			<input type="hidden" name="email" value="${con.email}">
    			<button type="submit">Delete</button>
    		
    		</form>
    		</td>
    	</tr>
    </c:forEach>
  </tbody>

</table>
</body>
</html>