package Factory.Ex1;

public class FabricaPrincipatDorne implements FabricaCotxes {

	@Override
	public Cotxe generarCotxe(TipusCotxe tip) {
		switch(tip) {
			case ELECTRIC:
				return new CotxeElectic(Ubicacions.DORNE);
			case CAVALLS:
				return new CotxeCavalls(Ubicacions.DORNE);
			case DRAC:
				return new CotxeDrac(Ubicacions.DORNE);
			case BIFUEL:
				return new CotxeBifuel(Ubicacions.DORNE);
			case HIBRID:
				return new CotxeHibrid(Ubicacions.DORNE);
			case HIDROGEN:
				return new CotxeHibrid(Ubicacions.DORNE);
			default:
				System.err.println("MEEEEEEEEEEEEEEEC! MEEEEEEEEEEEEEC! OYES ESO? ES LA ALARMA DE \"ERES TONTO\" ");
				return null;
		}
	}

}
