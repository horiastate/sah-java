package piese;

public class regina extends class_chess_pieces {
    public regina(String culoare) {
        super(culoare);
    }

    @Override
    public void muta() {
        System.out.println("Regina se poate muta pe orice număr de pătrate în linie dreaptă sau diagonală.");
    }
}