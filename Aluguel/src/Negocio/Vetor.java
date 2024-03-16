package Negocio;

import java.util.Arrays;

import modelagem.Cliente;

public class Vetor {
	
	public Cliente [] clientes = new Cliente [3];
	
	public void adicionarTelefone (int posicao, Cliente cliente) {
	
		clientes[posicao]= cliente;
	}
	public String toString() {
		return Arrays.toString(clientes);
		
	}
}
