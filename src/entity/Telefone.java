package entity;

import java.io.Serializable;

public class Telefone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String numero;
	private String operadora;

	public Telefone() {
	}

	public Telefone(Integer id, String numero, String operadora) {
		this.id = id;
		this.numero = numero;
		this.operadora = operadora;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", numero=" + numero + ", operadora=" + operadora + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
