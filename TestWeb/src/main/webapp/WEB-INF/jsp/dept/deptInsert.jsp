<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function validationForm(){
		if(deptFrm.deptId.value == ""){
			alert("부서번호를 입력하세요.")
			return
		}
		deptFrm.submit();
	}
</script> 
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp" />
<form action="deptInsert" name="deptFrm" method="post">
	<label for="deptId">부서번호</label>
	<input type="text" name="deptId"><br>
	<label for="deptName">부서명</label>
	<input type="text" name="deptName"><br>
	<label for="mngId">담당자</label>
	<input type="number" name="mngId"><br>
	<label for="locId">위치</label>
	<input type="number" name="locId"><br>
	
	<button type="submit" onclick="validationForm()">부서등록</button>
</form>
</body>
</html>