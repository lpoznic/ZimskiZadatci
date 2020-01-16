package Edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {
		 
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upišite 1. br"));
		 int b=Integer.parseInt(JOptionPane.showInputDialog("Upišite 2. br"));
		 
		 //r-max red, s-max stupac, mins-min stupac, minr-min red
		 int r=b, s=a, poc=1, mins=0, minr=0;
		 int [][] mat=new int [a][b];

		 while(true){
			 
			 if(mins>s) {
				 break;
			 }

		 for(int i=s-1;i>=mins;i--){
			 mat[i][r-1]=poc++;
		 }
		 r--;
		 
		 if(minr>r) {
			 break;
		 }

		 for(int i=r-1;i>=minr;i--){
			 mat[mins][i]=poc++;
		 }
		 mins++;
		 
		 if(mins>s) {
			 break;
		 }

		 for(int i=mins;i<s;i++){
			 mat[i][minr]=poc++;
		 }
		 minr++;
		 
		 if(minr>r) {
			 break;
		 }
		 
		 for(int i=minr;i<r;i++){
			 mat[s-1][i]=poc++;

		 }
		 s--;
		 }
		 for(int i=0;i<b;i++) {
			 for(int j=0;j<a;j++) {
				 System.out.print(mat[j][i] + " ");
			 }
			 System.out.println();
		 }
		 }
}