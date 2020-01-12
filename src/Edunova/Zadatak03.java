package Edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj 1"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj 2"));
		int i, j, max, min;
		if(a>b) {
			max=a; 
			min=b;
		}else {
			min=a; 
			max=b;
		}
		
		
		for(j=min;j<max+1;j++) {
			boolean nprim = false;
	        for(i = 2; i <= j/2; ++i)
	        {
	            if(j % i == 0)
	            {
	                nprim = true;
	                break;
	            }
	        }
	        if (!nprim)
	            System.out.println(j + " je prim broj.");
		}
	}
}