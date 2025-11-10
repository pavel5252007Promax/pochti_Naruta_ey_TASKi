import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String str = "Быстрая рыжая собака перепрыгнула через ленивого Аскара";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                k++;
            }
        }
        String spis[] = new String[k + 1];
        String slovo = "";
        int shet = 0;
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (curChar != ' ') {
                slovo += curChar;
            }
            if ((curChar == ' ' || i == str.length() - 1)) {
                spis[shet] = slovo;
                shet++;
                slovo = "";
            }
        }
        int maxlen = -10000;
        String maxslovo = "";
        String alf = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (int i = 0; i < k + 1; i++) {
            String samoslovo = spis[i];
            int sc = 0;
            for (int j = 0; j < spis[i].length(); j++) {
                char curChar = spis[i].charAt(j);
                for (int c = 0; c < alf.length(); c++) {
                    if (curChar == alf.charAt(c)) {
                        sc++;
                        break;
                    }
                }
            }
            if (maxlen < sc) {
                maxlen = sc;
                maxslovo = samoslovo;
            }
        }
        System.out.println(maxslovo);
    }

}