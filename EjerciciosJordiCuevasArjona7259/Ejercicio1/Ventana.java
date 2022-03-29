package EjerciciosJordiCuevasArjona7259;
package EjerciciosJordiCuevasArjona7259;
package EjerciciosJordiCuevasArjona7259.Ejercicio1;

    import static java.awt.Font.PLAIN;
import EjerciciosAxelBarahonaMena7266.Ejercicio1.Ventana;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.WindowEvent;

public class Ventana extends Frame implements ActionListener {

    {

    this.setLocationRelativeTo(null);
}
    Button aceptar;
	TextField txt;
	Panel centro;
	TextArea resultado;
	
	public Ventana () {
		
		aceptar= new Button("  Aceptar");
		txt = new TextField ("");
		centro= new Panel();
		resultado= new TextArea("");
		
		
		aceptar.addActionListener(this);
		centro.setLayout(new BorderLayout());
		centro.add(txt, BorderLayout.NORTH);
		centro.add(aceptar, BorderLayout.CENTER);
		this.setLayout(new BorderLayout());
		this.add(resultado, BorderLayout.CENTER);
		this.add(centro, BorderLayout.NORTH);		
	    aceptar.setFocusable(false);
	    aceptar.setBackground(Color.RED); 
	    aceptar.setForeground(Color.BLACK); 
	    txt.setBackground(Color.YELLOW); 
	    txt.setForeground(Color.WHITE);
	    
		setSize(400, 500);
        setVisible(true); 
       
        cerrarVentana(); 
       
	}
	
	public static void main(String args[]){
		Ventana v= new Ventana();
	}	

	public void cerrarVentana() {
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	private void num(TextField a) {
		a.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c= e.getKeyChar();
				if(!Character.isDigit(c) && c!='.') {
					e.consume();
				}
				if(c== '.' && txt.getText().contains(".")) {
					e.consume();
				}
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String c= txt.getText();
	 	if (e.getSource() == aceptar) {
			 resultado.append(c + "\n");
		}
	}	
}





