import java.io.*;

public class Teste02 {

	public static void main(String[] argas) throws IOException {
		// como ler do teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite sua idade: ");

		// le do teclado e armazena o conte�do na vari�vel resposta
		String resposta = in.readLine();

		// declara uma vari�vel do tipo inteiro para receber o numero da idade

		int idade = Integer.parseInt(resposta); // converte um string para inteiro

		System.out.println("Voc� tem " + idade + " anos agora");

		// declara outra vari�vel para calcular o ano de nascimento
		int ano;

		ano = 2020 - idade;
		System.out.println("Voc� provavelmente nasceu no ano de: " + ano);

	}
}
