import java.io.*;

public class Teste02 {

	public static void main(String[] argas) throws IOException {
		// como ler do teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite sua idade: ");

		// le do teclado e armazena o conteúdo na variável resposta
		String resposta = in.readLine();

		// declara uma variável do tipo inteiro para receber o numero da idade

		int idade = Integer.parseInt(resposta); // converte um string para inteiro

		System.out.println("Você tem " + idade + " anos agora");

		// declara outra variável para calcular o ano de nascimento
		int ano;

		ano = 2020 - idade;
		System.out.println("Você provavelmente nasceu no ano de: " + ano);

	}
}
