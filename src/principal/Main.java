package principal;

import entidade.Gato;
import entidade.Cachorro;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		System.out.println(gato.Emitir_som());	
		
		Cachorro cachorro = new Cachorro();
		System.out.println(cachorro.Emitir_som());
		
		Vaca vaca = new Vaca();
		System.out.println(vaca.Emitir_som());
	}

}
