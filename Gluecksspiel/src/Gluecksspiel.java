import java.util.Scanner;

public class Gluecksspiel {

	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
	
	boolean geschlecht = true;
	boolean geschlecht2 = false;
	int alter = 16;
	int alter2 = 20;
	String name = "Thomas";
	String name2 = "Susanne";
	int zahlPlayer1 = 1;
	int zahlPlayer2 = 1;
	
	
	if(alter < 18){
		System.out.println("Hallo "+ name +"!");
		System.out.println("Deine Zahl: ");
	}else if(geschlecht){
		System.out.println("Lieber Herr "+ name +"!");
		System.out.println("Ihre Zahl: ");
	}else {System.out.println("Liebe Frau "+ name +"!");
			System.out.println("Ihre Zahl: " );}
	zahlPlayer1 = s.nextInt();
		
	
	
	
	if(alter2 < 18){
		System.out.println("Hallo "+ name2 +"!");
		System.out.println("Deine Zahl: ");
	}else if(geschlecht2){
		System.out.println("Lieber Herr "+ name2 +"!");
		System.out.println("Ihre Zahl: ");
	}else {System.out.println("Liebe Frau "+ name2 +"!");
			System.out.println("Ihre Zahl: " );}
	zahlPlayer2 = s.nextInt();}
	
	public static String wuerfeln(){
		if(Math.random()<=0.24){
			return (" verloren!");}
			else{return (" gewonnen!");}
	
			
			
	}
	}

