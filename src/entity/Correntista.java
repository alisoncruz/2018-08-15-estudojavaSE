package entity;

public class Correntista extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private Double saldo = 0.;

	public Correntista() {
	}

	public Correntista(Integer id, String login, String senha ,String nome, Double saldo) {
		super(id, login, senha);
		this.nome = nome;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", saldo=" + saldo + ", login=" + getLogin() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void main(String[] args) {

		// Correntista correntista = new Co

	}

}
