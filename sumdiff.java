import java.util.*;
class init
{
  int n1,n2;
}
public class sumdiff
{
  public static void main(String Args[])
  {
    init i1= new init();
    Scanner sc = new Scanner(System.in);
    i1.n1=sc.nextInt();
    i1.n2=sc.nextInt();
    if (i1.n1>i1.n2)
      System.out.println(i1.n1-i1.n2);
    else
      System.out.println(i1.n1+i1.n2);
  }
}