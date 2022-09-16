package kg.nazar.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        System.out.println("Введите 5 слов: ");
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }
        Collections.reverse(B);
        System.out.println(B);
        ArrayList<String> C = new ArrayList<>();
        Integer X = 0;
        while (C.size() < A.size() + B.size()) {
            C.add(A.get(X));
            C.add(B.get(X));
            X++;
        }
        System.out.println(C);
        C.add(A.get(0));
        C.add(B.get(1));
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String G1, String G2) {
                return G1.length() - G2.length();
            }
        });
        System.out.println(C);
    }
}