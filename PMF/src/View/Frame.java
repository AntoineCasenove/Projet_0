package View;

import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;

import Controller.Serial;

public class Frame extends JFrame {
	
	private int frameLength = 700;
	private int frameHeight = 350;
	
	public Frame(Serial serial) throws IOException, FontFormatException{
		
		Panel panel = new Panel(this, serial);
				
		this.setTitle("Interface Java");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(getFrameLength(), getFrameHeight());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(panel);
		//this.addMouseListener(panel);
		this.setBackground(Color.BLACK);
		setVisible(true);
	}

	public int getFrameLength() {
		return frameLength;
	}

	public void setFrameLength(int frameLength) {
		this.frameLength = frameLength;
	}

	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}
}