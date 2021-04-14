public class Apolice {

	// atributos
	private String nomeSegurado;
	private int idade;
	private double valorPremio;

	// construtores
	public Apolice() {
		this.nomeSegurado = "";
		this.idade = 0;
		this.valorPremio = 0.0;
	}

	public Apolice(String nomeSegurado, int idade, double valorPremio) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}

	// métodos
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public String getNomeSegurado() {
		return this.nomeSegurado;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Favor informar valor positivo para idade");
		} else {
			this.idade = idade;
		}
	}

	public int getIdade() {
		return this.idade;
	}

	public void setValorPremio(double valorPremio) {
		if (valorPremio < 0) {
			System.out.println("Favor informar valor positivo para Valor Prêmio");
		} else {
			this.valorPremio = valorPremio;
		}
	}

	public double getValorPremio() {
		return this.valorPremio;
	}

	public void imprimir() {
		System.out.println("Nome Segurado: " + getNomeSegurado());
		System.out.println("Idade: " + getIdade());
		System.out.println("Valor Prêmio: " + getValorPremio());
	}

	public void calcularPremioApolice() {


		if (getIdade() >= 18 && getIdade() <= 25) {
			valorPremio += (valorPremio * 20) / 100;
		}

		if (getIdade() > 25 && getIdade() <= 36) {
			valorPremio += (valorPremio * 15) / 100;
		}

		if (getIdade() > 36) {
			valorPremio += (valorPremio * 10) / 100;
		}
	}

	public void oferecerDesconto(String cidade) {
		if (cidade.equalsIgnoreCase("manaus")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 20 / 100;
		}

		if (cidade.equalsIgnoreCase("belém")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 15 / 100;
		}
		if (cidade.equalsIgnoreCase("belo horizonte")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 10 / 100;
		}
		if (cidade.equalsIgnoreCase("são paulo")) {
			this.valorPremio = this.valorPremio - this.valorPremio * 5 / 100;
		}
	}

}
