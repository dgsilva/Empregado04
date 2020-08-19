package principal;

import javax.swing.JOptionPane;

import modelo.Empregado;

public class EmpregadoMain {
    public static void main(String[] args) {
//		String nome = JOptionPane.showInputDialog("Qual é o nome do empregado?");
//		Double salb = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do empregado"));
//		double desc = (salb*0.08);
//		double novosal = (salb-desc);
//		JOptionPane.showMessageDialog(null, "O valor do desconto de 8% foi " + desc);
//		JOptionPane.showMessageDialog(null, "O seu novo salario é " + novosal);
    	Empregado e = new Empregado();
    	e.setNome(JOptionPane.showInputDialog("Qual é o nome do empregado?"));
    	e.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do empregado")));
    	e.desc();
    	e.novosal();
    	JOptionPane.showMessageDialog(null,"Desconto de 8%: " + e.desc());
    	JOptionPane.showMessageDialog(null, "O nome do funcionario é: " + e.getNome() +  "\nO salario Liquido é: " +e.novosal());
    	
		
	}
    
}
