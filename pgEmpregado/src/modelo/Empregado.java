package modelo;

public class Empregado {
   
	private String nome;
	private Double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double desc(){
		double desconto = (getSalario() * 0.08);
		return desconto;
	}
	
	public double novosal(){
		double novoSalario = (getSalario() - desc());
		return novoSalario;
	}
	
	
}
