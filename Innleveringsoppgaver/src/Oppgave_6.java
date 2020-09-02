import static javax.swing.JOptionPane.*;
public class Oppgave_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int inpHeltall  = Integer.parseInt(showInputDialog("Skriv inn et heltall over 0"));
		
		int fakultetet = 1;
		
		if (inpHeltall<=0){
		 System.exit(0);
		}
		
		for (int i = 0; i < inpHeltall; i++) {
			
			int element = inpHeltall - i;
			fakultetet = element*fakultetet;
			
		}
		showMessageDialog(null,"Fakultetet av " + inpHeltall + " blir " + fakultetet);

			
}}
