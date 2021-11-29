package practice;

public class pyramid {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-(i+1); j++) {
				System.out.println(" ");
			}
			for(int k=0; k<(i+1)*2-1; k++) {
				System.out.println("*");
			}
			System.out.print("\n");
		}
	}
}
