package Factory.Ex3;

public class GeneradorDebit implements GeneradorTarjetes {

	@Override
	public Tarjeta generate(MarcaTarjeta marcaTarjeta) {
		switch(marcaTarjeta) {
			case VISA:
				return new TarjetaDebit_Visa(marcaTarjeta);
			case MASTERCARD:
				return new TarjetaDebit_Mastercard(marcaTarjeta);
			case SERVIRED:
				return new TarjetaDebit_Servired(marcaTarjeta);
			case _4B:
				return new TarjetaDebit_4B(marcaTarjeta);
			case EURO6000:
				return new TarjetaDebit_Euro6000(marcaTarjeta);
			case AMERICAN_EXPRESS:
				return new TarjetaDebit_AmericanExpress(marcaTarjeta);
			default: 
				return null;
		}
	}

}
