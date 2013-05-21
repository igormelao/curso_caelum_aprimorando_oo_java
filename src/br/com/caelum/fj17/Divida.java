package br.com.caelum.fj17;

public class Divida {

	private double total;

	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();

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
	
	public void registra(Pagamento pagamento){
		pagamentos.registra(pagamento);
	}

	public double getValorAPagar() {
		return this.getTotal() - pagamentos.getValorPago();
	}

	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

}
