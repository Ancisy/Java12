public class MidTestQuestion02 {
    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";
        //Tổng số từ trong chuỗi đã cho là
        int sum1 = coutingWords(str);
        System.out.println("Tổng số từ của chuỗi là " + sum1);
        //Đếm ký tự 'o' và in ra index của ký tự đó
        int sum2 = countEachWords(str);
        System.out.println("Tổng số ký tự 'o' là " + sum2);
    }

    public static int coutingWords(String str) {
        int size = str.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != ',') {
                count++;
            }
        }
        return count;
    }

    public static int countEachWords(String str) {
        int count = 0;
        int size = str.length();
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == 'o') {
                count++;
                System.out.println("index của ký tự o là : " + i);
            }
        }
        return count;
    }
}
