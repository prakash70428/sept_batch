package lecture3;
import java.util.*;
public class span_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        //user input
        for(int i=0 ;i < arr.length;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for(int i=1 ;i < arr.length;i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        	}
        	
        	if(arr[i] < min) {
        		min = arr[i];
        	}	
        }
        
        int span = max - min;
        System.out.println("span:" + span);
	}

}
