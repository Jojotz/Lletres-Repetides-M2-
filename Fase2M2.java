import javax.swing.*;

public class Fase2M2 {
	
	public static void main(String[] args) { 
		
		String nom=JOptionPane.showInputDialog("Introdueix el teu nom");
		
		System.out.println(nom);
		
		char[] aLletres = nom.toCharArray();
		
		for ( int i=0; i<aLletres.length; i++) {
			
			Boolean flag = Character.isDigit(nom.charAt(i));
	        
			if(flag) {
	            System.out.println("Els noms de persones no contenen números! ( " + nom.charAt(i) + " )");
	        }
			else {
				
				if(nom.charAt(i) == 'a' || nom.charAt(i) == 'e' || nom.charAt(i) == 'i' || nom.charAt(i) == 'o' || nom.charAt(i) == 'u') {
	           
				System.out.println("VOCAL " + nom.charAt(i));
			
				} else {
				  if (nom.charAt(i) == ' ') {
					System.out.println("espai");
				  } else {
					System.out.println("CONSONANT " + nom.charAt(i));	
					}
				}				
			}
		}
}
}