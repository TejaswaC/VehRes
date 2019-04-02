<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.14.1/moment.min.js"></script>
</head>
<body>
<script>var m = moment().format("DD/MM/YYYY");
document.write(m);
/* var t = document.getElementById('superman').value; */
document.write(t);</script>
<a href="addVehicles.html">Add Product</a>
<br>
<table border="1" >
<tr>
<td> <center> <span style="color:gray">Vehicle Number</span>
</td>
<td> <center> <span style="color:gray">Branch</span>
</td>
<td> <center> <span style="color:gray">Insurance Expiry</span>
</td>
<td> <center> <span style="color:gray">Last Service</span>
</td>
<td> <center> <span style="color:gray">Service Due</span>
</td>
<td> <center> <span style="color:gray">Vehicle Type</span>
</td>
</tr>
<c:forEach var="vehicle"  items="${vehicle}">
<tr>
<td> <center> <span style="color:gray">${vehicle.vehicleNumber}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.branch}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.insuranceExpiry}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.lastService}</span>
</td>
<td> <center> <span style="color:gray">${veh	icle.serviceDue}<br><script> 
document.write(x)</script></span>
</td>
<td> <center> <span style="color:gray">${vehicle.vehicleType}</span>
</td>
</td>
<%-- <c:set property="${vehicle.vehicleNumber}" var="vehNumber" ></c:set> --%>
<%-- <fmt:parseNumber var="vehNumber" value="${vehicle.vehicleNumber}" integerOnly="true"/>
<fmt:parseNumber var="vehNumber" integerOnly="true" type="number" value="${vehicle.vehicleNumber}" /> --%> 
<td> <center> <span style="color:gray"><a href="updateVehicle.html?id=${vehicle.vehicleNumber}">Update</a></span>
</td>
</tr>
</c:forEach>


</table>
</body>
</html>