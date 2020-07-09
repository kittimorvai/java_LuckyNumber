package mypackage;
import java.util.*;

class Main{


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long L = in.nextLong();
        long R = in.nextLong();

        findLucky(L,R);

    }

    public static void findLucky (long l, long r){
        long counter = 0;

        for (long i = l; i <= r; i++) {
            boolean flag1 = false;
            boolean flag2 = false;
            String current = String.valueOf(i);
            for (int j = 0; j < current.length(); j++){
                if (containsSix(current.charAt(j))){
                    flag1 = true;
                }
                if (containsEight(current.charAt(j))){
                    flag2 = true;
                }
                if (containsBoth(flag1, flag2)){
                    break;
                }
            }
            if(flag1 && !flag2){
                counter++;
            }
            if (!flag1 && flag2){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static boolean containsSix (char digit){
        if (digit == '6'){
            return true;
        }
        return false;
    }
    public static boolean containsEight (char digit){
        if (digit == '8'){
            return true;
        }
        return false;
    }
    public static boolean containsBoth (boolean containsSix, boolean containsEight){
        if (containsSix && containsEight){
            return true;
        }
        return false;
    }


//original
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        long L = in.nextLong();
//        long R = in.nextLong();
//
//        findLucky(L,R);
//
//    }
//
//    public static void findLucky (long l, long r){
//        long counter = 0;
//        for (long i = l; i <= r; i++){
//            String current = String.valueOf(i);
//            if(current.contains("6") && !current.contains("8")){
//                counter++;
//            } else if (!current.contains("6") && current.contains("8")){
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }

}