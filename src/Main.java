import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Apolice novoObj = new Apolice();


		Scanner leituraConsole = new Scanner(System.in);

		System.out.println("Informe o nome do segurado:");

		novoObj.setNomeSegurado(leituraConsole.nextLine());
		
		System.out.println("Informe a idade:");
	
		novoObj.setIdade(Integer.valueOf(Integer.valueOf(leituraConsole.nextLine())));

		System.out.println("Informe o valor do prêmio:");
		novoObj.setValorPremio(Double.valueOf(leituraConsole.nextLine()));

		novoObj.imprimir();
		System.out.println("-------");

		novoObj.calcularPremioApolice();
		novoObj.imprimir();
		System.out.println("-------");

		novoObj.oferecerDesconto("belo horizonte");
		novoObj.imprimir();
		System.out.println("-------");
	}
}
