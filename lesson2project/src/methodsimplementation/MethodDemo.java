package methodsimplementation;

public class MethodDemo 
{
			public int multiplynumbers(int a,int b) 
		   {
			int z=a*b;
			return z;
			}

		public static void main(String[] args) 
		{

			MethodDemo b=new MethodDemo();
			int res= b.multiplynumbers(18,2);
			System.out.println("Multipilcation is :"+res);
			}

}
