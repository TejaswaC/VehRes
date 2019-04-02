<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Welcome To Homepage</title>
<script>var today = new Date(); var cdate;var kdate</script>
</head>
<body>
<h1>Welcome To Homepage ${user.firstName}</h1>
<a href="update.html">Update</a>
<br>
<br>
<br>
<br>
<br>
<form action="search.html" method="post">
<input list="criteria" name="criteria">
  <datalist id="criteria">
    <option value="Vehicle Number">Vehicle Number</option>
    <option value="Branch">Branch</option>
    <option value="Insurance Expiry">Insurance Expiry</option>
    <option value="Service Due">Service Due</option>
    <option value="Last Service">Last Service</option>
    <option value="Vehicle Type">Vehicle Type</option>
  </datalist>
  <input type="text" name="Value">
  <button type="submit">Search</button>
</form>
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
<c:forEach var="vehicles" items="${vehicles}"  >
<tr>
<div id="color_change">
<td> <center> <span style="color:gray">${vehicles.vehicleNumber}</span>
</td>
<td> <center> <span style="color:gray">${vehicles.branch}</span>
</td>
<td> <center> <span style="color:gray"><p id="a">${vehicles.insuranceExpiry}<div></span></center>
</td>
<td> <center> <span style="color:gray">${vehicles.lastService}</span>
</td>
<td> <center> <span style="color:gray">${vehicles.serviceDue}</span>
</td>
<td> <center> <span style="color:gray">${vehicles.vehicleType}</span></center></div>
<script>cdate= document.getElementById("a").innerHTML;
/* document.write(cdate); 
 */
 kdate= cdate.replace(/-/g,"/"); 
 pdate = new Date(kdate);
/* document.write(pdate);
 */var ddiff= ((today.getTime()-pdate.getTime())/ (1000 * 3600 * 24)); document.write("The days difference are"+ddiff); 
	if(ddiff<=15)
		{document.getElementById("a").style.color = "#ff0000";
		}
 
</script>
</td>
</td>
</tr>
</c:forEach>


</table>
<script>
/* document.write(today) */;
</script>
</body>
</html>