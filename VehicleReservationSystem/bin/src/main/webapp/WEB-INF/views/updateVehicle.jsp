<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Vehicle</title>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
</head>
<body>
<form action="updateVehicle1.html" method="POST">
  Vehicle Number: <br>
  <input type="text" name="vehicleNumber" value="${vehicle.vehicleNumber}" readonly="readonly"><br>
  
  Branch:<br>
  <input type="text" name="branch" ><br>
  <br>
  Vehicle Type:<br>
  <input type="text" name="vehicleType" ><br>
  <br>
  Insurance Expiry:<br>
  <input type="text" name="insuranceExpiry" value=""><br>
  <br>
  Last Service:<br>
  <input type="text" name="lastService" value=""><br>
  <br>
  Service Due Date:<br>
  <input type="text" name="serviceDue" value=""><br>
  <br>
  <input type="submit" value="Submit">
</form>
</body>
</html>