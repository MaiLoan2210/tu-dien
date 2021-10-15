import java.io.*;
import java.util.Scanner;

public class DictionaryManagement {
    /**
     *
     * nhap tu ban phim va them tu vao tu dien
     */
    public void insertFromCommandline(Dictionary dic) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số từ cần chèn:");
        int count = input.nextInt();
        input.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập từ mới:");
            String Word_target = input.nextLine();
            System.out.println("Nhập nghĩa của từ:");
            String Word_explain = input.nextLine();
            Word w = new Word(Word_target, Word_explain);
            dic.addWord(w);
            }
    }

    /**Nhap du liey tu dien tu file.*/
    public void insertFromFile(Dictionary dic) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("dictionaries.txt"));
        String str;
        while ((str = in.readLine()) != null) {
            String[] parts = str.split("\t");
            dic.addWord(parts[0], parts[1]);

        }
    }

    /**
     * tìm kiếm từ điển
     * @param dic biến từ điển
     * @return vị trí của từ trong từ điển nếu có, ngược lại trả về -1
     */
    public void dictionaryLookup(Dictionary dic) {
        System.out.println("Nhập từ cần tra:");
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int index = dic.checkWord(w);
        if (index == -1) {
            System.out.println("Không tìm thấy từ trong hệ thống!!!");
        } else {
            dic.arrWord.get(index).printWord();
        }
    }

    /**
     * xóa từ trong từ điển
     * @param dic biến từ điển
     */
    public void removeWord(Dictionary dic) {
        System.out.println("Nhập từ cần xóa: ");
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        if (dic.checkWord(w) >= 0) {
            dic.removeW(dic.checkWord(w));
            System.out.println("Đã xóa từ!");
        } else {
            System.out.println("Từ bạn nhập không tồn tại!");
        }

    }

    /**
     * sửa từ trong từ điển
     */
    public  void fixDictionary(Dictionary dic) {
        System.out.println("Nhập từ cần sửa:");
        Scanner sc = new Scanner(System.in);
        String w_fix = sc.nextLine();
        int index = dic.checkWord(w_fix);
        if (index >= 0) {
            System.out.println("Nhập từ thay thế:");
            System.out.println("(Nhập cả từ và nghĩa của từ, cách nhau bằng dấu tab.)");
            String str = sc.nextLine();
            String[] parts = str.split("\t");
            dic.arrWord.get(index).setWord_target(parts[0]);
            dic.arrWord.get(index).setWord_explain(parts[1]);
            System.out.println("Sửa thành công!");
        } else {
            System.out.println("Từ bạn nhập không tồn tại!");
        }

    }


    /** Xuất từ điển ra file.*/
    public void dictionaryExportToFile(Dictionary dic) throws IOException {

        BufferedWriter out = new BufferedWriter (new FileWriter("dictionaries.txt"));
        for (int i = 0; i < dic.arrWord.size(); i++) {
            out.write(dic.arrWord.get(i).getWord_target() + "\t" + dic.arrWord.get(i).getWord_explain() + "\n");
        }
        out.flush();
        out.close();

    }



}
