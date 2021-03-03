
public class Main {
  public static void main(String[] args) {
    // 難易度
    String level = "INSANE";
    // 対象の数字
    int num = 28050;
    // 素因数分解
    while (num > 1) {
      for (int i = 2; i <= mode(level); i++) {
        if (num % i == 0) {
          System.out.println(i);
          num /= i;
          break;
        }
      }
    }
  }

  // 難易度ごとに素数の最大値を設定
  private static int mode(String level) {
    int maxPrime = 0;
    if (level.equals("EASY")) {
      maxPrime = 5;
    } else if (level.equals("NORMAL")) {
      maxPrime = 7;
    } else if (level.equals("HARD")) {
      maxPrime = 13;
    } else if (level.equals("EXPERT")) {
      maxPrime = 23;
    } else {
      maxPrime = 53;
    }
    return maxPrime;
  }
}
