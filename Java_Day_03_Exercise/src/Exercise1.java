//public class Exercise1 {
//    public static void main(String[] args) {
//        //Cách 1 khai báo kiểu literal
//        String str = "Hello every one";
//        int size = str.length();
//        int number = 0;
//        for(int i = 0 ; i<size ; i++){
//            char x = str.charAt(i);
//            if(x == 'e'){
//                System.out.println("index của ký tự e là " + i);
//                number++;
//            }
//        }
//        System.out.println("tổng số lần xuất hiện của ký tự e là " + number);
//
//        //Cách 2 sử dụng Object
//        String str = "hello every one";
//        int size = str.length();
//        int number = 0;
//        Character x;
//        for(int i = 0 ; i<size ; i++){
//            x = str.charAt(i);
//            if(x.equals('e')){
//                System.out.println("index của ký tự e là " + i);
//                number++;
//            }
//        }
//        System.out.println("tổng số lần xuất hiện của ký tự e là " + number);
//    }
//}
