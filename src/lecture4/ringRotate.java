package lecture4;

import java.util.*;

public class ringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i < n;i++) {
        	for(int j=0;j < m;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        int sno = scn.nextInt();
        int rno = scn.nextInt();
        
        ringRotate(arr,sno,rno);
        display(arr);
	}
	public static void ringRotate(int[][] arr,int sno,int rno) {
		int[] la = fill1Dfrom2D(arr,sno);
		rotate1D(la,rno);
		fill2Dfrom1D(arr,la,sno);
	}
	public static int[] fill1Dfrom2D(int[][] arr,int s) {
		int rmin = s - 1;
		int cmin = s - 1;
		int rmax = arr.length - s;
		int cmax = arr[0].length - s;
		
		int sz = 2*(rmax + cmax - rmin - cmin);
		int[] la = new int[sz];
		int idx = 0;
		
		//left boundary
    	for(int row=rmin;row <= rmax;row++) {
    		la[idx] = arr[row][cmin];
    		idx++;
    	}
    	cmin++;
    	//bottom boundary
    	for(int col=cmin;col <= cmax;col++) {
    		la[idx] = arr[rmax][col];
    		idx++;
    	}
    	rmax--;
    	//right boundary
    	for(int row=rmax;row >= rmin;row--) {
    		la[idx] = arr[row][cmax];
    		idx++;
    	}
    	cmax--;
    	//top boundary
    	for(int col=cmax;col >= cmin;col--) {
    		la[idx] = arr[rmin][col];
    		idx++;
    	}
		
		return la;
	}
	public static void rotate1D(int[] la,int r) {
		r = r % la.length;
		if(r < 0) {
			r += la.length;
		}
		
		reverse(la,0,la.length - 1);
		reverse(la,0,r - 1);
		reverse(la,r,la.length - 1);
	}
	public static void reverse(int[] la,int left,int right) {
		while(left < right) {
			int temp = la[left];
			la[left] = la[right];
			la[right] = temp;
			
			left++;
			right--;
		}
	}
	public static void fill2Dfrom1D(int[][] arr,int[] la,int s) {
		int rmin = s - 1;
		int cmin = s - 1;
		int rmax = arr.length - s;
		int cmax = arr[0].length - s;
		
		int idx = 0;
		
		//left boundary
    	for(int row=rmin;row <= rmax;row++) {
    	    arr[row][cmin] = la[idx];
    		idx++;
    	}
    	cmin++;
    	//bottom boundary
    	for(int col=cmin;col <= cmax;col++) {
    		arr[rmax][col] = la[idx];
    		idx++;
    	}
    	rmax--;
    	//right boundary
    	for(int row=rmax;row >= rmin;row--) {
    		arr[row][cmax] = la[idx];
    		idx++;
    	}
    	cmax--;
    	//top boundary
    	for(int col=cmax;col >= cmin;col--) {
    		arr[rmin][col] = la[idx];
    		idx++;
    	}
		
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i < arr.length;i++) {
        	for(int j=0;j < arr[0].length;j++) {
        		System.out.print(arr[i][j] + " ");
        	}
        	System.out.println();
        }
	}

}
