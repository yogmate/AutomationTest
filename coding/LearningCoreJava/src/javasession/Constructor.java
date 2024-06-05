package javasession;

public class Constructor {
	
   String name;
   int rollno;
   
   public Constructor(String name, int rollno)
   {
	   
	   this.name= name;
	   this.rollno= rollno;
   }

   public static void main(String[] args) {
	
	   Constructor c1= new Constructor("Shubhangi", 101);
	   System.out.println(c1.name);
	   System.out.println(c1.rollno);
	   
	   Constructor c2= new Constructor("Kaustubh", 102);
	   System.out.println(c2.name);
	   System.out.println(c2.rollno);
	   
	   
}
}
