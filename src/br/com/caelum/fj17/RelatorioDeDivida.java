package br.com.caelum.fj17;

import java.text.NumberFormat;

public class RelatorioDeDivida {

	private Divida divida;

	public RelatorioDeDivida(Divida divida){
		this.divida = divida;
	}
	public void gerarRelatorio(NumberFormat formatador){
		System.out.println("Nome do Credor: " + divida.getCredor());
		System.out.println("CNPJ do Credor: " + divida.getCnpjCredor());
		System.out.println("Valor a pagar: " + formatador.format(divida.getValorAPagar()));
		System.out.println("Valor Total: " + formatador.format(divida.getTotal()));
	}
}
