<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

The student registration is confirmed......!
<br>
<br>
Student name : ${student.firstName} ${student.lastName}

<br><br>

Email Id : ${student.email}

<br><br>

Student age : ${student.age}

<br><br>

Postal code : ${student.zipCode}

<br><br>

Country : ${student.country}

<br><br>

Favorite Language : ${student.favLanguage}

<br><br>

Operating Systems :

<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">

		<li> ${temp} </li>

	</c:forEach>
</ul>

</body>

</html>