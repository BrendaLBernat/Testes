
import java.util.*;
import java.io.*;

public class Teste11 {
	public static void main(String[] args) throws IOException {
		Random random = new Random();

		// declara três variaveis
		float a = random.nextFloat(); // gera um numero aleatorio real
		float b = random.nextFloat();
		float c = random.nextFloat();

		System.out.println("os numeros sao: " + a + ", " + b + " e " + c);


		if (a < b && b < c) {
			System.out.println("a < b < c");
		}
		if (a < c && c < b) {
			System.out.println("a < c < b");
		}
		if (b < a && a < c) {
			System.out.println("b < a < c");
		}
		if (b < c && c < a) {
			System.out.println("b < c < a");
		}
		if (c < a && a < b) {
			System.out.println("c < a < b");
		}
		if (c < b && b < a) {
			System.out.println("c < b < a");
		}

	}
}