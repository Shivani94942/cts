<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" modelAttribute="user" method="post">
Email Address :<form:input path="email"/><br/><br/>
Password :<form:password path="password" /><br/><br/>
User Name :<form:input path="name"/><br/><br/>
Country:<form:select path="country">
<form:option value="select" label="select..."/>
<form:option value="India" label="India"/>
<form:option value="Italy" label="Italy"/>
<form:option value="US" label="US"/>
<form:option value="Honolulu" label="Honolulu"/>
</form:select><br/><br/>
<input type="submit" value="login" />
</form:form>
</body>
</html>