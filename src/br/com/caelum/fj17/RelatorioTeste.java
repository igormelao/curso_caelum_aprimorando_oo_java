package br.com.caelum.fj17;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class RelatorioTeste {
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setDocumentoCredor(new Cnpj("00.000.0002/002"));
		divida.setCredor("empresa");
		divida.setTotal(200);
		
		Pagamento pagamento1 = new Pagamento();
		pagamento1.setDocumentoPagador("");
		pagamento1.setData(Calendar.getInstance());
		pagamento1.setPagador("Empresa");
		pagamento1.setValor(200);
		
		divida.registra(pagamento1);
		
		NumberFormat formatadorBrasileiro = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		NumberFormat formatadorAmericano = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		
		RelatorioDeDivida relatorioDeDivida =  new RelatorioDeDivida(divida);
		relatorioDeDivida.gerarRelatorio(formatadorBrasileiro);
		relatorioDeDivida.gerarRelatorio(formatadorAmericano);
	}

}
