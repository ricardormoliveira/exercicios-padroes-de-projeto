package br.com.caelum.tdd.frete;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;

public class FreteOutrosTest {
	
	private Frete freteOutros;
	private FreteFactory fabricaFretes;
	
	@Before
	public void setUp() {	
		fabricaFretes = new FreteFactory();
	}
	
	@Test
	public void testeCalculoFreteOutros(){
		Cliente cliente = new Cliente("Ricardo", Estado.OUTRAS_REGIOES);
		Item item1 = new Item("Iphone 4", 900, 3);	
		Item item2 = new Item("Macbook", 1200, 2);	
		Item item3 = new Item("TV 52 Polegadas", 3200, 1);		
		Item item4 = new Item("DVD Philips", 3200, 1);
		Compra compra = new Compra(Arrays.asList(item1, item2, item3, item4), cliente);		
		freteOutros = fabricaFretes.cria(compra);
		assertEquals(25.00, freteOutros.calcula(compra), 0.0001);	
	}
}
