package piese;


public class rege extends class_chess_pieces {
    public rege(String culoare) {
        super(culoare);
    }

    @Override
    public void muta() {
        System.out.println("Regele se poate muta un pătrat în orice direcție.");
    }
}