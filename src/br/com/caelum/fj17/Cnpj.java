package br.com.caelum.fj17;

public class Cnpj implements Documento{
	private String valor;
	
	public Cnpj(String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private int primeiroDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorreto() {
		// Calcula o segundo dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	@Override
	public int hashCode() {
		return this.valor.hashCode();
	}

	@Override
	public boolean equals(Object objeto) {
		if(!(objeto instanceof Cnpj))
			return false;
		
		Cnpj outroCpnj = (Cnpj) objeto;
		
		return this.valor.equals(outroCpnj.getValor());
	}
	
	@Override
	public String toString() {
		return this.getValor();
	}
	

}
