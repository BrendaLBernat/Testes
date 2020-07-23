public class Teste07 {

    public static void main(String args[]) {

        int i1 = 27;
        int i2 = -45;
        double d1 = 84.6;
        double d2 = 0.45;
        //abs (número) - retorna o valor absoluto do mesmo tipo do parâmetro (ex.: inteiro retorna int positivo, decimal retorna float positivo, etc)
        System.out.println("Valor absoluto de i1: " + Math.abs(i1));
        System.out.println("Valor absoluto de i2: " + Math.abs(i2));
        System.out.println("Valor absoluto de d1: " + Math.abs(d1));
        System.out.println("Valor absoluto de d2: " + Math.abs(d2));
        System.out.println("Arredondamentos ---");
        System.out.println("Round de d1: " + Math.round(d1));
        System.out.println("Round de d2: " + Math.round(d2));

        System.out.println("Arredondamentos ---");
        System.out.println("ceil (decimal) - este método retorna o valor decimal do parâmetro sem a parte fracionada."+
                           "Ex.: 2.1 será 2, 6.0 será 6, 10.8 será 10...");
        System.out.println("Ceiling de '" + d1 + "' = " + Math.ceil(d1));        
        System.out.println("Ceiling de '" + d2 + "' = " + Math.ceil(d2));
        
        System.out.println("floor (decimal) - este método retorna o primeiro inteiro após o valor decimal."+
                           "Ex.: 2.1 será 3, 6.0 será 6, 10.8 será 11...");
        System.out.println("Floor de '" + d1 + "' = " + Math.floor(d1));
        System.out.println("Floor de '" + d2 + "' = " + Math.floor(d2));
        
       

        System.out.println("Minimo e maximo ---");
        System.out.println("Minimo entre '" + i1 + "' e '" + i2 + "' = " + Math.min(i1, i2));
        System.out.println("Maximo entre '" + i1 + "' e '" + i2 + "' = " + Math.max(i1, i2));
        System.out.println("Minimo entre '" + d1 + "' e '" + d2 + "' = " + Math.min(d1, d2));
        System.out.println("Maximo entre '" + d1 + "' e '" + d2 + "' = " + Math.max(d1, d2));

        System.out.println("Exponenciacao,logaritmo, potencia e raiz quadrada ---");
        //exp (expoente) - calcula o valor da constante de Euler (E) elevado ao expoent
        System.out.println("exp(" + d2 + ") = " + Math.exp(d2));
        //pow (base, expoente) - calcula a potência da base elevada ao expoente.
        System.out.println("pow(5, 3) = " + Math.pow(5.0, 3.0));
        //sqrt (número) - calcula a raíz quadrada de um número
        System.out.println("sqrt(16) = " + Math.sqrt(16));
        //cbrt (número) - calcula  a raiz cúbica de um número
        System.out.println("cbrt(16) = " + Math.cbrt(16));

        //log (número) - logaritmo natural de um número.        
        System.out.println("log(" + d2 + ") = " + Math.log(d2));
        //log10 (número) - logaritmo natural de um número na base 10
        System.out.println("log10(" + d2 + ") = " + Math.log10(d2));
         //log1p (número) - logaritmo natual de um número somado a 1. Esse método retorna um resultado mais confiável
        //se o número em questão for muito próximo a 0 ou um número fracionado. Ou seja, o resultado não é o mesmo entre 
        //os métodos log1p (0.1f) e log (1+0.1f)
        System.out.println("log1p(" + d2 + ") = " + Math.log1p(d2));
        
        
        // A classe Math possui duas constantes que são o Π (pi) e E (base de logaritmos naturais ou neperianos) 
        //cada uma com o valor de 3,141592653589793 e 2.718281828459045, respectivamente.
        System.out.println(Math.PI);
    }
}

