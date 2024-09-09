package lec1;
import java.util.*;
public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int space = n - 1;
        int star = 1;
        int val = 1;
        
        while(row <= 2*n - 1) {
        	//space
        	int i = 1;
        	while(i <= space) {
        		System.out.print("  ");
        		i = i + 1;
        	}
        	//star
        	int j = 1;
        	int p = val;
        	while(j <= star) {
        		System.out.print(p + " ");
        		if(j < star/2 + 1) {
        			p++;
        		}else {
        			p--;
        		}
        		
        		j = j + 1;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n) {
        		space--;
        		star += 2;
        		val++;
        	}else {
        		space++;
        		star -= 2;
        		val--;
        	}
        	
        	row = row + 1;
        	System.out.println();
        }
	}
}
