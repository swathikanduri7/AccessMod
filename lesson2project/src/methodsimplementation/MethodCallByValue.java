package methodsimplementation;

public class MethodCallByValue
{
	
		int val=2;

		int operation(int v) 
		{
			v =v*10/100;
			return(v);
		}

		public static void main(String args[]) 
		{
			MethodCallByValue m = new MethodCallByValue();
			System.out.println("Before operation value of data is "+m.val);
			m.operation(4);
			System.out.println("After operation value of data is "+m.val);
			}
		}



