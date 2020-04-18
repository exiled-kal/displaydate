<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Time</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/timeapp.js"></script>
	</head>
	<body>
		<h1 id="greenbox"><c:out value="${time}"/></h1>
	</body>
</html>