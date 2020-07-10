function membercheck(){
	
	
	if(document.frm.name.value==""){
		alert("이름을 입력해");
		document.frm.name.focus();
		return false;
	}else if(document.frm.num.value==""){
		alert("주민 앞자리 입력해");
		document.frm.num.focus();
		return false;
	}else if(document.frm.num2.value==""){
		alert("주민 뒷자리 입력해");
		document.frm.num2.focus();
		return false;
    }else if(document.frm.id.value==""){
		alert("주민 아이디 입력해");
		document.frm.id.focus();
		return false;
    }else if(document.frm.pass.value==""){
		alert("주민 비밀번호 입력해");
		document.frm.pass.focus();
		return false;
    }else if(document.frm.email.value==""){
		alert(" email 입력해");
		document.frm.email.focus();
		return false;
	}else if(document.frm.addr.value==""){
		alert("주소 앞에 입력해");
		document.frm.addr.focus();
		return false;
	}else if(document.frm.addr2.value==""){
		alert("주소 뒤에 입력해");
		document.frm.addr2.focus();
		return false;
	}else if(document.frm.phone.value==""){
		alert("핸드폰 입력해");
		document.frm.phone.focus();
		return false;
	}else if(isNAN(document.frm.num.value)){
		alert("주민 앞자리 숫자만 입력해");
		document.frm.num.focus();
		return false;
	}else if(isNAN(document.frm.num2.value)){
		alert("주민 뒷자리 숫자만 입력해");
		document.frm.num2.focus();
		return false;
	}else{
			return true;
		}
}