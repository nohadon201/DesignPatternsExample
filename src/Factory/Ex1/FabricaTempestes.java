package Factory.Ex1;

public class FabricaTempestes implements FabricaCotxes {

	@Override
	public Cotxe generarCotxe(TipusCotxe tip) {
		switch(tip) {
			case ELECTRIC:
				return new CotxeElectic(Ubicacions.TEMPESTES);
			case CAVALLS:
				return new CotxeCavalls(Ubicacions.TEMPESTES);
			case DRAC:
				return new CotxeDrac(Ubicacions.TEMPESTES);
			case BIFUEL:
				return new CotxeBifuel(Ubicacions.TEMPESTES);
			case HIBRID:
				return new CotxeHibrid(Ubicacions.TEMPESTES);
			case HIDROGEN:
				return new CotxeHibrid(Ubicacions.TEMPESTES);
			default:
				System.err.println("MEEEEEEEEEEEEEEEC! MEEEEEEEEEEEEEC! OYES ESO? ES LA ALARMA DE \"ERES TONTO\" ");
				return null;
		}
	}

}
