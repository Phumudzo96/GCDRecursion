public class GCDRecursion {

  // Recursive function to return gcd of a and b
  static int gcd(int x, int y) {
    if (y == 0)
      return x;
    return gcd(y, x % y);
  }

  // Driver method
  public static void main(String[] args) {
    int x = 100, y = 50;
    System.out.println("GCD of " + x + " and " + y + " is " + gcd(x, y));
  }
}
