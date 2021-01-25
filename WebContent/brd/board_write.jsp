<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
<script src="../js/bootstrap.js"></script>
<meta charset="UTF-8">
<title>board_write page</title>
</head>
<body>
<form action="/board/boardWritePro.do">
		<div class="input-group mb-3">
			<span class="input-group-text" id="inputGroup-sizing-default">제목</span>
			<input type="text" class="form-control" name="title"
				aria-label="Sizing example input"
				aria-describedby="inputGroup-sizing-default">
		</div>
			<div class="input-group mb-3">
			<span class="input-group-text" id="inputGroup-sizing-default">작성자</span>
			<input type="text" class="form-control" name="writer"
				aria-label="Sizing example input"
				aria-describedby="inputGroup-sizing-default">
		</div>
		<div>
			<textarea rows="5" cols="200" name="content"></textarea>	
		</div>
		
		<input type="submit" value="업로드">
		<input type="reset" value="취소">
	</form>
</body>
</html>