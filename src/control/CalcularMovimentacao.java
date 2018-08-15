package control;

import java.util.Date;

import entity.Correntista;
import entity.Movimentacao;

public class CalcularMovimentacao {
	
	
	public static void calcular(Movimentacao mv, Correntista co) throws Exception {
		if(mv.getOperacao().equalsIgnoreCase("deposito")) {
			depositar(mv, co);
		} else {
			retirar(mv, co);
		}
	}

	public static void depositar(Movimentacao mv, Correntista co) throws Exception {

		if(mv.getValor()==null || co.getSaldo()==null) {
			throw new Exception("Valor não pode ser null");
		}
		
		if(mv.getValor() < 0) {
			throw new Exception("Valor nao pode ser negativo");
		}
		if (mv.getOperacao().equalsIgnoreCase("deposito")) {
			co.setSaldo(co.getSaldo() + mv.getValor());
		}
	}
	
	
	public static void retirar(Movimentacao mv, Correntista co) throws Exception {

		if(mv.getValor()==null || co.getSaldo()==null) {
			throw new Exception("Valor não pode ser null");
		}
		
		if(mv.getValor() < 0) {
			throw new Exception("Valor da movimentacao nao pode ser negativo");
		}
		
		if(mv.getValor() > co.getSaldo()) {
			throw new Exception("Valor da movimentacao não pode ser maior que o saldo");
		}
		
		if(co.getSaldo() < 0 ) {
			throw new Exception("Saldo negativo");
		}
		
		if (mv.getOperacao().equalsIgnoreCase("retirar")) {
			co.setSaldo(co.getSaldo() - mv.getValor());
		}
	}
	
	public static void main(String[] args) {
		
		
		Correntista co = new Correntista(10, "acn@gmail.com", "123", "alison", 10000.);
		Movimentacao mv = new Movimentacao(1000, "retirar", 5000., new Date());
		
		try {
			
			System.out.println("saldo anterior: "+co.getSaldo());
			
			CalcularMovimentacao.calcular(mv, co);
			
			System.out.println("saldo pos movimentacao: "+co);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
