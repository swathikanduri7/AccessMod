package arrayofstrings;
import java.util.*;    
	
public class EmailValidation1
	{  
	    public static void main(String args[])
	    {  
	        ArrayList<String> emails = new ArrayList<String>();  
	       
	        //valid email-ids
	        emails.add("swathi.kanduri786@gmail.com");  
	        emails.add("raj.name@domain.com");  
	        emails.add("sai#@hotmail.com");  
	        emails.add("hello@yahoo.com");  
	        Scanner input = new Scanner(System.in);
	        String flag = "y";
	        while(flag.equalsIgnoreCase("y")){
	        	 System.out.println("enter the email to search::");
	 	        String email =  input.next();
	        	 if(emails.contains(email)){
	        		 System.out.println("List contains given email");
	        		 flag = "n";
	        	 }       	 
		        else
		        {
		        	System.out.println("List does not contains given email");
		        	 flag = "n";
		        }
	        	 System.out.println("do you want to continue:: enter y/n");	  	       
	 	         flag=input.next(); 	
	        }
	            input.close();
	    }  
	}  
	

