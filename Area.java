import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		int r,h=3;
		double pi=3.14,Area;
		Scanner s = new Scanner (System.in);
		System.out.println("enter the radius : ");
		r = s.nextInt();
		Area =  (pi * r * r) + (2* pi * r * h);
		System.out.println("Area = "+Area);
		
	}

}
