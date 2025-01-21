package com.sist.commons;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageChange {
	public static Image getImage(ImageIcon icon,int width,int height) {
		return icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
	}

}
