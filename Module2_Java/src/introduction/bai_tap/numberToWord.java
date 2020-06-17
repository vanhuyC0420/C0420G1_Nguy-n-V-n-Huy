package introduction.bai_tap;

import java.util.Scanner;
// Giả sử bạn đang tham gia viết chương trình cho máy đo chiều cao cân nặng,
// hãy viết một chương trình có khả năng đọc các số nguyên không âm có tối đa 3 chữ số.
//  Ví dụ, với số 261, chương trình in ra màn hình two hundred and sixty one.
public class numberToWord {
    public static void main(String[] args) {
//        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap mot so:");
            int number = scanner.nextInt();
            if (number <= 10) {
                switch (number) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                }
//            end switch
            } else if (number <= 20) {
                switch (number) {
                    case 11:
                        System.out.println("Eleven");
                        break;
                    case 12:
                        System.out.println("Twelve");
                        break;
                    case 13:
                        System.out.println("Thirdteen");
                        break;
                    case 14:
                        System.out.println("Fourteen");
                        break;
                    case 15:
                        System.out.println("Fiveteen");
                        break;
                    case 16:
                        System.out.println("Sixteen");
                        break;
                    case 17:
                        System.out.println("Seventeen");
                        break;
                    case 18:
                        System.out.println("Eighteen");
                        break;
                    case 19:
                        System.out.println("Nineteen");
                        break;
                    case 20:
                        System.out.println("Twenty");
                        break;
                }
//            end switch
            } else {
                int tram, chuc, donvi;
                donvi = number % 10;
                chuc = number / 10 % 10;
                tram = number / 100;
                String tram1 = "", chuc1 = "", donvi1 = "";
                switch (donvi) {
                    case 1:
                        donvi1 = "One";
                        break;
                    case 2:
                        donvi1 = "Two";
                        break;
                    case 3:
                        donvi1 = "three";
                        break;
                    case 4:
                        donvi1 = "four";
                        break;
                    case 5:
                        donvi1 = "five";
                        break;
                    case 6:
                        donvi1 = "six";
                        break;
                    case 7:
                        donvi1 = "seven";
                        break;
                    case 8:
                        donvi1 = "eight";
                        break;
                    case 9:
                        donvi1 = "nine";
                        break;
                    case 0:
                        donvi1 = "";
                        break;
                }
                //end switch donvi
                switch (chuc) {
                    case 1:
                        chuc1 = "ten";
                        break;
                    case 2:
                        chuc1 = "Twenty";
                        break;
                    case 3:
                        chuc1 = "Thirdty";
                        break;
                    case 4:
                        chuc1 = "Fourty";
                        break;
                    case 5:
                        chuc1 = "Fivety";
                        break;
                    case 6:
                        chuc1 = "sixty";
                        break;
                    case 7:
                        chuc1 = "seventy";
                        break;
                    case 8:
                        chuc1 = "eightty";
                        break;
                    case 9:
                        chuc1 = "ninety";
                        break;
                    case 0:
                        chuc1 = "";
                        break;
                }
                //end switch(chuc)
                switch (tram) {
                    case 1:
                        tram1 = "One hundred";
                        break;
                    case 2:
                        tram1 = "Two hundred";
                        break;
                    case 3:
                        tram1 = "Third hundred";
                        break;
                    case 4:
                        tram1 = "Four hundred";
                        break;
                    case 5:
                        tram1 = "Five hundred";
                        break;
                    case 6:
                        tram1 = "six hundred";
                        break;
                    case 7:
                        tram1 = "seven hundred";
                        break;
                    case 8:
                        tram1 = "eight hundred";
                        break;
                    case 9:
                        tram1 = "nine hundred";
                        break;
                    case 0:
                        tram1 = "";
                        break;
                }
                //end switch(tram)
                System.out.println(tram1 + " and " + chuc1 + " " + donvi1);
            }

        }
    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number to check: ");
//        short numdvi = scanner.nextShort();
////        if (num >=0 && num <= 10) {
//            switch (numdvi) {
//                case 0:
//                    System.out.println("Zero!");
//                    break;
//                case 1:
//                    System.out.println("One!");
//                    break;
//                case 2:
//                    System.out.println("Two!");
//                    break;
//                case 3:
//                    System.out.println("Three!");
//                    break;
//                case 4:
//                    System.out.println("Four!");
//                    break;
//                case 5:
//                    System.out.println("Five!");
//                    break;
//                case 6:
//                    System.out.println("Six!");
//                    break;
//                case 7:
//                    System.out.println("Seven!");
//                    break;
//                case 8:
//                    System.out.println("Eight!");
//                    break;
//                case 9:
//                    System.out.println("Nine!");
//                    break;
//                case 10:
//                    System.out.println("Ten!");
//                    break;
//                case 11:
//                    System.out.println("Eleven!");
//                    break;
//                case 12:
//                    System.out.println("Twele!");
//                    break;
////                default:
////                    System.out.println("out of ablity!");
////                    break;
//            }
////        }
//    }
//}
