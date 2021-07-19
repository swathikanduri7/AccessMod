package accessModifiers;
	
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("display method is called by using defalut access modifier"); 
	     } 
	} 

	public class DefaultAccessModifier 
	{

		public static void main(String[] args) 
		{
			
			System.out.println("By using Dafault Access Modifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        obj.display(); 

		}


}




