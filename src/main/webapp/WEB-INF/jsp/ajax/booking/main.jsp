<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션</title>
		<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

        
        <link rel="stylesheet" href="/booking/style/style.css" type="text/css">
</head>
<body>
		<div id="wrap">
            <header class="d-flex justify-content-center align-items-center">
                <div class="display-4">통나무 팬션</div>
            </header>
            <nav class="main-menu">
                <ul class="nav nav-fill w-100">
                    <li class="nav-item"><a href="#" class="nav-link text-white">팬션소개</a></li>
                    <li class="nav-item"><a href="#" class="nav-link text-white">객실보기</a></li>
                    <li class="nav-item"><a href="#" class="nav-link text-white">예약안내</a></li>
                    <li class="nav-item"><a href="#" class="nav-link text-white">커뮤니티</a></li>
                </ul>
            </nav>
            <section class="contents">
                <article class="main-banner">
                    <div>
                        <img id="mainBanner" src="image/test06_banner1.jpg" alt="팬션외관 이미지">
                    </div>
                </article>
                <article class="main-info d-flex">
                    <div class="reservation col-4 d-flex justify-content-center align-items-center">
                        <div class="display-4 text-white">
                            실시간<br> 예약 하기
                        </div>
                    </div>
                    <div class="confirm col-5 p-4">
                        <div class="d-flex align-items-end text-white">
                            <h3 class="mr-3">예약 확인</h3>
                            <label>회원 <input type="radio" name="member" checked value="member"></label>
                            <label class="ml-2">비 회원 <input type="radio" name="member" value="nonMember"></label>
                        </div>
                        <div class="text-white mt-3" id="memberInput">
                            <div class="d-flex">
                                <label class="col-3">아이디: </label>
                                <input type="text" class="form-control col-9" id="idInput">
                            </div>
                            <div class="d-flex mt-2">
                                <label class="col-3">비밀번호: </label>
                                <input type="text" class="form-control col-9" id="passwordInput">
                            </div>

                        </div>

                        
                        <div class="text-white d-none" id="nonMemberInput">
                            <div class="d-flex mt-3">
                                <label class="col-3">이름: </label>
                                <input type="text" class="form-control col-9" id="nameInput">
                            </div>
                            <div class="d-flex">
                                <label class="col-3">전화번호: </label>
                                <input type="text" class="form-control col-9" id="phoneNumberInput">
                            </div>
                            <div class="d-flex">
                                <label class="col-3">날짜: </label>
                                <input type="text" class="form-control col-9" id="date">
                            </div>
                        </div>

                        <div class="d-flex justify-content-end mt-3">
                            <button type="button" class="btn btn-success" id="lookUpBtn">조회하기</button>
                        </div>

                    </div>
                    <div class="d-flex justify-content-center align-items-center contact col-3">
                        <div class="text-white">
                            <h2>예약문의 : </h2>
                            <h1>010-<br>000-1111</h1>
                        </div>    
                    </div>

                </article>
            </section>
            
            <footer class="mt-3 ml-4">
                <address>
                    제주특별자치도 제주시 애월읍  <br>
                    사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목 <br>
                    Copyright 2025 tongnamu All right reserved
                </address>

            </footer>
        </div>

</body>
</html>