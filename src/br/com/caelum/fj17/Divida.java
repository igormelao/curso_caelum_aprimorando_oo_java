package br.com.caelum.fj17;

public class Divida {

	private double total;

	private String credor;
	private Cnpj cnpjCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(Pagamentos pagamentos) {
		this.pagamentos = pagamentos;
	}

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
