import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;


public class Componentes extends Canvas{

    public Componentes() {

	}

	public void paint(Graphics g) {

		g.setColor(Color.MAGENTA);
		g.fillRect(50, 50, 300, 300);
		
		g.setColor(Color.black);
		g.drawLine(650, 200, 750, 300);
		g.drawLine(650, 200, 750, 100);
		g.drawLine(850, 200, 750, 300);
		g.drawLine(850, 200, 750, 100);	
	}
}