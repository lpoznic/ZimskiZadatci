package Edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {
		
		int[][] matA= new int [4][4];
		int[][] matB= new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matA[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj Matrice A " + (i+1) + " " + (j+1)));
				matB[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Upišite broj Matrice B " + (i+1) + " " + (j+1)));
				
				System.out.print(matA[i][j]+matB[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
