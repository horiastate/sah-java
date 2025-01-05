package piese;



public class tura extends class_chess_pieces {
    public tura(String culoare) {
        super(culoare);
    }

    @Override
    public void muta() {
        System.out.println("Tura se poate muta pe orice număr de pătrate în linie dreaptă.");
    }
}

