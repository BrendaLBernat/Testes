import java.util.Random;

public class Teste09 {

	public static void main(String[] args) {
		// declara uma variavel para gerar numeros aleatorios
		Random gerador = new Random();

		// gera um numero inteiro aleatorio
		int num = gerador.nextInt();

		System.out.println("O numero gerado é:" + num);
		if (num < 0) {
			System.out.print("esse numero é negativo ");
		} else {
			System.out.print("esse numero é positivo ");
		}

		if (num % 2 == 0) {
			System.out.println("e é par");
		} else {
			System.out.println(" e é impar");

		}

	}
} 
