package entity;

import java.io.Serializable;

import util.Criptografia;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String login;
	private String senha;

	public Usuario() {
	}

	public Usuario(Integer id, String login, String senha) {
		this.id = id;
		this.login = login;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login +"]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public static void main(String[] args) {
		
		Usuario u = new Usuario(10, "acn@gmail.com", "123");
		
		Criptografia.criptografar(u);
		
		System.out.println("Senha criptografada: "+u.getSenha());
	}

}
