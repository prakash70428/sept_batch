package lecture4;

import java.util.*;

public class state_of_wakanda_2 {

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
        
        for(int diag = 0;diag < n;diag++) {
        	for(int i=0,j=diag ; j < n; i++,j++) {
        		System.out.println(arr[i][j]);
        	}
        }
//        
//        for(int diag = 0;diag < n;diag++) {
//        	int i = 0;
//        	int j = diag;
//        	
//        	while(i < n && j < n) {
//        		System.out.println(arr[i][j]);
//        		i++;
//        		j++;
//        	}
//        }
	}

}
