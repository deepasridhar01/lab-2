
public class Bool {
	public static void main(String[] args) {
		
		boolean a =true, b = false , c , d , e , f , g ;
		 c= a|b;
		System.out.println("value of c"+ c) ;
		d =a&b;
		System.out.println("value of d"+ d);
		e= a^b;
		System.out.println("value of e  "+e);
		f = (!a&b)|(a&!b);
		System.out.println("value of f " + f);
		g= !a;
		System.out.println("value of g"+ g);
		
		
	}
}