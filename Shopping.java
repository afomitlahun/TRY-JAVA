public class Shopping  {
    public static void main(String[] args){
  int  Laptop = 45000 ;
   int Mouse = 1200 ;
   int Keyboard = 1800;
   int Total = Laptop + Mouse + Keyboard;
   double Discount=Total*10/100;
   double finalPrice=Total-Discount;
   System.out.println("TotalPrice:"+Total);
   System.out.println("Discount:"+Discount);
   System.out.println("Final Price:"+finalPrice);
}
}