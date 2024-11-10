package lec5;
import java.util.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 1
//        C obj = new C();
//        System.out.println(obj.d1);
//        System.out.println(obj.d2);
//        obj.fun();
//        obj.fun1();
		 
		//case 2
		P obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(((C)(obj)).d2);
	}

}
