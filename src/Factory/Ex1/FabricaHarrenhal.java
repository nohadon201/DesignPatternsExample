package Factory.Ex1;

public class FabricaHarrenhal implements FabricaCotxes {

	@Override
	public Cotxe generarCotxe(TipusCotxe tip) {
		switch (tip) {
		case ELECTRIC:
			return new CotxeElectic(Ubicacions.HARRENHAL);
		case CAVALLS:
			return new CotxeCavalls(Ubicacions.HARRENHAL);
		case DRAC:
			return new CotxeDrac(Ubicacions.HARRENHAL);
		case BIFUEL:
			return new CotxeBifuel(Ubicacions.HARRENHAL);
		case HIBRID:
			return new CotxeHibrid(Ubicacions.HARRENHAL);
		case HIDROGEN:
			return new CotxeHibrid(Ubicacions.HARRENHAL);
		default:
			System.err.println("MEEEEEEEEEEEEEEEC! MEEEEEEEEEEEEEC! OYES ESO? ES LA ALARMA DE \"ERES TONTO\" ");
			return null;
		}

	}
}
