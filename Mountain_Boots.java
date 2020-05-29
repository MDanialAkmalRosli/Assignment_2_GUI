// subclass Mountain Boots is related to superclass Shoes
class Mountain_Boots extends Shoes_Base {
 
   // specifically instantiates the properties
   private static String material = "crocodile leather", warna = "dark brown";
   
   // name of the shoe
   public static String name = new String("Mountain Boots");
   
   // constructor
   public Mountain_Boots(String material, String warna) {
      this.material = material;
      this.warna = warna; }
   
   // distinctive characteristics 
   // material
   public void whatMaterial() {   
      System.out.println("1. "+ name +" is made of "+ material +"."); }
   
   // special usage of the shoes
   public void specialUse() {
      System.out.println("2. Suitable for extreme activities " +
         "such as hiking."); }
   
   // the shoe has stiff soles
   public void hasStiffSoles() {
      System.out.println("3. Stiff soles to prevent slipping easily."); }
   
   // security feature of the boots
   public void securityFeature() {
      System.out.println("4. The inner part of boots has chip as a...");
      System.out.printf("\t...security feature to track the wearer in case of emergency.\n"); }
      
    // Mountain Boots colour?
    public void colour() {
      System.out.println("5. The colour of "+ name +" is "+ warna +"."); } 
   
} // end of subclass Mountain Boots