public class Main {

    public static void main(String[] args) {
        Pista pis = new Pista();
            Caballo horse1 = new Caballo("/Users/melissamariangranadosgomez/Desktop/CarreraCaballos");
            Caballo horse2 = new Caballo("/Users/melissamariangranadosgomez/Desktop/CarreraCaballos");
            Caballo horse3 = new Caballo("/Users/melissamariangranadosgomez/Desktop/CarreraCaballos");
            horse1.setVelocidad(10);
            horse2.setVelocidad(20);
            horse3.setVelocidad(15);
            pis.add(horse1);
            pis.add(horse2);
            pis.add(horse3);
            pis.start();
    }
}
