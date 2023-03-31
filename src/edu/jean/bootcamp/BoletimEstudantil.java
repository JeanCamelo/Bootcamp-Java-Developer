package edu.jean.bootcamp;

public class BoletimEstudantil {

	public static void main(String[] args) {
		double mediaFinal = 3.9;
		if(mediaFinal < 4)
			System.out.println("Reprovado");
		if(mediaFinal >= 4 && mediaFinal <6.9)
			System.out.println("Avaliação Final");
		else if(mediaFinal > 7)
			System.out.println("Aprovado");

	}

}
