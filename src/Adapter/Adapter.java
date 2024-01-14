package Adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Adapter implements AdapterInteface {

	@Override
	public Aniversari getAniversari(GregorianCalendar a) {
		// TODO Auto-generated method stub
		switch (a.MONTH) {
			case 1:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.GENER,Calendar.YEAR);
			case 2:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.FEBRER,Calendar.YEAR);
			case 3:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.MARÇ,Calendar.YEAR);
			case 4:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.ABRIL,Calendar.YEAR);
			case 5:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.MAIG,Calendar.YEAR);
			case 6:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.JUNY,Calendar.YEAR);
			case 7:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.JULIOL,Calendar.YEAR);
			case 8:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.AGOST,Calendar.YEAR);
			case 9:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.SETEMBRE,Calendar.YEAR);
			case 10:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.OCTUBRE,Calendar.YEAR);
			case 11:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.NOVEMBRE,Calendar.YEAR);
			case 12:
				return new AniversariClass(Calendar.DAY_OF_MONTH,Mes.DESEMBRE,Calendar.YEAR);
		}
		return null;
	}

	
	
}
