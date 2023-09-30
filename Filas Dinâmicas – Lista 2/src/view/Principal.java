package view;

import controller.OperacaoController;
import model.filaGenerica;
import modelo.Cliente;

public class Principal {

	public static void main(String[] args) {
		OperacaoController<Cliente> controller = new OperacaoController<>();
		filaGenerica<Cliente> filaDeClientes = new filaGenerica<>();
		Cliente[] cliente = new Cliente[20];

		for (int i = 0; i < cliente.length; i++) {// Criando 20 diferentes Clientes
			cliente[i] = new Cliente("Cliente" + String.valueOf(i + 1), (int)(Math.random() * 31) + 20, (float)(Math.random() * 96) + 5);
		}
		for (int i = 0; i < 20; i++) {// Inserindo Clientes na fila
			filaDeClientes.insert(cliente[i]);
		}
		
		controller.caixa(filaDeClientes);

	}

}
