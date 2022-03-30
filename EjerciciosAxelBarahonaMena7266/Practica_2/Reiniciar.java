import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;
public class Reiniciar extends JButton{

	public Reiniciar(String nombre) {
		                   super(nombre);
		     setContentAreaFilled(false);
	}
	
@Override
protected void paintComponent(Graphics g) {
g.setColor(Color.YELLOW);
g.fillOval(0, 0, getSize().width-1, getSize().height-1);
super.paintComponent(g);
}

@Override
protected void paintBorder(Graphics g) {
g.setColor(Color.GREEN);
g.drawOval(0, 0, getSize().width-1, getSize().height-1);
}

}