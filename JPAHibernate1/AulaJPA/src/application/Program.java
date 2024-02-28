package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		

		Pessoa p1 = new Pessoa(1, "Pedro Luis", "pedro@gmail.com");
		Pessoa p2 = new Pessoa(1, "Loretinha Andrade", "loreta@gmail.com");
		Pessoa p3 = new Pessoa(1, "Jose Antonio", "jose@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
