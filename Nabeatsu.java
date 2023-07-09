import java.util.Scanner;

class Nabeatsu {

  private static boolean is_multiple(int num) {

    if (!(num % 3 == 0)) {
      return false;
    }
    return true;

  }

  private static boolean has_three(int num) {

    while (num > 0) {
      if (num % 10 == 3) {
        return true;
      }
      num /= 10;
    }

    return false;
  }

  private static void print_ismultiple(boolean ismultiple) {

    if (!ismultiple) {
      System.out.println("3の倍数ではありません");
    } else {
      System.out.println("3の倍数です");
    }

  }

  private static void print_has_three(boolean hasthree) {

    if (!hasthree) {
      System.out.println("3が含まれていません");
    } else {
      System.out.println("3が含まれています");
    }

  }

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      boolean roop = true;

      do {
        boolean is_multiple = false;
        boolean has_three = false;

        System.out.println("数字を入力してください");
        int input = scanner.nextInt();

        is_multiple = is_multiple(input);
        has_three = has_three(input);

        print_ismultiple(is_multiple);
        print_has_three(has_three);

        System.out.println("続けますか？ 1で継続、2で終了");
        int exit = scanner.nextInt();
        if (exit == 2) {
          roop = false;
        } else if (exit == 1)
          ;
      } while (roop);

    }

  }
}
