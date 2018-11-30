package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Controller.Serial;

public class Panel extends JPanel {

	private Font amatic;
	private Font font;
	private GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	private Image givre;
	private Image givreB;
	private String givrePath = "/givre.png";
	private String givreBPath = "/givre-blanco.png";
	
	public Panel(Frame frame, Serial serial) throws IOException, FontFormatException {
		
		try {	    	
			givre = ImageIO.read(getClass().getResourceAsStream(givrePath));
			givreB = ImageIO.read(getClass().getResourceAsStream(givreBPath));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		setAmatic(Font.createFont(Font.TRUETYPE_FONT, new File("Fonts/AMATIC.ttf")));

		ge.registerFont(getAmatic());
		
		setFont(new Font("Amatic", Font.BOLD, 100));
	}
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
    	g2d.drawImage(givreB, 0, -300, 1023, 682, this);
    	
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setColor(Color.red);
		g2d.setFont(getFont());
		g2d.drawString("I'm da fridge", 20, 125);
		g2d.drawString("and I'm pimped!", 35, 250);
		
    	g2d.drawImage(givre, 0, -300, 1023, 682, this);
	}
	
	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public Font getAmatic() {
		return amatic;
	}

	public void setAmatic(Font amatic) {
		this.amatic = amatic;
	}
}
