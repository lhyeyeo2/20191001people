<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>

.main {width:60%}

</style>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>인사관리조회화면</h1>
	<div class="main">
	<fieldset>
	<legend>인사관리조회</legend>
	<input type="radio" name="read" value="readid"/>사원번호로 조회 
	<input type="text" name="id" value=""/>
	<input type="radio" name="read" value="dept"/>부서명으로 조회 
	&nbsp; <select id="dept" name="dept"> 
		<option value="인사부">인사부</option>
		<option value="기획부">기획부</option>
		<option value="홍보부">홍보부</option>
		<option value="영업부">영업부</option>
		<option value="경리부">경리부</option>
	</select>
	
	</fieldset>
	</div>
</body>
</html>