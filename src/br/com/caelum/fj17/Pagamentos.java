package br.com.caelum.fj17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento>{

	private double valorPago;
	
	private Collection<Pagamento> pagamentos = new ArrayList<Pagamento>();

	public Collection<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public double getValorPago() {
		return this.valorPago;
	}
	
	
	public void paga(Pagamento pagamento){
		double valor = pagamento.getValor();
		if (valor < 0) {
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	public void registra(Pagamento pagamento) {
		this.paga(pagamento);
		this.pagamentos.add(pagamento);
	}

	public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Collection<Pagamento> pagamentosDo(String cnpjPagador) {
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	@Override
	public Iterator<Pagamento> iterator() {
		return pagamentos.iterator();
	}
}
