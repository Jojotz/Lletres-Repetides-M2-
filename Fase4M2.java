// import javax.swing.JOptionPane;
import java.util.*;
//import java.io.*;

public class Fase4M2 {
	
	/* NO ACABO DE ENCONTRAR LA SOLUCIÓN POR ESTA VIA:
	 
	 	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Introdueix el teu nom:");
		String lastname = JOptionPane.showInputDialog("Introdueix el teu cognom:");
		
		name = (name + " ");
		char[] nameChar = name.toCharArray();
		List<char[]> nameasList = Arrays.asList(nameChar);
		//String nameasString = new String (nameasList);
		
		char[] lastnameChar = lastname.toCharArray();
		List<char[]> lastnameasList = Arrays.asList(lastnameChar);
		//String lastnameasString = new String (lastnameasList);
		
		//ArrayList<String> fullnameList = new ArrayList<String>();
		
		ArrayList<String> fullnameList = new ArrayList<String>(nameasList);
		fullnameList.addAll(lastnameasList);
		
		//fullnameList.addAll(nameasList);
		//fullnameList.addAll(lastnameasList);
					
		System.out.println(fullnameList); 
		}
		}    */
		
		public static void main(String[] args) {
			
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> lastname = new ArrayList<>();
		ArrayList<String> Fullname = new ArrayList<>();
			
		name.add("J");
		name.add("O");
		name.add("A");
		name.add("N");
				
		lastname.add("C");
		lastname.add("O");
		lastname.add("L");
		lastname.add("L");
				
		name.toString();
		lastname.toString();
			
		Fullname.addAll(name);
		Fullname.add(" ");
		Fullname.addAll(lastname);
		
		System.out.println(Fullname);
		}
}