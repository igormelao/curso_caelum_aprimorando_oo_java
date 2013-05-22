package br.com.caelum.fj17;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas {

	public String endereco;
	public String usuario;
	public String senha;
	public Map<Documento, Divida> dividas = new HashMap<Documento, Divida>();

	public BancoDeDados(String endereco, String usuario, String senha) {
		this.endereco = endereco;
		this.usuario = usuario;
		this.senha = senha;
	}

	public void gravarDivida(Divida divida){
		dividas.put(divida.getDocumentoCredor(), divida);
	}
	
	public Divida recuperarDivida(Documento documentoCredor){
		return dividas.get(documentoCredor);
	}
	
	public void conecta() {
		System.out.println("Conectou");
	}

	public void desconect() {
		System.out.println("Desconectou");
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
