package ClaseString;

import java.util.Scanner;

public class claseString {
public static void main(String[] args) {
	

	Scanner scan= new Scanner(System.in);
	System.out.println("INGRESE SU NOMBRE");
	String nom= scan.next();
	System.out.println("INGRESE SU APELLIDO");
    String ape= scan.next();
    char inicialNombre = nom.charAt(0);
    char inicialApellido= ape.charAt(0);
    
    String inicialNom = String.valueOf(inicialNombre);     //convierto char en String
    String inicialAp= "" + inicialApellido;       //o poner "nada" + caracter(inicialdelApellido)
    
    String mayusNom= inicialNom.toUpperCase();
    String mayusApe= inicialAp.toUpperCase();
    
    nom = nom.toLowerCase();
    ape = ape.toLowerCase();
    
     nom = nom.substring(1);
     ape = ape.substring(1);
     
     System.out.println("Usted se llama: " + mayusApe + ape + ", " + mayusNom + nom);
     
     
    	    	
    
	
}
}