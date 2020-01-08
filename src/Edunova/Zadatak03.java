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
		
		for(i=min ; i<max+1; i++) {
			for(j=0 ; j<min+1; j++) {
				if(i%j!=0) {
				System.out.println(i);
				}
			}
		}

	}

}
