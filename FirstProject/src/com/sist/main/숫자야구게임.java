package com.sist.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 숫자야구게임 extends JFrame implements ActionListener{
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	
	int[] com = new int[3];
	int[] user =new int[3];
	public 숫자야구게임(){
		ta=new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		ta.setEditable(false);
		tf= new JTextField(10);
		tf.setEnabled(false);
		b1= new JButton("시작");
		b2= new JButton("종료");
		
		JPanel p = new JPanel();
		
		p.add(b1);
		p.add(b2);
		add("Center",js);
		add("South",p);
		setSize(350,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new 숫자야구게임();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void getRand() {
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9);
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	
}
