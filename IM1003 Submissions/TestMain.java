public class TestMain {
   public static void main(String[] args) {
      // Test constructors and toString()
      MyComplex a = new MyComplex(1.0/2,-17.0/10);
      MyComplex b = new MyComplex(1.0/2,17/10.0);
      
      System.out.println(a.magnitude() + " and " +b.magnitude());
   }
}