//obiecte pentru fiecare piesa de sah in parte
//fiecare piesa de sah, dupa, se va misca pe matricea creata in partea de chess_board
//toate clasele si desfasurarea jocului vor fi chemate in main_game.java

package piese;


public abstract class class_chess_pieces {
    String culoare;

    public class_chess_pieces(String culoare) {

        this.culoare = culoare;

    }

    public abstract void muta();

    public String getCuloare() {
        return culoare;
    }
    
} 

