// subclass NIKE FLEXISPORT is related to superclass Shoes
class NikeFlexiSport extends Shoes_Base {

   // specifically instantiates the properties
   private static String material = "PVC", warna = "red";
   private static boolean LED, free_size;
   
   // name of the shoe
   public static String name = new String("Nike FlexiSport");
   
   // constructor
   public NikeFlexiSport(String material, String warna) {
      this.material = material;
      this.warna = warna; }
   
   // distinctive characteristics 
   // material
   public void whatMaterial() {   
        System.out.println("1. "+ name +" is made of "+ material +"."); }
      
   // the shoe is light
   public void isLight() {
         System.out.println("2. The shoe is light."); }
         
   // has spikes at the sole   
   public void hasSpikes() {
         System.out.println("3. "+ name +" has spikes."); }
   
   // special usage of the shoes
   public void specialUse() {
         System.out.println("4. This shoe can be used in various...");
         System.out.printf("\t\t\t...sports such as jogging and playing football.\n"); }
    
    // has LED light 
    public boolean hasLED() {
      LED = true;
      if (LED = true) {
         System.out.print("5. "+ name +" has LED light, ");
         System.out.println("so that it glows afar."); 
      }
      return LED; }     
    
    // free size
    public boolean freeSize() {
      free_size = true;
      if (free_size = true) {
         System.out.println("6. It is free-sized so that the shoe is flexible to all...");
         System.out.printf("\t\t\t...regardless of his/her foot size.\n");
      }
      return free_size; }
     
     // Nike FlexiSport colour?
    public void colour() {
         System.out.println("7. The colour of "+ name +" is "+ warna +"."); }
   
}  // end of subclass Nike FlexiSport
