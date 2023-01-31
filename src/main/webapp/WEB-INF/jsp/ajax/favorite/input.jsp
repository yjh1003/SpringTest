<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<h2>즐겨 찾기 추가하기</h2>
		<label>제목</label>
		<input type="text" class="form-control" id="nameInput"><br>
		
		<label class="mt-3">주소</label>
		<div class="d-flex">
			<input type="text" class="form-control" id="urlInput"><br>
			<button type="button" id="duplicateBtn" class="btn btn-info">중복확인</button><br>
		</div>
		<button type="button" id="addBtn" class="btn btn-success btn-block mt-3">추가</button>
	</div>

	<script>
		$(document).ready(function() {
			
			
			$("#duplicateBtn").on("click", function() {
				let url = $("#urlInput").val();
				if(url == "") {
					alert("주소를 입력하세요!");
					return ;
				}
				
				// https://, http://
				// http 로 시작하지 않고 https로 시작하지 않으면
				// if(!url.startsWith("http://") && !url.startsWith("https://")) {
				if(!(url.startsWith("http://") || url.startsWith("https://"))) {
					alert("주소 형식이 잘못되었습니다.");
					return;
					
				}
				
				$.ajax({
					type:"post"
					, url:"/ajax/favorite/is_duplicate_url"
					, data:{"url":url}
					, success:function(data) {
											
						if(data.is_duplicate_url) {
							alert("중복된 url입니다.");
						} else {
							alert("사용 가능한 url입니다.");
						}
					
					  }
					, error:function() {
						alert("url 중복확인 에러")
					}
				});
				
			});
				
			
			$("#addBtn").on("click", function() {
				let name = $("#nameInput").val();
				let url = $("#urlInput").val();
				
				if(name == "") {
					alert("이름 입력하세요");
					return;
				}
				
				if(url == "") {
					alert("주소를 입력하세요");
					return;
				}
				
				
				// https://, http://
				// http 로 시작하지 않고 https로 시작하지 않으면
				// if(!url.startsWith("http://") && !url.startsWith("https://")) {
				if(!(url.startsWith("http://") || url.startsWith("https://"))) {
					alert("주소 형식이 잘못되었습니다.");
					return ;
				}
			
		
			
			$.ajax({
				type:"post"
				, url:"/ajax/favorite/add"
				, data:{"name":name, "url":url}
				, success:function(data) {
					// 성공시 : {"result":"success"}
					// 실패시 : {"result":"fail"}
					if(data.result == "success") {
						location.href = "/ajax/favorite/list";
					} else {
						alert("추가 실패")
					}
				}
				, error:function() {
					alert("추가 에러");
				}
			});
				
		});
			
	});
	</script>
</body>
</html>