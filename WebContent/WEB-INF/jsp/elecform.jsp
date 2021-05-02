<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Consumer</title>
<style type="text/css">
body{
background-color:LightCyan;
text-align:center;

}
h1,td
{
font-family:forte;
color:MediumSlateBlue;
}

</style>
</head>
<body>
<h1>Add Consumer Bill Details</h1>
<form:form method="post" action="save">
<table >    
             <tr>    
              <td>Consumer Id : </td>   
              <td><form:input path="conId" /></td>  
             </tr>    
             <tr>    
              <td>Consumer Name :</td>    
              <td><form:input path="conName" /></td>  
             </tr>   
             <tr>    
              <td>Bill Amount :</td>    
              <td><form:input path="amt" /></td>  
             </tr>   
             <tr>    
              <td> </td>    
              <td><input type="submit" value="Save" /></td>    
             </tr>    
            </table>    
           
   </form:form>    
</body>
</html>