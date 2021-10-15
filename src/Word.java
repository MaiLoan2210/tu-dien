public class Word {
    private String  word_target;
    private String  word_explain;

    public String getWord_target() {
        return this.word_target;
    }

    public void setWord_target(String word) {
        this.word_target = word;
    }

    public String getWord_explain() {
        return this.word_explain;
    }

    public void setWord_explain(String explain) {
        this.word_explain = explain;
    }

    public Word(String a, String b) {
        word_target = a;
        word_explain = b;
    }

    /**
     * in tu
     */
    public void printWord() {
        System.out.printf("\t|%-15s\t|%s%n", word_target, word_explain);
    }


}
