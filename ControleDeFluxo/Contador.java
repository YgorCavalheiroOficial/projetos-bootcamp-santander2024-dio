import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo numero deve ser maior que o primeiro!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois){
			throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro!");
		}
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i <= contagem; i++){
			System.out.println(parametroUm + i);
		}
	}
	static class ParametrosInvalidosException extends Exception{
		public ParametrosInvalidosException(String mensagem){

		}
	}
}
 