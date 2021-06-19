
public class Box {
		int length, breadth, height;
		Box(int I,int b,int h)
		{

			length= I;
			breadth=b;
			height=h;
		}
		public void display()
		{
			int volume=length*breadth*height;
			System.out.println("Volume of Box is"+volume);
		}
	}

class Boxdemo
{
	public static void main(String args[])
	{
		Box b=new Box(10,20,30);
		b.display();
	}

}
