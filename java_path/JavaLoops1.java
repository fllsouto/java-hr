package java_path;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaLoops1 {
  public static void main(String[] args) {
    loops1();
  }

  private static void loops1() {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    IntStream.rangeClosed(1, 10).forEach( i -> {
      System.out.println(formatOutput(n, i));
    });
    s.close();
  }

  private static String formatOutput(int n, int i) {
    return String.format("%d x %d = %d", n, i, calculateMultiple(n, i));
  }

  private static int calculateMultiple(int n, int i) {
    return (n * i);
  }

}
