package Factory.Ex1;

public class FabricaRocaCasterly implements FabricaCotxes {

	@Override
	public Cotxe generarCotxe(TipusCotxe tip) {
		switch(tip) {
			case ELECTRIC:
				return new CotxeElectic(Ubicacions.CASTERLY);
			case CAVALLS:
				return new CotxeCavalls(Ubicacions.CASTERLY);
			case DRAC:
				return new CotxeDrac(Ubicacions.CASTERLY);
			case BIFUEL:
				return new CotxeBifuel(Ubicacions.CASTERLY);
			case HIBRID:
				return new CotxeHibrid(Ubicacions.CASTERLY);
			case HIDROGEN:
				return new CotxeHibrid(Ubicacions.CASTERLY);
			default:
				System.err.println("MEEEEEEEEEEEEEEEC! MEEEEEEEEEEEEEC! OYES ESO? ES LA ALARMA DE \"ERES TONTO\" ");
				return null;
		}
	}

}
