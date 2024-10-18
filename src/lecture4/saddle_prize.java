package lecture4;

import java.util.*;

public class saddle_prize {

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
        
        for(int i=0;i < n;i++) {
        	//1.find min of every row and also its column no.
        	int min = arr[i][0];
        	int colno = 0;
        	
        	for(int col=1;col < n;col++) {
        		if(arr[i][col] < min) {
        			min = arr[i][col];
        			colno = col;
        		}
        	}
        	
        	//2. verification
        	boolean ans = true;
        	for(int row=0;row < n;row++) {
        		if(arr[row][colno] > min) {
        			ans = false;
        			break;
        		}
        	}
        	
        	if(ans == true) {
        		System.out.println(min);
        		return;
        	}
        }
        
        System.out.println("Invalid Input");
	}

}
