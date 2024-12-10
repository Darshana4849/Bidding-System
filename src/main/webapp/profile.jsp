<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>My profile</h1>


<c:set var = "con" value="${contact}"/>
<fieldset disabled>
<div class="form-floating mb-3">
  <input type="text" class="input-field" id="floatingInput" name="name" value="${con.name}" placeholder="Name">
  <label for="floatingInput">Name</label>
</div>
<div class="form-floating mb-3">
  <input type="email" class="input-field" id="floatingInput" name="email" value="${con.email}" placeholder="Email">
  <label for="floatingInput">Email address</label>
</div>
<div class="form-floating mb-3">
  <input type="text" class="input-field" id="floatingInput" name="number" value="${con.number}" placeholder="Contact_Number">
  <label for="floatingInput">Contact_Number</label>
</div>
<div class="form-floating">
  <input type="text" class="input-field" id="floatingPassword" name="message" value="${con.message}" placeholder="Message">
  <label for="floatingPassword">Message</label>
</div>
</fieldset>
<form action="update.jsp" method="post">
	<input type="hidden" name="name" value="${con.name}">
	<input type="hidden" name="email" value="${con.email}">
	<input type="hidden" name="number" value="${con.number}">
	<input type="hidden" name="message" value="${con.message}">
	
	<input type="submit" value="Update">
</form>

</body>
</html>