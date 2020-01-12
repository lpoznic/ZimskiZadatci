package Edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {
	
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj 1"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj 2"));
		int poc=1;
		int[][] mat= new int [a][b];
		
		for(int i=a; i>0 ;i--) {
			
			mat[i][b]=poc++;
			System.out.println(mat[i][b]);
			
		}
		
	}
}