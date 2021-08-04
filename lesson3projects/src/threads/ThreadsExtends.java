package threads;

public class ThreadsExtends extends Thread
{
	 
 	public void run()
	 	{
	  		System.out.println("Thread is started by using run method");
	}
	 	public static void main( String args[] )
	 	{
	 		ThreadsExtends mt = new  ThreadsExtends();
	  		mt.start();
	 	}
	}

	
	

