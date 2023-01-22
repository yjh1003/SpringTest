<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt 라이브러리</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
	<h2>1. 후보자 득표율</h2>
		<table class="table text-center">
		<thead>
			<tr>
				<th>기호</th>
				<th>득표수</th>
				<th>득표율</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="candidate" items="${candidates }" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td><fmt:formatNumber value="${candidate }"/></td>
				<td><fmt:formatNumber value="${candidate / 1000000}" type="percent"/></td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
	
	<div class="container">
	<h2>2. 카드 명세서</h2>
		<table class="table text-center">
		<thead>
			<tr>
				<th>사용처</th>
				<th>가격</th>
				<th>사용 날짜</th>
				<th>할부</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="card" items="${cardBill }">
			<tr>
				<td>${card.store }</td>
				<td><fmt:formatNumber value="${card.pay }" type="currency" /></td>
				<fmt:parseDate value="${card.date }" pattern="yyyy-MM-dd" var="usedate"/>
				<td><fmt:formatDate value="${usedate }" pattern="yyyy년 M월 d일"/></td>
				<td>${card.installment }</td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>

</body>
</html>