package lecture4;
import java.util.*; 
public class search_in_sorted_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //no. of rows
        int[][] arr = new int[n][n];
        //user input
        for(int i=0;i < arr.length;i++) {
        	for(int j=0 ;j < arr[0].length;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        int data = scn.nextInt();
        
        int i = n - 1;
        int j = 0;
        
        while(i >= 0 && j < n) {
        	if(arr[i][j] == data) {
        		System.out.println(i);
        		System.out.println(j);
        		return;
        	}
        	else if(arr[i][j] > data) {
        		i--;
        	}
        	else {
        		j++;
        	}
        }
        
        System.out.println("element not found");
	}

}
