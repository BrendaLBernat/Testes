
public class Teste04 {

	public static void main(String[] args) {
		// programa para extrair digitos de um número

		int num = 4584;
		// declara uma variavel inteira e da um valor a ela

		System.out.println("num= " + num);
		System.out.print("Os digitos de num são: ");

		System.out.print(num / 1000);
		num = num % 1000;
		System.out.print(", " + num / 100);
		num = num % 100;

		System.out.print(", " + num / 10);
		num = num % 10;
		System.out.println(" e " + num);

		System.out.println("teste com outros numeros!!");

	}

}
