package Ex3;
import java.util.*;
public class LyricsWordWithoutGeneric {
    private static final Word[] lyric = {
            new Word("you", 1), new Word("say", 2), new Word("it", 3),
            new Word("best", 4), new Word("when", 5), new Word("you", 6),
            new Word("say", 7), new Word("nothing", 8), new Word("at", 9),
            new Word("all", 10)};

    public static void main(String[] args) {
        List lyric = new ArrayList();
        for (Object w : lyric)
            lyric.add(w);
        for (Object o : lyric) {
            Word w = (Word) o;
            System.out.println(w.getValue() + "," + w.getPositon());
        }
    }
}
