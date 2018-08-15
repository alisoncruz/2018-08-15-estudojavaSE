package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idFuncionario;
	private String nome;
	private Double salario = 0.;
	private String funcao;
	private Double adicional = 0.;

	// One to many
	private List<Dependente> dependentes;

	public Funcionario() {
	}

	public Funcionario(Integer idFuncionario, String nome, Double salario, String funcao) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
	}
	
	

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + ", funcao="
				+ funcao + ", adicional=" + adicional + "]";
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public abstract void calcularAdicional() throws Exception;

	public void adicionar(Dependente... d) {
		if (this.dependentes == null) {
			this.dependentes = new ArrayList<>();
		}

		this.dependentes.addAll(Arrays.asList(d));
	}

}
