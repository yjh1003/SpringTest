<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta charset="utf-8">
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
        <div id="wrap" >
            <header class="mt-4">
                <div class="text-center display-4">통나무 팬션</div>
                <nav class="main-menu">
	                <ul class="nav nav-fill w-100">
	                    <li class="nav-item"><a href="#" class="nav-link text-white">팬션소개</a></li>
	                    <li class="nav-item"><a href="#" class="nav-link text-white">객실보기</a></li>
	                    <li class="nav-item"><a href="/ajax/booking/input" class="nav-link text-white">예약안내</a></li>
	                    <li class="nav-item"><a href="/ajax/booking/list" class="nav-link text-white">커뮤니티</a></li>
	                </ul>
	            </nav>
            </header>

            <section class="banner">
                <img src="http://marondal.com/material/images/dulumary/web/front/jquery/test06_banner1.jpg" id="bannerImage">
            </section>
            <section class="d-flex">
                <article class="reservation d-flex justify-content-center align-items-center">
                    <div class="display-4">
                        실시간 <br>
                        예약 하기 
                    </div>
                </article>
                <article class="reservation-confirm">
                    <div class="m-4">
                        <div class="d-flex align-items-end">
                            <h3 class="mr-4">예약 확인</h3>
                        
                        </div>
                    

                        <div class="no-member-input mt-3y" id="nonMember">
                            <div class="input-gorup form-inline">
                                <label class="input-label">이름 </label>
                                <input type="text" id="nameInput" class="form-control text-input">
                            </div>
                            <div class="input-gorup form-inline mt-3">
                                <label class="input-label">전화번호 </label>
                                <input type="text" id="phoneNumberInput" class="form-control text-input">
                            </div>
                       
                        </div>
                        <div class="d-flex justify-content-end">
                            <button class="btn btn-success mt-3 mr-5" id="findBtn">조회 하기</button>
                        </div>
                    </div>
                </article>
                <article class="reservation-call d-flex justify-content-center align-items-center">
                    <div>
                        <h3>예약문의 : </h3>
                        <h1>010-</h1>
                        <h1>000-1111</h1>
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
	<script>
		$(document).ready(function() {
			$("#findBtn").on("click", function() {
				let name = $("#nameInput").val();
				let phoneNumber = $("#phoneNumberInput").val();
				
				$.ajax({
					type:"get"
					, url:"/ajax/booking/find"
					, data:{"name":name, "phoneNumber":phoneNumber}
					, success:function(data) {
						
						if(data.result == "fail") {
							alert("조회대상이 없습니다.");
						} else {
													
							alert("이름 : " + data.booking.name + 
									"\n날짜 : " + data.booking.date.substring(0, 10) + 
									"\n일수 : " + data.booking.day + 
									"\n인원 : " + data.booking.headcount + 
									"\n상태 : " + data.booking.state);
						}
						
					}
					, error:function() {
						alert("조회 에러");
					}
				});
				
				
			});
			
		});
	
	</script>

    </body>
</html>