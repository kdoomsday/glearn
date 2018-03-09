package geometria;

import java.awt.*;

import javax.swing.*;

public class Draw extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground (Color.WHITE);
		CuadradoColor c = new CuadradoColor(new Punto(25,100), 400, Color.BLUE);
		
		g.setColor(c.getC());
		g.drawRect(c.getEsquina().getX(), c.getEsquina().getY(), c.getLados(), c.getLados() );
		
		g.setColor(Color.BLACK);
		g.drawString("El area del cuadrado es: " + c.area(), 125, 300);
		
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Cuadrado");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Draw p = new Draw();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(550, 700);
		f.setVisible(true);

	}
}
