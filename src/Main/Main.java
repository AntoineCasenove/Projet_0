package Main;

import java.awt.FontFormatException;
import java.io.IOException;

import Controller.Serial;
import View.Frame;

public class Main {
	public static void main(String[] args) throws IOException, FontFormatException {
		
		Serial serial = new Serial();
		Frame frame = new Frame(serial);
		serial.initialize();
	}
}