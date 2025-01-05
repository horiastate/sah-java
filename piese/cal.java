package piese;

public class cal extends class_chess_pieces {
    public cal(String culoare) {
        super(culoare);
    }

    @Override
    public void muta() {
        System.out.println("Calul se mută în formă de L: două pătrate pe o direcție și unul perpendicular.");
    }
}
