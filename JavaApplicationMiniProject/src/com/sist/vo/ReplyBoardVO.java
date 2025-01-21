package com.sist.vo;
/*
 *   NO                                        NOT NULL NUMBER
 NAME                                      NOT NULL VARCHAR2(51)
 SUBJECT                                   NOT NULL VARCHAR2(2000)
 CONTENT                                   NOT NULL CLOB
 PWD                                       NOT NULL VARCHAR2(10)
 REGDATE                                            DATE
 HIT                                                NUMBER
 GROUP_ID                                           NUMBER
 GROUP_STEP                                         NUMBER
 GROUP_TAB                                          NUMBER
 ROOT                                               NUMBER
 DEPTH                                              NUMBER
 */
import java.util.*;

import lombok.Data;
@Data
public class ReplyBoardVO {
   private int no,hit,group_id,group_step,group_tab,root,depth;
   private String name,subject,content,pwd,dbday;
   private Date regdate;
   // TO_CHAR를 이용해서 날짜 형식 변경 => 상세보기 : 날짜+시간 
}