package Adapter;

public class ClientAniversari {

    private final AniversariFactory factory;
    
    ClientAniversari(AniversariFactory factory) {
        this.factory = factory;
    }

    public void run() {
        Aniversari meuAniversari = factory.create(1965, Mes.DESEMBRE, 28);
        Aniversari altreAniversari = factory.create(2001, Mes.DESEMBRE, 28);
        Aniversari tercerAniversari = factory.create(1987, Mes.ABRIL, 1);
        
        System.out.println("Meu Aniversari: " + meuAniversari);
        System.out.println("Altre Aniversari: " + altreAniversari);
        System.out.println("Tercer Aniversari: " + tercerAniversari);
        
        System.out.println("Meu Aniversari.isLaterThan(altreAniversari): " +
            meuAniversari.isLaterThan(altreAniversari));    
        System.out.println("Meu Aniversari.isLaterThan(tercerAniversari): " +
            meuAniversari.isLaterThan(tercerAniversari));
        System.out.println("Altre Aniversari.isLaterThan(tercerAniversari): " +
            altreAniversari.isLaterThan(tercerAniversari));
        
        System.out.println("Meu Aniversari.isSame(altreAniversari): " +
            meuAniversari.isSame(altreAniversari));
        System.out.println("Meu Aniversari.isSame(tercerAniversari): " +
            meuAniversari.isSame(tercerAniversari));
        System.out.println("Altre Aniversari.isSame(tercerAniversari): " +
            altreAniversari.isSame(tercerAniversari));
        
    }
    
    public static final void main(String[] args) {
    
        new ClientAniversari(new DataClassAdapterFactory()).run();
    }
    
    
}
