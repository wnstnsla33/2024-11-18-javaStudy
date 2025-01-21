package com.sist.vo;

import java.util.Date;

import lombok.Data;
@Data
public class MemberVO {
	private String id,pwd,name,sex,email,address,msg;
	private Date regdate,birthday;
}
