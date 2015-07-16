package br.com.caelum.tdd.frete;

import br.com.caelum.tdd.beans.Compra;

public class FreteRJ implements Frete {

	@Override
	public double calcula(Compra compra) {
		if (compra.getItens().size() <= 4) {
			return 11.00;
		} else
			return 15.00;
	}
		
}
