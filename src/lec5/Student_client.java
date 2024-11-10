package lec5;

public class Student_client {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Hello Everyone!");
        Student s1 = new Student("aryan",19,101);
        s1.display();
        
        System.out.println("---------------");
        
        Student s2 = new Student("saniya",20,105);
        s1.setAge(-82);
        s2.display();
        System.out.println("---------------");
        
        Student s3 = new Student("neeraj",21,120);
        s3.display();
	}

}
