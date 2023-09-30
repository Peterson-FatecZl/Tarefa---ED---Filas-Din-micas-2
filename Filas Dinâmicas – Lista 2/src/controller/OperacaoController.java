package controller;

import model.filaGenerica;
import modelo.Cliente;

public class OperacaoController<T> {

	private Cliente _VariaveluAxiliarTipoCliente = new Cliente();
	public OperacaoController() {
		super();
	}
	
	public void caixa(filaGenerica<T> fila) {
		try {
			for(int ctd = 0; ctd < fila.size(); ctd++) {
				_VariaveluAxiliarTipoCliente = (Cliente) fila.remove();
				System.out.println(_VariaveluAxiliarTipoCliente);
				double ValorAPagar = _VariaveluAxiliarTipoCliente.quantidadePecas * _VariaveluAxiliarTipoCliente.valorPecas;
				System.out.printf("%s Deve Pagar %.2f \n", _VariaveluAxiliarTipoCliente.nome, ValorAPagar);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
