<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

.main {width:60%}
.main a{display:inline-block;border-radius:5px;padding:0 30px;line-height:40px;background:orange;color:#fff}
</style>
<script type="text/javascript">
function closeWin() {
	window.open('about:blank','_self').close();

	}

</script>
</script>
</head>
<body>
<h1>인사관리시스템</h1>
<div class="main">
<fieldset>
  <legend>인사관리 메인메뉴:</legend>
  <div><a href='read.jsp'> 조회 </a></div> <!-- read=list -->
  <div OnClick="location.href =''" style="cursor:pointer;">사원등록</div> <!-- create -->
  <div OnClick="location.href =''" style="cursor:pointer;">정보변경</div> <!-- update -->
  <div OnClick="location.href =''" style="cursor:pointer;">퇴사처리</div> <!-- delete -->
  <div id="colse" onclick="closeWin();return false;" style="cursor:pointer;">종료</div>
 </fieldset>

</div>
</body>
</html>