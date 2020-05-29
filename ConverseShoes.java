// subclass Converse Shoes is related to superclass Shoes
class ConverseShoes extends Shoes_Base {  
 
   // specifically instantiates the properties
   private static String material = "PVC / leather / canvas", warna = "teal";
   
   // name of the shoe
   public static String name = new String("Converse Shoes");
   
   // constructor
   public ConverseShoes(String material, String warna) {
      this.material = material;
      this.warna = warna; }
   
   // distinctive characteristics 
   // material
   public void whatMaterials() {   
      System.out.println("1. "+ name +" is made of "+ material +"."); }
      
   // laces of the shoe
   public void hasLaces() {
      System.out.println("2. This shoe can be laced or non-laced."); }
      
   // special usage of the shoes
   public void specialUse() {
      System.out.println("3. Suitable for casual / leisure activities"); }
      
   // the shoe is light
   public void isLight() {
      System.out.println("4. "+ name +" is light."); }
   
   // has reflex insoles
   public void reflexInsoles() {
      System.out.println("5. Reflexological insoles to increase blood circulation...");
      System.out.printf("\t\t\t...and reduces feet pain.\n"); }
      
   public void colour() {
      System.out.println("6. The colour of "+ name +" is "+ warna +"."); }
   
} // end of subclass Converse Shoes
