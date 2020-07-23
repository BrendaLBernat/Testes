import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste08 {
	// determinar se todos os digitos de um numero são iguais

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Informe um número: ");
		String resposta = in.readLine();
		// le do teclado e armazena o conteudo na variavel resposta

		// declara uma variavel do tipo inteiro para receber o numero da idade
		int x = Integer.parseInt(resposta); // converte o string em inteiro

		int r1, r2; // variaveis temporarias
		boolean saoIguais = true;

		r1 = x % 10;
		while (x > 0) {
			r2 = x % 10;
			if (r2 != r1) { // encontrou um digito diferente
				saoIguais = false;
				break;
			} else {
				x = (int) Math.floor(x / 10);
			}
		} // fim do while

		if (saoIguais) {
			System.out.println("Todos os digitos do numero " + resposta + " são iguais");
		} else {
			System.out.println("Alguns digitos do numero " + resposta + " não são iguais");
		}
	}
}
