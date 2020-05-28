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
	
	
	document.getElementById("inputEmail4").value = sessionStorage.getItem("email");
	document.getElementById("address").value = sessionStorage.getItem("address");
	document.getElementById("city").value = sessionStorage.getItem("city");
	document.getElementById("age").value = sessionStorage.getItem("age");
	document.getElementById("zip").value = sessionStorage.getItem("zip");

	
	sessionStorage.clear();

});

</script>

</head>
<body>

<div class="container">
<h2>Edit page</h2>


<form method="post" action="/user/update">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="firstName">First name</label>
      <input type="text" class="form-control" id="firstName" placeholder="First Name" name="first_name">
    </div>
    <div class="form-group col-md-6">
      <label for="lastName">Last name</label>
      <input type="text" class="form-control" id="lastName" placeholder="Last Name" name="last_name">
    </div>
  </div>


  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email" name="email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="text" class="form-control" id="inputPassword4" placeholder="Password" name="password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="address">
  </div>
  <div class="form-row">
    <div class="form-group col-md-4">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity" name="city">
    </div>
    <div class="form-group col-md-4">
      <label for="zip">Zip</label>
      <input type="text" class="form-control" id="zip" name="zip">
    </div>
    <div class="form-group col-md-4">
      <label for="age">Age</label>
      <input type="number" class="form-control" id="age" name="age" min="18" max="65" value="18">
    </div>
  </div>
  

  <button type="submit" class="btn btn-primary">Create User</button>
</form>

</div>


</body>
</html>