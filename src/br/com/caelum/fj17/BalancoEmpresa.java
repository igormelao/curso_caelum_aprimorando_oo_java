package br.com.caelum.fj17;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();

	public void registraDivida(Divida divida) {
		dividas.put(divida.getDocumentoCredor(), divida);
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.get(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
	}
}
