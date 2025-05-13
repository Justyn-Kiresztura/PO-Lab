public class Main {

    public enum Swiatlo{
        CZERWONE("Stoj!"), ZOLTE("Uwaga!"), ZIELONE("Jedz!");
private final String komunikat;

        Swiatlo(String komunikat) {
            this.komunikat = komunikat;
        }

        public String getKomunikat() {
            return komunikat;
        }
    }
    public enum PizzaSlice{
        Mala(20, 30), Srednia(30, 40), Duza(40, 60);
        private final int srednica;
        private final double cena;

        PizzaSlice(int srednica, double cena) {
            this.srednica = srednica;
            this.cena = cena;
        }

        public int getSrednica() {
            return srednica;
        }

        public double getCena() {
            return cena;
        }
    }
    public static void main(String[] args){
//for(Swiatlo kolor: Swiatlo.values()){
//    System.out.println(kolor+" "+kolor.getKomunikat());
//}
        System.out.println("Srednica duzej pizzy: "+PizzaSlice.Duza.getSrednica());
        System.out.println("Cena duzej pizzy: " +PizzaSlice.Duza.getCena());
    }
}