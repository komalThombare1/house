public class JavaExample{

  public static void main(String[] args) {

      int num1 = 10, num2 = 20, num3 = 7;
    
    int num6 = 10, num5 = 20, num4 = 1;
    

      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
  }
}
