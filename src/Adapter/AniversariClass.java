package Adapter;

public class AniversariClass implements Aniversari,Comparable<Aniversari>{
	private int day,any;
	private Mes m;
	public AniversariClass(int day, Mes m, int any) {
		this.m=m;
		this.day=day;
		this.any=any;
	}
	@Override
	public int getAny() {
		// TODO Auto-generated method stub
		return this.any;
	}

	@Override
	public Mes getMes() {
		// TODO Auto-generated method stub
		return this.m;
	}

	@Override
	public int getDia() {
		// TODO Auto-generated method stub
		return this.day;
	}

	@Override
	public boolean isLaterThan(Aniversari altre) {
		// TODO Auto-generated method stub
		return this.compareTo(altre)==1;
	}

	@Override
	public boolean isSame(Aniversari altre) {
		// TODO Auto-generated method stub
		return this.compareTo(altre)==0;
	}
	@Override
	public String toString() {
		return "AniversariClass [day=" + day + ", any=" + any + ", m=" + m + "]";
	}
	@Override
	public int compareTo(Aniversari arg0) {
		if(Integer.compare(any, arg0.getAny())==0) {
			if(this.m.compareTo(arg0.getMes())==0) {
				return Integer.compare(day, arg0.getDia());
			}else {
				return this.m.compareTo(arg0.getMes());
			}
		} else {
			return Integer.compare(any, arg0.getAny());
		}
	}
	
}
