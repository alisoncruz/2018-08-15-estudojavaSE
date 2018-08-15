package control;

import entity.Estagiario;
import entity.Funcionario;
import entity.Gestor;
import entity.Programador;

public class Test {

	public static void main(String[] args) {

		try {

			Funcionario funcionarios[] = new Funcionario[3];

			funcionarios[0] = new Estagiario();
			funcionarios[0].setIdFuncionario(10);
			funcionarios[0].setNome("joao");
			funcionarios[0].setSalario(5000.);
			funcionarios[0].setFuncao("estagiario");

			funcionarios[1] = new Programador();
			funcionarios[1].setIdFuncionario(20);
			funcionarios[1].setNome("alison");
			funcionarios[1].setSalario(7000.);
			funcionarios[1].setFuncao("programador");

			funcionarios[2] = new Gestor();
			funcionarios[2].setIdFuncionario(30);
			funcionarios[2].setNome("edson");
			funcionarios[2].setSalario(10000.);
			funcionarios[2].setFuncao("gestor");

			funcionarios[0].calcularAdicional();
			funcionarios[1].calcularAdicional();
			funcionarios[2].calcularAdicional();
			
			for (Funcionario f : funcionarios) {
				System.out.println(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
