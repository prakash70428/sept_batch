package lecture4;

import java.util.*;

public class state_of_wakanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //no. of rows
        int m = scn.nextInt(); //no. of columns
        int[][] arr = new int[n][m];
        //user input
        for(int i=0;i < arr.length;i++) {
        	for(int j=0 ;j < arr[0].length;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        for(int j=0;j < m;j++) {
        	if(j%2 == 0) {	
        		for(int i=0 ;i < n;i++) {
        			System.out.print(arr[i][j] +" ");
        		}
        	}else {
        		for(int i=n-1 ;i >= 0;i--) {
        			System.out.print(arr[i][j] + " ");
        		}
        	}
        	System.out.println();
        }
        
	}

}
