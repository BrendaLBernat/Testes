
import java.io.IOException;
import java.util.*;

public class Teste10 {
	public static void main(String[] args) throws IOException {
		Random random = new Random();

		// declara tres variaveis
		float a = random.nextFloat();
		float b = random.nextFloat();
		float c = random.nextFloat();

		System.out.println("os numeros gerados são: " + a + ", " + b + " e " + c);

		if (a < b) {
			if (b < c) {
				System.out.println("a < b < c");
			} else {
				if (a < c) {
					System.out.println("a < c < b");
				} else {
					System.out.println("c < a < b");
				}
			}

		} else {
			if (a < c) {
				System.out.println("b < a < c");
			} else {
				if (b < c) {
					System.out.println("b < c < a");
				} else {
					System.out.println("a < b < a");
				}
			}
		}

	}
}
