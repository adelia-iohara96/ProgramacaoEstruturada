package Visao;

import javax.swing.JOptionPane;

import Negocio.Vetor;
import modelagem.Cliente;

public class SistemadeEmprestimo {

	public static void main(String[] args) {
		
		
		Cliente Lucas = new Cliente ();
		Lucas.setTelefone(Double.parseDouble(JOptionPane.showInputDialog("Insira seu telefone")));
		JOptionPane.showInternalMessageDialog(null, Lucas.getTelefone());	
		Lucas.setCpf(Long.parseLong(JOptionPane.showInputDialog("Insira seu cpf:")));
		JOptionPane.showInputDialog(null,Lucas.getCpf());
	
		Cliente Paulo = new Cliente ();
		Paulo.setTelefone(Double.parseDouble(JOptionPane.showInputDialog("Insira a sua altura ")));
		JOptionPane.showMessageDialog(null, Paulo.getTelefone());
		Paulo.setCpf(Long.parseLong(JOptionPane.showInputDialog("Insira o seu cpf: ")));
		JOptionPane.showMessageDialog(null, Paulo.getCpf());
		
		Cliente Pedro = new Cliente();
		Pedro.setTelefone(Double.parseDouble(JOptionPane.showInputDialog("Insira a sua altura")));
		JOptionPane.showMessageDialog(null, Pedro.getTelefone());
		Pedro.setCpf(Long.parseLong(JOptionPane.showInputDialog("Insira o seu cpf: ")));
		JOptionPane.showMessageDialog(null, Pedro.getCpf());
	
	System.out.println(Lucas.getTelefone());
	System.out.println(Paulo.getTelefone());
	System.out.println(Pedro.getTelefone());
	
	System.out.println(Lucas.getCpf());
	System.out.println(Paulo.getCpf());
	System.out.println(Pedro.getCpf());

	Vetor clientes = new Vetor ();
	clientes.adicionarTelefone(0, Lucas);
	clientes.adicionarTelefone(1, Paulo);
	clientes.adicionarTelefone(2, Pedro);
	}

}
