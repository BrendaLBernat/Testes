
public class Teste03 {

	public static void main(String[] argas) {
		// declara a vari�vel bilhao

		int bilhao;

		bilhao = 1000000000;

		/*
		 * System.out.
		 * println("Cuidado ao concatenar conte�dos. O resultado pode ser inesperado!");
		 * System.out.println("um bilhao = " + bilhao);
		 * System.out.println("Dois bilhoes = " + bilhao + bilhao);
		 * System.out.println("Tr�s bilhoes = " + bilhao + bilhao + bilhao);
		 * System.out.println("------------------------");
		 * System.out.println("Forma errada 2:"); System.out.println("Um bilh�o= " +
		 * bilhao);
		 * 
		 * bilhao = bilhao + bilhao; System.out.println("Dois bilhoes = " + bilhao);
		 * 
		 * bilhao = bilhao + bilhao; System.out.println("Tr�s bilhoes = " + bilhao);
		 * 
		 * System.out.println("-------------------------");
		 * System.out.println("como corrigir esse erro?");
		 * System.out.println("Dica: utilize duas vari�veis");
		 * System.out.println("Doca: observe os tipos das vari�veis");
		 * 
		 * System.out.println("-------------------------");
		 */

		System.out.println("Minha tentativa!!");
		System.out.println("Um bilh�o=" + bilhao);
		long temp = bilhao;
		temp = bilhao + bilhao;
		System.out.println("Dois bilhoes=" + temp);
		temp = temp + bilhao;

		System.out.println("Tr�s bilhoes=" + temp);
		temp = temp + bilhao;
		System.out.println("Quatro bilhoes=" + temp);

	}
}