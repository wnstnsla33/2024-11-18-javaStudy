package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardManager {
    // 게시물을 모아서 관리 영역 
	// 게시물이 모든 사용자에게 공유 
	private static List<BoardVO> boardList=
			  new ArrayList<BoardVO>();
	// 오라클 => 저장된 데이터가 static => 공유된 데이터 
	// 초기화 
	public BoardManager()
	{
		boardGetData();
	}
	// 기능 설정 
	// 1. 목록출력 => 페이지 나누기 => Read SELECT
	public List<BoardVO> boardListData(int page)
	{
		List<BoardVO> list=
				new ArrayList<BoardVO>();
		int j=0; // 10개씩 나눠주는 변수 
		int pagecnt=(page*10)-10;
		// 시작 위치 
		/*
		 *   1page => 0~9
		 *   2page => 10~19
		 *   ...
		 *   WHERE rownum BETWEEN 1 AND 10 
		 */
		List<BoardVO> temp=new ArrayList<BoardVO>();
		// 최신순으로 출력 
		for(int i=boardList.size()-1;i>=0;i--)
		{
			temp.add(boardList.get(i));
		}
		// 페이지별 출력
		for(int i=0;i<temp.size();i++)
		{
			if(j<10 && i>=pagecnt)
			{
				BoardVO vo=temp.get(i);
				list.add(vo);
				j++;
			}
		}
		return list;
	}
	// 2. 추가    => Create INSERT
	public void boardInsert(BoardVO vo)
	{
		boardList.add(vo);
		boardSave();// 파일 변경
	}

	// 추가 / 수정 / 삭제 
	public void boardGetData()
	{
		ObjectInputStream ois=null;
		try
		{
			FileInputStream fis=
				new FileInputStream("c:\\java_data\\board.txt");
			ois=new ObjectInputStream(fis);
			boardList=(List<BoardVO>)ois.readObject();
			// ObjectInputStream => 파일과 연결 
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// => 자바 => 자동으로 갱신은 없다 
	// => 메소드 호출시에만 갱신 
	// 수정 / 추가 / 삭제 => 변경 
	public void boardSave()
	{
		ObjectOutputStream oos=null;
		try
		{
			FileOutputStream fos=
				new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(boardList);
			// 수정 => boardList.set()
			// 삭제 => boardList.remove()
			// 추가 => boardList.add()
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}
	// 총페이지 구하기 
	public int boardTotalPage()
	{
		return (int)(Math.ceil(boardList.size()/10.0));
	}
	// 시퀀스 
	public BoardVO boardDetailData(int no) {
		BoardVO vo = new BoardVO();
		for(BoardVO dvo: boardList) {
			if(dvo.getNo()==no) {
				dvo.setHit(dvo.getHit()+1);
				boardSave();
				break;
			}
		}
		boardGetData();
		for(BoardVO dvo :boardList) {
			if(dvo.getNo()==no) {
				vo=dvo;
				boardSave();
				break;
			}
		}
		return vo;
		
	}
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		for(BoardVO dvo:boardList) {
			if(dvo.getNo()==no) {         
				vo=dvo;              
				break;                               
			}
		}
		return vo;
		
	}
	public void boardUpdate(BoardVO vo) {
		
	}
	public boolean boardDelete(int no,String pwd) {
		boolean bCheck = true;
		for(BoardVO vo:boardList) {
			if(vo.getNo()==no) {
				if(!vo.getPwd().equals(pwd)) {
					bCheck=false;
					return bCheck;
				}
			}
		}
		int index=0;
		for(int i=0;i<boardList.size();i++) {
			BoardVO vo = boardList.get(i);
			if(vo.getNo()==no);
			{
				index=i;
				break;
			}
		}
		boardList.remove(index);
		boardSave();
		return bCheck;
	}
	public int boardSequence() // 게시물 번호 자동 생성 
	{
		int max=0;
	    // 비정상 종료를 방지하는 프로그램 
		try
		{
			for(BoardVO vo:boardList)
			{
				if(vo.getNo()>max)
				{
					max=vo.getNo();
				}
			}
		}catch(Exception ex) {}
		
		return max+1;
	}
	// 게시물 번호를 자동 생성 => 시퀀스 Create Sequence
	// auto_increment()
}