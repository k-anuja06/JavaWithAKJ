public class A20SwapNumWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 21;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
          System.out.println("num1: " + num1);
         System.out.println("num2:  " + num2);
    }
    
}
