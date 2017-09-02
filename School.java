public interface information
  {
    void details();
    void address();
  }
  
public class Student implements information
   {
     public void details()
	   {
	     System.out.println("Student details");
	   }
	public void address()
           {
	    System.out.println("Student address");
	   }	
    } 
	
public class Teacher implements information
   {
     public void details()
	   {
	     System.out.println("Teacher details");
	   }
	public void address()
           {
	    System.out.println("Teacher address");
	   }	
    } 
	
public class School
  {
    public static void main(String[] args)
	   {
	     Student s1=new Student();
	       s1.details();
	       s1.address();
		 
             Teacher t1=new Teacher();
               t1.details();
               t1.address();
          }
   }		
	
		












