package Edunova;

public class Zadatak02 {

	public static void main(String[] args) {
		int i, j;
		for(i=0; i<15;i++) {
			for(j=0; j<15;j++) {
				System.out.print((i+1)*(j+1) + " ");
				if((i+1)<10) {
					System.out.print(" ");
				}
				if((i+1)>9 && (i+1)<100) {
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}

}
