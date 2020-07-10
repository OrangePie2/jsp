<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="member.js"></script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>



</head>

<body>


 <div class="container">
    <div class="row">
    <div class="col-sm-12 text-center" >
    <div class="col-sm-3"></div>
     
    <div class="col-sm-6">
    <h2>회원가입</h2>

<form method="get" action="memberServlet" name="frm">



<table <span align = "center" class="table table-boardered"   width ="10000" height="300" border="1">  </span>>

  	    <tr class="table-primary">
  	    <td ><div class="p-3 mb-2 bg-primary text-white">이름: </div></td>
  	    <td><input size="40" type="text" name="name" id="username" class="p-3 mb-2 bg-primary text-white"></td>
  	    </tr>
  	    
  		<tr class="table-success">
  		<td><div class="p-3 mb-2 bg-secondary text-white"><font size="0.1em" >주민등록번호 </font></div></td>
  		<td> <input size="15" type="text" name="num" id="usernum" class="p-3 mb-2 bg-secondary text-white">-<input size="15" type="text" name="num2" id="usernum2" class="p-3 mb-2 bg-secondary text-white">
  		</td></tr>
  		
  		<tr class="table-danger">
  		<td><div class="p-3 mb-2 bg-success text-white">아이디: </div></td>
  		<td> <input type="text" name="id" class="p-3 mb-2 bg-success text-white"></td>
  		</tr>
  		
  		<tr class="table-warning">
  		<td><div class="p-3 mb-2 bg-danger text-white"><font size="0.1em" >비밀번호</font></div></td>
  		<td><input type="password" name="pass" id="userpwd" class="p-3 mb-2 bg-danger text-white"></td>
  		</tr>
  		
  		<tr class="table-info">
  		<td><div class="p-3 mb-2 bg-warning text-dark"><font size="0.1em" >비밀번호확인</font></div></td>
  		<td><input class="p-3 mb-2 bg-warning text-dark" type="password" name="pass2"></td>
  		</tr>
  		
  		<tr class="table-dark">
  		<td><div class="p-3 mb-2 bg-info text-white"> 이메일:  </div></td>
  		<td> <span style="float: left; margin-right: 20px">
  		<input type="text" name="email" class="p-3 mb-2 bg-info text-white"> @ <input type="text" name="useremailaddr" class="p-3 mb-2 bg-info text-white"> 
  		<label for="autoemailaddr"></label>
  		<select id="autoemailaddr" name="autoemailaddr" size='1'>
  		        <option value=null>선택하세요</option>
  				<option value="naver.com">naver.com</option>
  				<option value="gmail.com">gmail.com</option>
  				<option value="daum.net">daum.net</option>
  		</select>
  		</span>
        </td>
        </tr>
        
  		<tr class="table-primary">
  		<td><div class="p-3 mb-2 bg-light text-dark"> 주소: </div></td>
  		<td><input type="text" name="addr" class="p-3 mb-2 bg-light text-dark"> &nbsp; <input type="text" name="addr2" class="p-3 mb-2 bg-light text-dark"></td>
  		</tr>
  		
  		<tr class="table-danger">
  		<td> <div class="p-3 mb-2 bg-dark text-white">핸드폰번호: </div></td>
  		<td><input type="text" name="phone" class="p-3 mb-2 bg-dark text-white">
  		</tr>
  		
  		<tr class="table-warning">
  		<td><div class="p-3 mb-2 bg-white text-dark">직업</div></td>
  		<td>
  		<span style="float: left; margin-right: 20px">
  		<label for="job"></label>
        <select id="job" name="job" size='2'>
  				<option value="공무원">공무원</option>
  				<option value="학생">학생</option>
  				<option value="백수">백수</option>
  		</select>
  		</span>
        </td>
        </tr>
        
        <tr class="table-info">
        <td><div class="p-3 mb-2 bg-transparent text-dark"> 메일/SMS정보수신:</div></td>
        <td>
  		<label for="SMS">
  		</label>
  		<input type = "radio" id="SMS" name="SMS" value="수신" checked>수신
  		<input type = "radio" id="SMS" name="SMS" value="비수신" checked>비수신<br>
  		 </td>
  		 </tr>
  		 
  		 <tr class="table-dark">
  		 <td>관심분야</td>
  		 <td>
  		  <input type="checkbox" name="item" value="신발">신발
          <input type="checkbox" name="item" value="가방">가방
          <input type="checkbox" name="item" value="밸트">밸트
          <input type="checkbox" name="item" value="모자">모자
          <input type="checkbox" name="item" value="시계">시계
          <input type="checkbox" name="item" value="쥬얼리">쥬얼리
         </td>
         </tr>
	</table>

  	<input class="btn btn-danger" type="submit" value="전송" style="float:right;margin-right:50px" onclick="return membercheck()">
  	
	</form>
	   </div>
     
    </div>
    </div>
</div>
</body>
</html>