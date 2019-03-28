package mario;

import java.util.Scanner;

public class mario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int height;
		int spaces;
		int hashes;
		
		do {
			System.out.print("Height: ");
			height = entrada.nextInt();
		} while (height < 0 || height > 23);
		
		for (int i = 0; i < height; i++) {
			for (spaces = height - i -1; spaces > 0; spaces--) {
				System.out.print(" ");
			}
			for (hashes = 0; hashes < (i + 1); hashes++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}
