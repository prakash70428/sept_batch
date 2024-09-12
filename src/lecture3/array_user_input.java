package lecture3;
import java.util.*;
public class array_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        //user input
        for(int i=0 ;i < arr.length;i++) {
        	arr[i] = scn.nextInt();
        }
        
        //output
        for(int i=0 ;i < arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
