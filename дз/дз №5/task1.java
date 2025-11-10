import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String str = myScanner.nextLine();
        String strPalin = "";
        String strPalin2 = "";
        String strPalin3 = "";
        String znaki = ",. ;:'?! ";
        for (int i = 0; i < str.length(); i++) {
            int l = 0;
            for (int j = 0; j < znaki.length(); j++) {
                if (str.charAt(i) == znaki.charAt(j)) {
                    l++;
                }
            }
            if (l == 0) {
                strPalin += str.charAt(i);
            }
        }
        for (int i = 0; i < strPalin.length(); i++) {
            char s = strPalin.charAt(i);
            if (s >= 'A' && s <= 'Z') {
                s = (char) (s + 32);
            }
            strPalin2 += s;
        }
        System.out.println(strPalin2);
        int p = 0;
        for (int i = 0; i < strPalin2.length(); i++) {
            strPalin3 += strPalin2.charAt(strPalin2.length() - 1 - i);
            p++;
        }
        System.out.println(strPalin3);
        if (p == strPalin3.length()) {
            System.out.println("ZAEBUMBA NAFIK, ой ТО есть ТРУУУ");
        } else {
            System.out.println("sos at, ой то есть пошел нафик");
        }
    }

}