public class WarmUp
{
  public static void main(String[] args)
  {
    System.out.println(isEven(9));
    System.out.println(isDiv(25, 5));
  }

  // write your methods below
  public static boolean isEven(int a)
  {
    return(a % 2 == 0);
  }

  public static boolean isDiv(int a, int b)
  {
    return(a % b == 0);
  }

}
