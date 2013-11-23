package com.akrantha.overLoadedMethods;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		super.paintComponent( g );
		
		g.setColor(Color.yellow);
		g.fillOval(10,10,200,200);
		
		g.setColor(Color.black);
		g.fillOval(50,65,30,30);
		g.fillOval(135,65,30,30);
		
		g.fillOval(50,110,120,60);
		
		g.setColor(Color.YELLOW);
		g.fillRect(50,110,120,30);
		g.fillOval(50,120,120,40);
		
		
	}


}
