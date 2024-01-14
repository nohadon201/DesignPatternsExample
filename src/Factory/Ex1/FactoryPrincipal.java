package Factory.Ex1;

public class FactoryPrincipal {
	public FabricaCotxes getFabrica(Ubicacions ub) {
		switch(ub) {
			case INVERNALIA:
				return new FabricaInvernalia();
			case CASTERLY:
				return new FabricaRocaCasterly();
			case HARRENHAL:
				return new FabricaHarrenhal();
			case DORNE:
				return new FabricaPrincipatDorne();
			case TEMPESTES:
				return new FabricaTempestes();
			default:
				System.err.println("You only have one job, congrats you're retard.");
				break;
		}
		return null;
	}
}
