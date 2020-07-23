
public class Teste03 {

	public static void main(String[] argas) {
		// declara a variável bilhao

		int bilhao;

		bilhao = 1000000000;

		/*
		 * System.out.
		 * println("Cuidado ao concatenar conteúdos. O resultado pode ser inesperado!");
		 * System.out.println("um bilhao = " + bilhao);
		 * System.out.println("Dois bilhoes = " + bilhao + bilhao);
		 * System.out.println("Três bilhoes = " + bilhao + bilhao + bilhao);
		 * System.out.println("------------------------");
		 * System.out.println("Forma errada 2:"); System.out.println("Um bilhão= " +
		 * bilhao);
		 * 
		 * bilhao = bilhao + bilhao; System.out.println("Dois bilhoes = " + bilhao);
		 * 
		 * bilhao = bilhao + bilhao; System.out.println("Três bilhoes = " + bilhao);
		 * 
		 * System.out.println("-------------------------");
		 * System.out.println("como corrigir esse erro?");
		 * System.out.println("Dica: utilize duas variáveis");
		 * System.out.println("Doca: observe os tipos das variáveis");
		 * 
		 * System.out.println("-------------------------");
		 */

		System.out.println("Minha tentativa!!");
		System.out.println("Um bilhão=" + bilhao);
		long temp = bilhao;
		temp = bilhao + bilhao;
		System.out.println("Dois bilhoes=" + temp);
		temp = temp + bilhao;

		System.out.println("Três bilhoes=" + temp);
		temp = temp + bilhao;
		System.out.println("Quatro bilhoes=" + temp);

	}
}