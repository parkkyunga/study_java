<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
div{
background-color: sky;
font-size: 20px;
}
</style>
<body>
<%-- <jsp:include page="/WEB-INF/jsp/header.jsp" /> --%>
<script type="text/javascript">
	alert('<%=request.getAttribute("msg") %>')
	location.href='empList';

</script>
<div></div>

</body>
</html>