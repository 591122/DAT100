import static javax.swing.JOptionPane.*;
	import static java.lang.System.out;
public class Oppgave_4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int inpInntekt = Integer.parseInt(showInputDialog("Skriv inn bruttointekt"));
			
				out.println("Skatt for bruttoinntekt under 180 800: "+ 0);
				
	double trinn1 = 0;
	double trinn2 = 0;
	double trinn3 = 0;
	double trinn4 = 0;

			
			
			if (180800<inpInntekt) {
				int x = inpInntekt - 180800;
					if (x>73700) {
						trinn1 = (73700/100)*1.9;
					out.println("Inntekten mellom: 180800 til 254 500: " + trinn1);
				}
					else {
						trinn1 = (x/100) *1.9;
						out.println("Inntekten mellom: 180 800 til 254 500: " + trinn1);
				}
			}
			
			if (254500<inpInntekt) {
				int x = inpInntekt - 254500;
					if (x>385250) {
						trinn2  =  (385250/100)*4.2;
				out.println("Inntekten mellom: 254 500 til 639 750: "+ trinn2);
			} else {
				trinn2 = (x/100)*4.2;
				out.println("Inntekten mellom: 254 500 til 639 750: "+ trinn2);
			}
					
			}
			
		 if (639750<inpInntekt) {
				int x = inpInntekt - 639750;
				if (x>359800) {
					trinn3 = (359800/100)*13.2;
				out.println("Inntekten mellom: 639 750 til 999 550: "+ trinn3);
				}
				else {
					trinn3 = (x/100)*13.2;
					out.println("Inntekten mellom: 639 750 til 999 550: "+ trinn3);
				}
				}
			
			if (inpInntekt>999550){
				trinn4 = ((inpInntekt-999550)/100)*16.2;
				out.println("Inntekten over: 999 550: "+ trinn4);
			}
			double sum = trinn1 + trinn2 + trinn3 + trinn4;
		showMessageDialog(null,"Summen av trinnskatt blir:  "  +  sum);

	}}
