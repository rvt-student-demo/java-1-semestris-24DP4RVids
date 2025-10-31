package rvt;

import java.util.Scanner;
import java.util.ArrayList;    

public class JMArrayList {
    public static void main(String[] args) {
        Only_These_Numbers();
        List_size();
    }
        public static void Only_These_Numbers() {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> num_list = new ArrayList<Integer>();

            while (true) {
                int number = Integer.valueOf(scanner.nextInt());
                if (number == -1) {
                    break;
                }    
                num_list.add(number);
            }

            System.out.println("From where?");
            int first = Integer.valueOf(scanner.nextInt());

            System.out.println("To where?");
            int last = Integer.valueOf(scanner.nextInt());

            for (int i = first; i <= last; i++) {
                System.out.println(num_list.get(i));
            }
        }
        public static void List_size() {
             Scanner scanner = new Scanner(System.in);
             ArrayList<String> string_list = new ArrayList<String>();

            while (true) {
                String name = String.valueOf(scanner.nextLine());
                if (name == String.lenght(" ")) {
                    break;
                }    
                string_list.add(name);
            }

            System.out.println("From where?");
            String first = String.valueOf(scanner.nextLine());

            System.out.println("To where?");
            String last = String.valueOf(scanner.nextLine());

            
                System.out.println(string_list);
            
        }
}
