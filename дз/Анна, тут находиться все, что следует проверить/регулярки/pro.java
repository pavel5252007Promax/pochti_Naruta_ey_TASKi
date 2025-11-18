import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String str = "Компания \"Рога и копыта\" основана 15.03.2005. Контакты: director@roga.ru, support@roga-kopita.com. Бюджет проекта: 1500000 рублей. Штаб-квартира в Москве.";
// УЗНАЕМ КОЛИЧЕСТВО СЛОВ В СТРОКЕ
        int kolvoWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                kolvoWords++;
            }
        }
        //УЗНАЛИ
        // ЗАКИДЫВАЕМ ВСЕ СЛОВА СТРОКИ В МАССИВ
        String spis[] = new String[kolvoWords];
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                spis[count] = word;
                count++;
                word = "";
            }
        }
        spis[count - 1] = word;

        //  ЗАКИНУЛИ
        // ВЫВОДИМ ИМАЙЛЫ НАФИК
        int kolvoEmails = 0;
        System.out.println("Email-адреса еу: ");
        for (int i = 0; i < kolvoWords; i++) {
            String s = "";
            if (email(spis[i])) {
                kolvoEmails++;
                s = spis[i];
                if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == ',') {
                    String trushnuiEmail = "";
                    for (int j = 0; j < s.length() - 1; j++) {
                        trushnuiEmail += s.charAt(j);
                    }
                    System.out.println(kolvoEmails + ". " + trushnuiEmail);
                } else {
                    System.out.println(kolvoEmails + ". " + s);
                }
            }
        }
        System.out.println();

        // ВЫВЕЛИ ЕПТА НАФИК БЛИН
        //ВЫВОДИМ ДАТУ
        int kolvoDat = 0;
        System.out.println("Даты еу: ");
        for (int i = 0; i < kolvoWords; i++) {
            String s2 = "";
            if (data(spis[i])) {
                String dataFinal = "";
                s2 = spis[i];
                if (s2.charAt(s2.length() - 1) == '.' || s2.charAt(s2.length() - 1) == ',') {
                    String trushnuiData = "";
                    for (int j = 0; j < s2.length() - 1; j++) {
                        trushnuiData += s2.charAt(j);
                    }
                    dataFinal = trushnuiData;
                } else {
                    dataFinal = s2;
                }
                String fourth = "3456789";
                int fourths = 0;
                for (int j = 0; j < fourth.length(); j++) {
                    if (dataFinal.charAt(3) == '1' && dataFinal.charAt(4) != fourth.charAt(j)) {
                        fourths++;
                    } else if (dataFinal.charAt(3) == '0') {
                        fourths = 7;
                    }
                }
                int sevens = 0;
                if (dataFinal.charAt(6) == '2' && dataFinal.charAt(7) == '0') {
                    sevens++;
                } else if (dataFinal.charAt(6) == '1' || dataFinal.charAt(6) == '0') {
                    sevens = 1;
                }
                int eigth = 0;
                String eigths = "3456789";
                if (dataFinal.charAt(6) == '2' && dataFinal.charAt(7) == '0') {
                    for (int g = 0; g < eigths.length(); g++) {
                        if (dataFinal.charAt(8) != eigths.charAt(g)) {
                            eigth++;
                        }
                    }
                } else {
                    eigth = eigths.length();
                }
                int nine = 0;
                String nines = "012345";
                if (dataFinal.charAt(6) == '2' && dataFinal.charAt(7) == '0' && dataFinal.charAt(8) == '2') {
                    for (int y = 0; y < nines.length(); y++) {
                        if (dataFinal.charAt(9) == nines.charAt(y)) {
                            nine++;
                        }
                    }
                } else {
                    nine = nines.length();
                }
                if (fourths == fourth.length() && sevens == 1 && eigth == eigths.length() && nine == nines.length()) {
                    kolvoDat++;
                    System.out.println(kolvoDat + ". " + dataFinal);
                }
                System.out.println();

            }
        }
        // ВСЕ ЖЕСТКО ЧЕТКО ПОДСЧИТАНО Я НАФИК КАПЕЦ УСТАЛ ХОЧУ ДОШИРАК НАААФИК
        // ДАТА НЕ МОЖЕТ БЫТЬ ПОЗЖЕ 25 ГОДА ОЙ ИЛИ РАНЬШЕ
        // СЛОВА С БОЛЬШОЙ БУКВЫ
        System.out.println("Слова с заглавной буквы:");
        int bigWords = 0;
        for (int i = 0; i < kolvoWords; i++) {
            if (((spis[i].charAt(0) >= 'A' && spis[i].charAt(0) <= 'Z') || (spis[i].charAt(0) >= 'А' && spis[i].charAt(0) <= 'Я'))) {
                bigWords++;
                String slovo = "";
                for (int z = 0; z < spis[i].length(); z++) {
                    if (spis[i].charAt(z) != ':' && spis[i].charAt(z) != '.' && spis[i].charAt(z) != '"') {
                        slovo += spis[i].charAt(z);
                    }
                }
                System.out.println(bigWords + ". " + slovo);
            }
        }
//        int bigWords = 0;
//        for (int i = 0; i < kolvoWords; i++) {
//            if (findCapitalizedWords(spis[i])) {
//                bigWords++;
//                System.out.println(bigWords + ". " + spis[i]);
//            }
//        }
        // ВЫВОД ЦИФЕРОК ВСЕХ
        System.out.println();
        System.out.println("Общее количество цифр: ");
        countDigits(str);
    }


    public static boolean email(String word) {
        boolean flag = false;
        if (word.matches("[a-zA-Z0-9_%+-]+@[a-zA-Z0-9,.-]{2,}")) {
            flag = true;
        } else {
            flag = false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '@' && word.charAt(i + 1) == '.') {
                flag = false;
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean data(String word) {
        if (word.matches("[0-3][\\d][.][0-1][\\d][.][0-2][\\d]{3}[.,;:]*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean findCapitalizedWords(String word) {
        if (word.matches("[:][А-ЯA-Z][а-яa-z:]+")) {
            return true;
        } else {
            return false;
        }
    }

    public static void countDigits(String str) {
        String dig = "0123456789";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < dig.length(); j++) {
                if (str.charAt(i) == dig.charAt(j)) {
                    k++;
                }
            }
        }
        System.out.println(k);
    }
}