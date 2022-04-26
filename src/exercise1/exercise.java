package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        String[] s_ = getStrings();
        List<Integer> l=new ArrayList<>();
        transform(s_, l);
        print(l);
    }

    private static void print(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    private static void transform(String[] s_, List<Integer> l) {
        for (int i = 0; i < s_.length; i++) {
            l.add(Integer.parseInt(s_[i]));
        }
    }

    private static String[] getStrings() {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.nextLine();
        String[] s_;
        s_=s.split(",");
        return s_;
    }
}
