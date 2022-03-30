import java.awt.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class VideoJuego extends Frame implements MouseMotionListener, MouseListener{

    Label element1;
    Label element2;
    Label element3;
    Label element4;
    Reiniciar R;
    Componentes C;

    public VideoJuego(){
    
        R = new Reiniciar("Reiniciar");
        R.setBounds(420, 470, 90, 90);
        R.setForeground(Color.RED);
        R.addActionListener(evt ->btnRActionPerformed(evt));
        
        C = new Componentes();

        element1 = new Label("   A   ");
        element1.setBounds(725, 200, 30, 30);
        element1.setBackground(Color.GREEN);
        element1.addMouseMotionListener(this);
        element1.addMouseListener(this);

        element2 = new Label("   B   ");
        element2.setBounds(775, 200, 30, 30);
        element2.setBackground(Color.GREEN);
        element2.addMouseMotionListener(this);
        element2.addMouseListener(this);

        element3 = new Label("   C   ");
        element3.setBounds(725, 235, 30, 30);
        element3.setBackground(Color.GREEN);
        element3.addMouseMotionListener(this);
        element3.addMouseListener(this);

        element4 = new Label("    D  ");
        element4.setBounds(775, 235, 30, 30);
        element4.setBackground(Color.GREEN);
        element4.addMouseMotionListener(this);
        element4.addMouseListener(this);

        this.add(element1);
        this.add(element2);
        this.add(element3);
        this.add(element4);
        this.add(R);
        this.add(C);

        this.setVisible(true);
        this.setResizable(false);
        this.setSize(900, 800);
        cerrar();

        
    }

    private void btnRActionPerformed(ActionEvent e){
		reiniciar();
	}

    public void cerrar() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

    public void mover(MouseEvent g, Label lbl) {
		lbl.setLocation(
		        lbl.getX() + g.getX() - lbl.getWidth() / 2,
		        lbl.getY() + g.getY() - lbl.getHeight() / 2  
		    );
	}

    public void reiniciar(){
        element1.setBounds(725, 200, 30, 30);
        element2.setBounds(775, 200, 30, 30);
        element3.setBounds(725, 235, 30, 30);
        element4.setBounds(775, 235, 30, 30);
    }

    public void validar(Label lbl) {
		int x = lbl.getX();
		int y = lbl.getY();
		if(x>=50 & x<=350 & y>50 & y<350) {
		}else {
			reiniciar();
		}
		
	}

    public static void main(String[] args) {
        VideoJuego v = new VideoJuego();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
        if(e.getSource() == element1) {
			validar(element1);
		}if(e.getSource() == element2) {
			validar(element2);
		}if(e.getSource() == element3) {
			validar(element3);
		}if(e.getSource() == element4) {
			validar(element4);
		}
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       
        if(e.getSource() == element1) {
			mover(e, element1);
		}
		if(e.getSource() == element2) {
			mover(e, element2);
		}
		if(e.getSource() == element3) {
			mover(e, element3);
		}
		if(e.getSource() == element4) {
			mover(e, element4);
		}
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        
    }
    
}
