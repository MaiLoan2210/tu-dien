public class DictionaryCommandline {
    /**
     *
     *            hien tat ca cac tu trong tu dien ra man hinh
     */
    public void showAllWords(Dictionary dic) {
        System.out.println("No\t|English\t\t|VietNamese");
        dic.printDictionary();
    }
    /**
     * chuong trinh tu dien co ban
     */
    public void dictionaryBasic(Dictionary dic) {
        DictionaryManagement a = new DictionaryManagement();
        a.insertFromCommandline(dic);
        this.showAllWords(dic);
    }

    /**
     * Chuong trinh tu dien cai tien lan 1
     * @param dic bien tu dien
     */
    public void dictionaryAdvanced(Dictionary dic) {
        DictionaryManagement a = new DictionaryManagement();
        a.insertFromCommandline(dic);
        this.showAllWords(dic);

    }
    public void dictionarySearcher(Dictionary dic, String s) {
        for(int i = 0; i < dic.arrWord.size(); i++) {
            if (dic.arrWord.get(i).getWord_target().startsWith(s)) {
                System.out.println(dic.arrWord.get(i).getWord_target() + "\t" + dic.arrWord.get(i).getWord_explain());
            }
        }
    }

}
