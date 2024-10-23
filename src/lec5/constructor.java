package lec5;

public class constructor {
	public static class Person{
		String name = "shloka";
		int age = 19;
		
		public void sayHi() {
			System.out.println(name + "@" + age + " Says Hi");
		}
		
		//default constructor
		public Person() {
			this.name = "jinny";
			this.age = 20;
		}
		//parametrized constructor
		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
//        Person p1 = new Person("saniya",19);
        p1.sayHi();
	}

}
