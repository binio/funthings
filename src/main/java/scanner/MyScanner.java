package scanner;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by thomas on 22/11/17.
 */
public class MyScanner implements  Outputs{
     Scanner sc;

    public MyScanner(Scanner scanner) {
        sc = scanner;
    }
    public String outputString() {
        String s = sc.nextLine();
        //s += sc.nextLine();
        return s;
    }

    public Integer outputInt () {
        return null;
    }

    public Double outputDouble () {
        return null;
    }
}
