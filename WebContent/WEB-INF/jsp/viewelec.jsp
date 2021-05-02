<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consumer List</title>
<style type="text/css">
body{
background-color:LightCyan;
text-align:center;

}
h1
{
font-family:forte;
color:MediumSlateBlue;
}
a:link
{
text-decoration:none;
color:green;
}
a:hover
{
color:red;
}

</style>
</head>
<body>
<h1>Consumer List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>conId</th><th>conName</th><th>amt</th><th>edit</th><th>delete</th></tr>
<c:forEach var="elec" items="${list}">   
   <tr>  
   <td>${elec.conId}</td>  
   <td>${elec.conName}</td>  
   <td>${elec.amt}</td>
   <td><a href="editbill/${elec.conId}">Edit</a></td>
   <td><a href="deletebill/${elec.conId}">Delete</a></td>  
   </tr>  
   </c:forEach>

</table>
<br>
<a href="elecform">Add Consumer List</a>

</body>
</html>