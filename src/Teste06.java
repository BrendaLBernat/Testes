
public class Teste06 {
	public static void main (String [] args) {
		String mensagem = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		
		System.out.println ("a palavra utilizada é: " +mensagem);
		System.out.println ("a palabra em letras minúsculas é: " +mensagem.toLowerCase());
		System.out.println ("o tamanho da palavra é: " +mensagem.length());
		System.out.println ("o caracter na posição 0 é: " +mensagem.charAt(0));
		System.out.println ("o caracter na posição 3 é: " +mensagem.charAt(3));
		int tamanho = mensagem.length();
		System.out.println ("o caracter na ultima posição é: " +mensagem.charAt(tamanho - 1));
		System.out.println ("a posição do caracter Z é: " +mensagem.indexOf('Z'));
		System.out.println ("a posição do caracter z é: " +mensagem.indexOf('z'));
		
		String part1, part2; 
		part1 = mensagem.substring(0, tamanho/2);
		part2 = mensagem.substring(tamanho/2, tamanho);
		System.out.println ("o String foi dividido em duas partes");
		System.out.println ("a parte 1 é: " +part1+ " e a parte 2 é: " +part2);
	
	}

}
