package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Dependente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private LocalDate dataNascimento;
	private Integer idade;

	public static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	public Dependente() {
	}

	public Dependente(Integer id, String nome, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Dependente [id=" + id + ", nome=" + nome + ", dataNascimento=" + SDF.format(dataNascimento) + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static SimpleDateFormat getSDF() {
		return SDF;
	}

	public static void setSDF(SimpleDateFormat sDF) {
		SDF = sDF;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdade() {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataNasc = this.dataNascimento;
		Period period = Period.between(dataNasc, dataAtual);
		return period.getYears();
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		
		Dependente d = new Dependente(10, "alison", LocalDate.of(1983, 11, 9));
		
		System.out.println("Idade: "+d.getIdade());
	}

}
