<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

</head>
<body>
<h2>Welcome page</h2>

<div class="container">
	<div class="responsive table">
		<table class="table">
  <thead>
    <tr>
      <th scope="col">Email</th>
      <th scope="col">Address</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">${loggedUser.getEmail() }</th>
      <td>${loggedUser.getAddress() }</td>
      <td>${loggedUser.getAge() }</td>
    </tr>
  </tbody>
</table>
	</div>
</div>
</body>
</html>