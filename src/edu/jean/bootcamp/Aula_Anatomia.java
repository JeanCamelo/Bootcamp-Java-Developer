package edu.jean.bootcamp;

public class Aula_Anatomia {

	public static void main(String[] args) {
	
		String nome = "Yuri";
		String sobrenome = "Alberto";
		
		int num1 = 5;
		int num2 = 5;
		
		String result = NomeCompleto(nome, sobrenome);
		
		int sum = Soma(num1, num2);
		int sub = Subtracao(num1, num2);
		int mul = Multiplicacao(num1, num2);
		int div = Divisao(num1, num2);
		
		System.out.println("Nome:" + result);
		
		System.out.println("Resultado: " + sum);
		System.out.println("Resultado: " + sub);
		System.out.println("Resultado: " + mul);
		System.out.println("Resultado: " + div);
	}
	
	public static String NomeCompleto(String primeiro, String segundo ) {
		return primeiro.concat(" ").concat(segundo);
	}
	
	public static int Soma(int primeiro, int segundo) {
		return primeiro + segundo;
	}
	
	public static int Subtracao(int primeiro, int segundo) {
		return primeiro - segundo;
	}
	
	public static int Multiplicacao(int primeiro, int segundo) {
		return primeiro * segundo;
	}
	
	public static int Divisao(int primeiro, int segundo) {
		return primeiro / segundo;
	}

}
