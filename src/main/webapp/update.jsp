<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="UpdateContact">

<div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" name="name" value="${param.name}">
  <label for="floatingInput">Name</label>
</div>
<div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" name="email" value="${param.email}">
  <label for="floatingInput">Email address</label>
</div>
<div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" name="number" value="${param.number}">
  <label for="floatingInput">Contact_Number</label>
</div>
<div class="form-floating">
  <input type="text" class="form-control" id="floatingPassword" name="message" value="${param.message}">
  <label for="floatingPassword">Message</label>
</div>
	<button type="submit" class="btn btn-secondary">Submit</button>


</form>
</body>
</html>