package entity;

public class Gestor extends Funcionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void calcularAdicional() throws Exception{

		if (getSalario() == null) {
			throw new Exception("Salario null");
		}
		
		setAdicional(getSalario() * 0.0);
		setSalario(getSalario() + getAdicional());

	}

}
