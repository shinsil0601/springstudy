<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring MVC project</title>
<link rel="icon" type="image/x-icon" href="resources/images/123.PNG">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var loginChk = "${loginChk}";
		if(loginChk == "fail") {
			alert("비밀번호틀림");
			return ;
		}else if(loginChk == "ok") {
			$("#login").css("display","none");      // 감추기
			$("#login_ok").css("display", "block"); // 나타내기
		}
	});
</script>	
<script type="text/javascript">
	function go_members() {
		location.href= "/members_list.do"; 
	}
	function go_guestbook() {
		location.href= "/guestbook_list.do" ;
	}
	function go_guestbook2() {
		location.href= "/guestbook2_list.do" ;
	}
	function reg_add_go() {
		location.href= "/member_reg.do";
	}
	function member_logout_go() {
		location.href= "/member_logout.do";
	}
	function go_bbs() {
		location.href= "/bbs_list.do";
	}
	function go_board() {
		location.href= "/board_list.do";
	}
	function go_shop() {
		location.href= "/shop_list.do";
	}
</script>
</head>
<body>
	<button onclick="go_members()">Members</button>
	<button onclick="go_guestbook()">GuestBook</button>
	<button onclick="go_guestbook2()">GuestBook2</button>
	<button onclick="go_bbs()">BBS</button>
	<button onclick="go_board()">Board</button>
	<button onclick="go_shop()">Shop</button>
	<br><br><br><br>
	
	<hr>
	
	<!-- 
		div로 감싼이유는 로그인성공시 이 화면단이 안보이게 하려고함. 로그인하면 다시 인덱스로 와야해서.
	 -->
	<div id="login" style="margin: 30px;">
		<form action="/member_login.do" method="post">
			<p>ID: <input type="text" name="m_id" required></p>
			<p>PW: <input type="password" name="m_pw" required></p>
			<input type="submit" value="로그인">
		</form>	
	</div>
	<div id="login_ok" style="display:none;">
		<h2>${mvo.m_id }님 로그인 성공</h2>
		<button onclick="member_logout_go()">로그아웃</button>
	</div>
	<div id="btns" style="margin: 30px;">
	<button onclick="reg_add_go()">회원가입</button>
	<button onclick="id_find_go()">아이디 찾기</button>
	<button onclick="pw_find_go()">비번 찾기</button>
	</div>
	
</body>
</html>