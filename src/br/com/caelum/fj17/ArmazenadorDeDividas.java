package br.com.caelum.fj17;

public interface ArmazenadorDeDividas {
	public void gravarDivida(Divida divida);
	public Divida recuperarDivida(Documento documentoCredor);
}
