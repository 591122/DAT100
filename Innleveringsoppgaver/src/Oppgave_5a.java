import static javax.swing.JOptionPane.*;
import static java.lang.System.out;
public class Oppgave_5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inpKarakter  = Integer.parseInt(showInputDialog("Skriv inn poengsum"));
		
		if (inpKarakter <0 || inpKarakter>100){
		out.println("Error, du tastet inn: " + inpKarakter + ", det er ikke mellom 0 - 100");
		System.exit(0);
	}
		
		if (inpKarakter > 100) {
			out.println("Du får karateren: A");
		}
		else if (inpKarakter >= 80 && inpKarakter <= 89) {
			out.println("Du får karateren: B");
		}
		else  if (inpKarakter >= 60 && inpKarakter <= 79) {
			out.println("Du får karateren: C");
		}
		else  if (inpKarakter >= 50 && inpKarakter <= 59) {
			out.println("D");
		}
		else  if (inpKarakter >= 40 && inpKarakter <= 49) {
			out.println("Du får karateren: E");
		}
		else {
			out.println("Du får karateren: F");
		}
	}

}

