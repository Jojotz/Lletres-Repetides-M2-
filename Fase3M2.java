import javax.swing.JOptionPane;
import java.util.*;

public class Fase3M2 {
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> mapa=new HashMap<Character,Integer>();
		
		String nom=JOptionPane.showInputDialog("Introdueix el teu nom");
		
		System.out.println(nom);
		
		char[] aLletres = nom.toCharArray();
		
		for (char c : aLletres) { 
            if (mapa.containsKey(c)) { 
  
                // If char is present in mapa, 
                // incrementing it's count by 1 
                mapa.put(c, mapa.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in mapa, 
                // putting this char to charCountMap with 1 as it's value 
                mapa.put(c, 1); 
            } 
        } 
		
		// Printing the mapa
		for (Map.Entry entry : mapa.entrySet()) { 
			
            System.out.println(entry.getKey() + " " + entry.getValue()); 
		}
		
		//Funció Fase2
            for ( int i=0; i<aLletres.length; i++) {
			
			Boolean flag = Character.isDigit(nom.charAt(i));
	        
			if(flag) {
				
				System.out.println("Els noms de persones no contenen números! ( " + nom.charAt(i) + " )");
	        
			} else if(nom.charAt(i) == 'a' || nom.charAt(i) == 'e' || nom.charAt(i) == 'i' || nom.charAt(i) == 'o' || nom.charAt(i) == 'u') {
				
				System.out.println("VOCAL " + nom.charAt(i));
			
			} else  if (nom.charAt(i) == ' ') {
				  
				System.out.println("espai");
				
			 } else {
				System.out.println("CONSONANT " + nom.charAt(i));	
			 	}
			}				
			}
}