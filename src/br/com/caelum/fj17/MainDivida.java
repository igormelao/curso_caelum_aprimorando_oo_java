package br.com.caelum.fj17;

public class MainDivida {

	public static void main(String[] args) {
		BancoDeDados bd = new BancoDeDados("localhost", "usuario", "12345");
		BalancoEmpresa balancoEmpresa = new BalancoEmpresa(bd);
		Divida divida = new Divida();
		Documento documentoCredor = new Cpf();
		divida.setDocumentoCredor(documentoCredor);
		bd.conecta();
		balancoEmpresa.registraDivida(divida);
		Pagamento pagamento =  new Pagamento();
		balancoEmpresa.pagaDivida(documentoCredor, pagamento);
		bd.desconect();
	}

}
