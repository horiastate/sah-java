package piese;

public class nebun extends class_chess_pieces {
    public nebun(String culoare) {
        super(culoare);
    }

    @Override
    public void muta() {
        System.out.println("Nebunul se poate muta pe orice număr de pătrate diagonal.");
    }
}
