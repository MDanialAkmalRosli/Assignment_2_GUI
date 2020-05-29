// This is the superclass Shoes
// NikeFlexiSport, Mountain Boots and Converse Shoes are subclasses of Shoes
class Shoes_Base { 

   // determine the laces of the shoe
   public void hasLaces() {
      System.out.println("@ This shoe has laces.");  }
   
   // overload
   public void hasLaces(int num) {
      System.out.println("@ This shoe has brown coloured laces to strengthen the shoe.");  }
   
   // determine the shoe durability
   public void isitDurable () {
      System.out.println("@ Durable."); }
         
   // is the shoe suitable for both men and women?
   public void isUnisex () {
      System.out.println("@ Unisex, suitable for men & women."); }
      
}