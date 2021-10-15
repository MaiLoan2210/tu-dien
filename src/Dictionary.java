import java.util.ArrayList;

public class Dictionary {
    ArrayList<Word> arrWord = new ArrayList<Word>();


    /**
     * them tu vao tu dien
     */
    public void addWord(Word a) {
        arrWord.add(a);
    }

    /**them tu 2 tham so.*/
    public void addWord(String word, String explain) {
        Word w = new Word(word, explain);
        arrWord.add(w);
    }

    /**
     * in ra tu dien
     */
    public void printDictionary() {
        for(int i = 0; i < arrWord.size(); i++) {
            System.out.print(i);
            arrWord.toArray();
        }
    }
//    void printtest() {
//        System.out.println(arrWord.get(0).getWord_target());
//    }

    /**
     * tim kiem tu trong tu dien
     * trả về vị trí của từ trong từ điển nếu có ngược lại trả về -1
     * @param w
     * @return
     */
    public int checkWord(String w) {
        for (int i = 0; i < arrWord.size(); i++) {
            if (w.equals(arrWord.get(i).getWord_target())) return i;
        }
        return -1;
    }

    /**
     * xóa từ trong từ điển
     * @param i
     */
    public void removeW(int i) {
        arrWord.remove(i);
    }






}
