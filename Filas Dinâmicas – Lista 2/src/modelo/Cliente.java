package modelo;

public class Cliente {
	
	public String nome;
	public int quantidadePecas;
	public float valorPecas;
	
	public Cliente(){
		super();
	}
	
	public Cliente(String NomeCliente, int QuantidadeDePecas, float ValorDasPecas) {
		this.nome = NomeCliente;
		this.quantidadePecas = QuantidadeDePecas;
		this.valorPecas = ValorDasPecas;
	}
	
	@Override
    public String toString() {
        return String.format("Nome: %s \nQuantidade de Peças: %d \nValor das Peças: %.2f \n", nome, quantidadePecas, valorPecas);
    }
}
