<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li> method   : <%=request.getMethod() %>
	<li> url      : <%=request.getRequestURL() %>
	<li> uri      : <%=request.getRequestURI() %>
	<li> protocol : <%=request.getProtocol() %>
	<li> query str: <%=request.getQueryString() %> 
	<li> ip addr  : <%=request.getRemoteAddr() %>
	<li> parameter: <%=request.getParameter("name") %>
	<li> id       : <%=request.getAttribute("id") %>
<%-- 	<li> array    : <%=ArrayList list = (ArrayList)request.getAttribute("arr") %> --%>
</ul>
</body>
</html>