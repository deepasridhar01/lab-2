import java.util.*;
public class Vowels {
	public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("\n Enter Character ");
    char c = ((Sc.nextLine()).charAt(0));
    char z = Character.toUpperCase(c);
    switch (z)
    {
    
    case  'A':
    case  'E':
    case  'I':
    case  'O':
    case  'U':
    	System.out.println(c+"is a vowel");
    	break;
    	default:
    		System.out.println(c+ "is a non vowel");
}
}
}
