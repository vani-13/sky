package anonymousArray;
//The array declared without Name is called as anonymousArray
class Display
{
	/*void disp(Integer x[])
	{
		for(Integer k:x)
		{
			System.out.print(k+"");
		}
		System.out.println();
	}
	void disp1(String z[])
	{
		for(String k:z)
		{
			System.out.print(k+"");
		}
	}*/
	void disp(Object y[])
	{
		for(Object k:y)
		{
			System.out.print(k+"");
		}
	}
}
public class anonymousArrayDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Integer a[] = {1,2,3,4,5};
		Display obj = new Display();
		//obj.disp(a); //Method Call
		obj.disp(new Integer[] {1,2,3,4,5});//anonymousArray
		obj.disp(new String[] {"Java","Anonymous","Concept"});//anonymousArray
		obj.disp(new Double[] {2.5,3.0});
	}

}
