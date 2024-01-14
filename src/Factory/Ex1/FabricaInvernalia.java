package Factory.Ex1;

public class FabricaInvernalia implements FabricaCotxes {

	@Override
	public Cotxe generarCotxe(TipusCotxe tip) {
		switch(tip) {
			case ELECTRIC:
				return new CotxeElectic(Ubicacions.INVERNALIA);
			case CAVALLS:
				return new CotxeCavalls(Ubicacions.INVERNALIA);
			case DRAC:
				return new CotxeDrac(Ubicacions.INVERNALIA);
			case BIFUEL:
				return new CotxeBifuel(Ubicacions.INVERNALIA);
			case HIBRID:
				return new CotxeHibrid(Ubicacions.INVERNALIA);
			case HIDROGEN:
				return new CotxeHibrid(Ubicacions.INVERNALIA);
			default:
				System.err.println("MEEEEEEEEEEEEEEEC! MEEEEEEEEEEEEEC! OYES ESO? ES LA ALARMA DE \"ERES TONTO\" ");
				return null;
		}
	}

}
