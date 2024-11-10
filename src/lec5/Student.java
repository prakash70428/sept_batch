package lec5;

public class Student {
    private String name;
    private int age;
    private int rollno;
    
    public void display() {
    	System.out.println("name:" + this.name);
    	System.out.println("age:" + this.age);
    	System.out.println("rollno:" + this.rollno);
    }
    
    //parametrized constructor
    public Student(String name,int age,int rollno) {
    	this.name = name;
    	this.age = age;
    	this.rollno = rollno;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
		if(age < 0) {
			throw new Exception("ageLimitOutofbounds");
		}
		this.age = age;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
    
    
    
}
