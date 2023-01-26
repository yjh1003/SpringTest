<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 정보 페이지</title>

	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<link rel="stylesheet" href="/weather/style/style.css" type="text/css">
	
</head>
<body>
	<div id="wrap">
	<section class="contents d-flex">
		<nav class="main-menu bg-warning">
			<div class="d-flex mt-2 justify-content-center">
				<div class="col-2">
					<img width="25" src="https://img.newspim.com/news/2021/09/29/2109291345053060.jpg">
				</div>
				<h4 class="text-white col-7">기상청</h4>
			</div>
			<ul class="nav flex-column">
				<li class="nav-item"><a class="nav-link navbar-dark" href="#">기상청</a></li>
                <li class="nav-item"><a class="nav-link" href="#">날씨</a></li>
                <li class="nav-item"><a class="nav-link" href="#">날씨입력</a></li>
                <li class="nav-item"><a class="nav-link" href="#">테마날씨</a></li>
                <li class="nav-item"><a class="nav-link" href="#">관측 기후</a></li>
            </ul>
		</nav>
		<article class="main-contents container bg-success">
			<h2>과거 날씨</h2>
			<table class="table text-center">
				<thead>
					<tr>
						<th>날짜</th>
						<th>날씨</th>
						<th>기온</th>
						<th>강수량</th>
						<th>미세먼지</th>
						<th>풍속</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>2015년 7월 1일</td>
						<td>구름</td>
						<td>21.9</td>
						<td>83.5mm</td>
						<td>보통</td>
						<td>2.9km/h</td>
					</tr>
				</tbody>
			</table>
		</article>
	</section>
	<footer class="d-flex">
	<div class="Logo bg-info mt-3 ml-3">
		<img width="120" src="">
	</div>
	<div class="copyright bg-primary">
		<div class="text-secondary small">
		서울시 동작구 여의방대로</div>
	</div>
	</footer>
	</div>
</body>
</html>