 class constructor {
     int a;
     int b;

     constructor() {
         a = 25;
         b = 56;
         System.out.println(a+ "  " + b);
     }

     void m1() {
         System.out.println(a+ "  " + b);
     }

     public static void main(String[] args) {
         constructor obj = new constructor();
         obj.m1();
     }
 }



