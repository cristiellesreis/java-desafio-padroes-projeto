

import one.digitalInnovation.gof.singleton.SingletonEager;
import one.digitalInnovation.gof.singleton.SingletonLazy;
import one.digitalInnovation.gof.singleton.SingletonLazyHolder;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
	
	
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder Lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(Lazyholder);
		Lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(Lazyholder);
		
		//Strategy
		
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "11718-050");
		
	}
}
