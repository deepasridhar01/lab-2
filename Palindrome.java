import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		String original,reverse="";
		Scanner s =new Scanner (System.in);
		System.out.println("Enter a string or number to check if it is a palindrome");
		original = s.nextLine();
		int length = original.length();
		for (int i=length-1;i>=0;i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse : "+reverse);
		if(original.equals(reverse))
			System.out.println("Entered string/number is a palindrome");
		else
			System.out.println("Entered string/number is not a palindrome");
		
}

}
