package Factory.Ex3;

public class GeneradorCredit implements GeneradorTarjetes {

	@Override
	public Tarjeta generate(MarcaTarjeta marcaTarjeta) {
		switch(marcaTarjeta) {
		case VISA:
			return new TarjetaCredit_Visa(marcaTarjeta);
		case MASTERCARD:
			return new TarjetaCredit_Mastercard(marcaTarjeta);
		case SERVIRED:
			return new TarjetaCredit_Servired(marcaTarjeta);
		case _4B:
			return new TarjetaCredit_4B(marcaTarjeta);
		case EURO6000:
			return new TarjetaCredit_Euro600(marcaTarjeta);
		case AMERICAN_EXPRESS:
			return new TarjetaCredit_AmericanExpress(marcaTarjeta);
		default: 
			return null;
	}
	}

}
