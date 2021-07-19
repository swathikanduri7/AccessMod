package accessModifiers;

class priaccessspecifier 
{ 
   void display() 
    { 
        System.out.println("Display method is called by using private access modifier"); 
    } 
} 

public class PrivatAccessModifier 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("By using Private Access Modifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
        //trying to access private method of another class 
         obj.display();

	}
}




