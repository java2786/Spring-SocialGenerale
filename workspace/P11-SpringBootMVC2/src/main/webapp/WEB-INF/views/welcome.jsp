<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<script>

document.addEventListener("DOMContentLoaded", function(event) {
	console.log("in save func");
	
	sessionStorage.setItem("email", "${userObj.getEmail()}");
	sessionStorage.setItem("address", "${userObj.getAddress()}");
	sessionStorage.setItem("city", "${userObj.getCity()}");
	sessionStorage.setItem("age", "${userObj.getAge()}");
	sessionStorage.setItem("zip", "${userObj.getZip()}");

});

</script>
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
      <th scope="row">${userObj.getEmail() }</th>
      <td>${userObj.getAddress() }</td>
      <td>${userObj.getAge() }</td>
    </tr>
  </tbody>
</table>
	</div>





<a href="/user/remove/${userObj.getEmail()}"><Button class="btn-danger">Delete Account</Button></a>
<a href="/user/update"><Button class="btn-primary">Edit User</Button></a>


</div>
</body>
</html>