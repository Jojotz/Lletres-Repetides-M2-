import javax.swing.JOptionPane;

public class Fase1M2 {
	
	public static void main(String[] args) { 
	
		String nom=JOptionPane.showInputDialog("Introdueix el teu nom");
		char[] aLletres = nom.toCharArray();
		
		for ( int i=0; i<aLletres.length; i++) {
		System.out.println(nom.charAt(i));
		}
		
		/*for ( int i=0; i<nom.length(); i++) {
			//if (nom.CharAt(i)!= );
			System.out.println(nom.charAt(i));
		 }*/
	}
}