package listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListofObjectSortExampleWithComparableAndComparator {

	
	public static <T> void main(String args[]){
		   ArrayList<Student> arraylist = new ArrayList<Student>();
		 
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		  // Collections.sort(arraylist);
		   //Exception in thread “main” java.lang.Error: Unresolved compilation problem:
			//   Bound mismatch: The generic method sort(List) of type Collections is not applicable for the arguments (ArrayList). The inferred type Student is not a valid substitute for the bounded parameter > at 
		   for(Student student: arraylist){
				System.out.println(student);
		   }
		   System.out.println("");
		   System.out.println("---Implementing Comparable With Age---------");
		  
		   ArrayList<Student1> studentslist = new ArrayList<Student1>();
			 
		   studentslist.add(new Student1(245, "Rahul", 24));
		   studentslist.add(new Student1(209, "Ajeet", 32));

		  Collections.sort(studentslist);
		 
		  for(Student1 student: studentslist){
				System.out.println(student);
		   }
		  
		  System.out.println("");
		 
	
		   ArrayList<StudentSortWithComparator> arraylist1 = new ArrayList<>();
		   arraylist1.add(new StudentSortWithComparator(101, "Zues", 26));
		   arraylist1.add(new StudentSortWithComparator(505, "Abey", 24));
		   arraylist1.add(new StudentSortWithComparator(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist1, StudentSortWithComparator.StuNameComparator);

		   for(StudentSortWithComparator str: arraylist1){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylist1, StudentSortWithComparator.StuRollno);
		   for(StudentSortWithComparator str: arraylist1){
				System.out.println(str);
		   }

	
	
	
	
	}

	
	
	
	
	
	
	
	
}

 class Student  {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }	
    
    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}
 
 class Student1 implements Comparable {
	    private String studentname;
	    private int rollno;
	    private int studentage;

	    public Student1(int rollno, String studentname, int studentage) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
	    }
	   
	    public String getStudentname() {
			return studentname;
		}

		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public int getStudentage() {
			return studentage;
		}

		public void setStudentage(int studentage) {
			this.studentage = studentage;
		}

		

	    @Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	    }


		@Override
		public int compareTo(Object comparestu) {
			int compareage=((Student1)comparestu).getStudentage();
	        /* For Ascending order*/
	        return this.studentage-compareage;

	        /* For Descending order do like this */
	        //return compareage-this.studentage;
		}

		
	}
 
 class StudentSortWithComparator   {
	    private String studentname;
	    private int rollno;
	    private int studentage;

	    public StudentSortWithComparator(int rollno, String studentname, int studentage) {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
	    }
	   
	    
	    /*Comparator for sorting the list by Student Name*/
	    public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public int getStudentage() {
			return studentage;
		}
		public void setStudentage(int studentage) {
			this.studentage = studentage;
		}
		


		public static Comparator<StudentSortWithComparator> StuNameComparator = new Comparator<StudentSortWithComparator>() {

		public int compare(StudentSortWithComparator s1, StudentSortWithComparator s2) {
		   String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};

	    /*Comparator for sorting the list by roll no*/
	    public static Comparator<StudentSortWithComparator> StuRollno = new Comparator<StudentSortWithComparator>() {

		public int compare(StudentSortWithComparator s1, StudentSortWithComparator s2) {

		   int rollno1 = s1.getRollno();
		   int rollno2 = s2.getRollno();

		   /*For ascending order*/
		   return rollno1-rollno2;

		   /*For descending order*/
		   //rollno2-rollno1;
	   }};
	    @Override
	    public String toString() {
	        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	    }
	    
 }
 

