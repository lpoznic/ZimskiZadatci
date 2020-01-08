package Edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {

	public static void main(String[] args) {
		
		int a, min=0, max=0, suma=0, i=0;
		
		for(i=0; i<24;i++) {
			a=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj "+ (i+1)));
			suma+=a;
			if(i==0) {
				min=a;
			}
			if(a>max) {
				max=a;
			}
			if(a<min) {
				min=a;
			}
		}
		System.out.println(suma);
		System.out.println(max);
		System.out.println(min);

	}

}
