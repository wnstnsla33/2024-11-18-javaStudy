package com.sist.main;
import javax.swing.*;

import com.sist.board.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
public class BoardMainForm extends JFrame
implements ActionListener,MouseListener
{
    CardLayout card=new CardLayout();
    BoardList bList=new BoardList();
    BoardDetail bDetail=new BoardDetail();
    BoardInsert bInsert=new BoardInsert();
    BoardUpdate bUpdate=new BoardUpdate();
    BoardDelete bDelete = new BoardDelete();
    // 게시판 관리자 
    BoardManager bm=new BoardManager();
    // 변수 설정 
    int curpage=1;
    int totalpage=0;
    public BoardMainForm()
    {
    	setLayout(card);
    	// 추가 
    	add("LIST",bList);
    	add("DETAIL",bDetail);
    	add("INSERT",bInsert);
    	add("UPDATE",bUpdate);
    	
    	setTitle("윈도우 게시판 ver 1.0");
    	listPrint();
    	setSize(640, 550);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	// 이벤트 등록 
    	bList.inBtn.addActionListener(this);// 글쓰기 이동버튼
    	bInsert.b1.addActionListener(this);// 글쓰기
    	bInsert.b2.addActionListener(this);// 취소 
    }
    public void listPrint()
    {
    	// => table의 내용을 지운다 
    	for(int i=bList.model.getRowCount()-1;i>=0;i--)
    	{
    		bList.model.removeRow(i);
    	}
    	
    	// 데이터 받기 
    	// 다른 패키지에 같은 이름의 클래스가 있는 경우 
    	/*
    	 *   java.util.List
    	 *   java.awt.*
    	 *   
    	 *   java.util.List
    	 */
    	List<BoardVO> list=bm.boardListData(curpage);
    	totalpage=bm.boardTotalPage();
    	bList.pageLa.setText(curpage+"page / "+totalpage+"pages");
    	
    	// 게시물 출력 
    	for(int i=0;i<list.size();i++)
    	{
    		BoardVO vo=list.get(i);
    		String[] data={
    			String.valueOf(vo.getNo()),
    			vo.getSubject(),
    			vo.getName(),
    			new SimpleDateFormat("yyyy-MM-dd")
    			.format(vo.getRegdate()),
    			String.valueOf(vo.getHit())
    		};
    		bList.model.addRow(data);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BoardMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(bList.inBtn==e.getSource())// 목록에서 새글버튼 클릭 
		{
			bInsert.nameTf.setText("");
			bInsert.subTf.setText("");
			bInsert.ta.setText("");
			bInsert.pwdPf.setText("");
			// 카드 변경 => 윈도우창 변경 
			card.show(getContentPane(), "INSERT");
			bInsert.nameTf.requestFocus();
		}
		else if(bInsert.b2==e.getSource())// 글쓰기 취소
		{
			card.show(getContentPane(), "LIST");
			// javascript:history.back()
		}
		else if(bInsert.b1==e.getSource())// 글쓰기 
		{
			String name=bInsert.nameTf.getText();
			// 입력된 값 읽기 
			if(name.length()<1)
			{
				bInsert.nameTf.requestFocus();
				return;
			}
		 
			String subject=bInsert.subTf.getText();
			// 입력된 값 읽기 
			if(subject.length()<1)
			{
				bInsert.subTf.requestFocus();
				return;
			}
			
			String content=bInsert.ta.getText(); 
			if(content.length()<1)
			{
				bInsert.ta.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(bInsert.pwdPf.getPassword()); 
			if(pwd.length()<1)
			{
				bInsert.pwdPf.requestFocus();
				return;
			}
			
			
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table) {
			if(e.getClickCount()==2) {
				int row = bList.table.getSelectedRow();
				String no= bList.model.getValueAt(row, 0).toString();
				//System.out.println(no);
				BoardVO vo = bm.boardDetailData(Integer.parseInt(no));
				card.show(getContentPane(), "DETAIL");
				bDetail.no.setText(String.valueOf(vo.getNo()));
				bDetail.name.setText(vo.getName());
				bDetail.sub.setText(vo.getSubject());
				bDetail.ta.setText(vo.getContent());
				bDetail.hit.setText(String.valueOf(vo.getHit()));
				bDetail.day.setText(new SimpleDateFormat("yyyy-MM-DD").format(vo.getRegdate()));
			}
		}
		else if(e.getSource()==bDelete.b2) {
			card.show(getContentPane(),"DETAIL");
		}
		else if(e.getSource()==bDelete.b1) {
			String pwd = String.valueOf(bDelete.pf.getPassword());
			if(pwd.length()<1) {
				bDelete.pf.requestFocus();
				return;
			}
			String no=bDetail.no.getText();
			boolean bCheck = bm.boardDelete(Integer.parseInt(no), pwd);
			if(bCheck==false) {
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다.");
				bDelete.pf.setText("");
				bDelete.pf.requestFocus();
				
			}
			else {
				card.show(getContentPane(), "LIST");
				listPrint();
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}