package entities;

public enum TipoMovimento {
	SACAR(1),
	DEPOSITAR(2),
	TRANSFERIR(3);
	
	private int codigo;
	
	private TipoMovimento(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
