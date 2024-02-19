package application;

public class Program {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();		
		
		for(long i = 0; i <= Integer.MAX_VALUE; i++) {
			
			System.out.println(i);
		}		

		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("Tempo de execução: " + elapsedTime + " milissegundos");
		
	}

}
