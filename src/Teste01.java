import java.io.*;

public class Teste01 {

	public static void main(String[] args) throws IOException {
		// como ler do teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite seu nome:");
		// declara uma variável para receber o que foi digitado pelo usário

		String meuNome;

		// faz a leitura
		meuNome = in.readLine();

		System.out.println("Olá " + meuNome);

	}

}
