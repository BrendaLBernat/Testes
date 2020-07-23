import java.io.*;

public class Teste05 {
	public static void main (String [] args )throws IOException {
		// programa para converter de Fahrenheit para Celcius
		
		//como ler do teclado
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("Digite a temperatura em Fahrenheit:");
		String resposta = in.readLine(); 
		
		//usa o String da respota e converte para um valor inteiro e armazena na variavel fahrenheit
		int fahrenheit = new Integer(resposta).intValue();
		
		//formula: C= 5*(F-32)/9
		
		System.out.print (fahrenheit+ " graus F = ");
		
		int celsius = 5*(fahrenheit-32)/9;
		
		System.out.println (celsius+ " graus C");
	}

}
