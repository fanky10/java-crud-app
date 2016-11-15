<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<c:url value="/login"/>" method="POST">
	<input name="username" type="text">
	<input name="password" type="password">
	<input name="submit" type="submit">
</form>
<c:if test="${not empty errorMessage}">
	<c:out value="${errorMessage}"/>
</c:if>
</body>
</html>