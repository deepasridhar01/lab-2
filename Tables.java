import java.util.Scanner;
public class Tables {
	public static void main(String[] args) {
		System.out.println("Enter an integer:");
		Scanner s = new Scanner(System.in);
		int num = s .nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(+num+"x"+i+"="+(num*i));
		}
	}

}
