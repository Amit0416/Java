interface car
{
   void bmw();
}
 interface corona
 {
   void covid();
 }

 class child implements car,corona
 {
   public void bmw()
   {
       System.out.println("This is bmw");
   }
   public void covid()
   {
       System.out.println("This is covid");
   }
   public static void main(String[] args)
   {
       child c=new child();
       c.bmw();c.covid();
   }
 }