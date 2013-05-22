package br.com.caelum.fj17;


public class BalancoEmpresa {

	private ArmazenadorDeDividas dividas;

	public BalancoEmpresa(ArmazenadorDeDividas dividas){
		this.dividas = dividas;
	}
	public void registraDivida(Divida divida) {
		dividas.gravarDivida(divida);
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.recuperarDivida(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
		dividas.gravarDivida(divida);
	}
}
