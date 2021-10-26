package covid19;
//PeptideVisualizer.java was written by Sammy in the fall of 2020 basing on DNA_Footprint_Plotter_ACat.java
//There are multiple versions. This script is still under development

import java.io.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PeptideVisualizer extends JFrame {
	public String virus;// sequence
	public int len;// sequence length

	public PeptideVisualizer() {
		super();
		// initialization
		setTitle("Peptide Plotter");
		setSize(1260, 660);
		setVisible(true);
	}

	// Plotting：
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Color c = new Color(10, 2, 2);
		g2.setColor(c);
		// Read in peptide sequence:
		File file = new File("C:/Users/Sammy/Documents/Sammy/Github/QII57161_1_300-600.txt");
		try {
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[102400];
			len = in.read(byt);
			virus = new String(byt, 0, len);
			System.out.println("len=" + len);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Plotting range。
		g.drawRect(10, 10, 1260, 660);
		Color aa = new Color(200, 200, 200);
		Color rk = new Color(20, 90, 255);
		Color nq = new Color(0, 220, 220);
		Color de = new Color(230, 230, 10);
		Color cm = new Color(230, 230, 0);
		Color gg = new Color(235, 235, 235);
		Color hh = new Color(130, 130, 210);
		Color ilv = new Color(15, 130, 15);
		Color oo = new Color(190, 160, 110);
		Color fy = new Color(50, 50, 170);
		Color pp = new Color(220, 150, 130);
		Color st = new Color(250, 150, 0);
		Color ww = new Color(180, 90, 180);

		String s;
		double th0 = 50.0 * 3.1415926 / 180.0, th1 = 90.0 * 3.1415926 / 180.0, th2 = 60.0 * 3.1415926 / 180.0;
		double m, th = th0, pol = 1.0, q = 0.5;

		// Define starting point position
		int x0 = 635 - 100, y0 = 335 - 225, x = x0, y = y0;

		for (int i = 0; i <= 299; i++) {
			s = virus.substring(i, i + 1);
			switch (s) {
			case "A": {
				m = 15.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(aa);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}
			
			case "R": {
				m = 10.0 * q;
				pol = 1.0;
				th = th + pol * th1;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(rk);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}
			
			case "N": {
				m = 15.0 * q;
				pol = -1.0;
				th = th + pol * th1;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(nq);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "D": {
				m = 58.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(nq);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "C": {
				m = 47.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(cm);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "E": {
				m = 72.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(de);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "Q": {
				m = 72.0 * q;
				pol = -1.0;
				th = th + pol * th1;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(nq);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "G": {
				m = 1.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(gg);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;

				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "H": {
				m = 82.0 * q;
				pol = 1.0;
				th = th + pol * th1;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(hh);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "I": {
				m = 57.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(ilv);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "L": {
				m = 57.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(ilv);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "K": {
				m = 93.0 * q;
				pol = 1.0;
				th = th + pol * th1;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(rk);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "M": {
				m = 74.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(cm);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "F": {
				m = 91.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(fy);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "P": {
				m = 114.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(pp);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "S": {
				m = 31.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(st);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "T": {
				m = 44.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(st);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "W": {
				m = 130.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(ww);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "Y": {
				m = 107.0 * q;
				th = th + pol * th2;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(fy);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			case "V": {
				m = 45.0 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(ilv);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}

			default: {
				m = 200 * q;
				th = th + pol * th0;
				if (th >= 2.0 * 3.1415926)
					th = th - 2.0 * 3.1415926;
				g2.setColor(oo);
				x = x + (int) Math.floor(m * Math.cos(th)) + 1;
				y = y + (int) Math.floor(m * Math.sin(th)) + 1;
				if (x > 1260)
					x = x - 1250;
				if (y > 660)
					y = y - 650;
				if (x <= 0)
					x = x + 1250;
				if (y <= 0)
					y = y + 650;
				g.drawLine(x0, y0, x, y);
				x0 = x;
				y0 = y;
				break;
			}
		  }
		}
	}

	public static void main(String[] args) {
		PeptideVisualizer g = new PeptideVisualizer();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
