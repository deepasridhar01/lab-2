import java.util.Scanner;
public class SwitchMonth {
		public static void main(String[] args) {
			String Season;
			System.out.println("Enter the season:");
			Scanner s = new Scanner(System.in);
			int season = s.nextInt();
			switch (season) {
			case 12:
			case 1:
			case 2:
				Season = "winter";
				break;
			case 3:
			case 4:
			case 5:
				Season = "spring";
				break;
			case 6:
			case 7:
			case 8:
				Season = "summer";
				break;
			case 9:
			case 10:
			case 11:
				Season = "autmn";
				break;
			default :
			Season = "not an season";
			}
			System.out.println("entered month:"+Season);
		}
}


