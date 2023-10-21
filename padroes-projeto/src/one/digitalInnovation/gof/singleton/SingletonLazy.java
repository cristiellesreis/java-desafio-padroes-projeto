package one.digitalInnovation.gof.singleton;

/**
 * Sngleton "pregui�oso" - padrao de implementacao
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
