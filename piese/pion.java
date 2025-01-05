package piese;

public class pion extends class_chess_pieces {
    public pion(String culoare) {
        super(culoare);
    }

    @Override
    public void muta() {
        System.out.println("Pionul se poate muta înainte cu un pătrat (sau două la prima mutare).");
    }
}
