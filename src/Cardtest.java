public class Cardtest {
    public static void main(String[] args) {
        Deck d1 = new Deck();

        System.out.println(d1);
        Game game= new Game(d1);
        System.out.println(game);

    }
}
