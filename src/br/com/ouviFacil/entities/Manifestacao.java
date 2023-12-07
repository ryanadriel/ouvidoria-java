package br.com.ouviFacil.entities;

public class Manifestacao {

	private int codigo;
	private String manifesto;
	private String tipo;

	public Manifestacao(int codigo, String manifesto, String tipo) {
		this.codigo = codigo;
		this.manifesto = manifesto;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getManifesto() {
		return manifesto;
	}

	public void setManifesto(String manifesto) {
		this.manifesto = manifesto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
