
public class Teste06 {
	public static void main (String [] args) {
		String mensagem = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		
		System.out.println ("a palavra utilizada �: " +mensagem);
		System.out.println ("a palabra em letras min�sculas �: " +mensagem.toLowerCase());
		System.out.println ("o tamanho da palavra �: " +mensagem.length());
		System.out.println ("o caracter na posi��o 0 �: " +mensagem.charAt(0));
		System.out.println ("o caracter na posi��o 3 �: " +mensagem.charAt(3));
		int tamanho = mensagem.length();
		System.out.println ("o caracter na ultima posi��o �: " +mensagem.charAt(tamanho - 1));
		System.out.println ("a posi��o do caracter Z �: " +mensagem.indexOf('Z'));
		System.out.println ("a posi��o do caracter z �: " +mensagem.indexOf('z'));
		
		String part1, part2; 
		part1 = mensagem.substring(0, tamanho/2);
		part2 = mensagem.substring(tamanho/2, tamanho);
		System.out.println ("o String foi dividido em duas partes");
		System.out.println ("a parte 1 �: " +part1+ " e a parte 2 �: " +part2);
	
	}

}
