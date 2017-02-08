public class EnumTest {

   enum Names {
      JERRY("FIREBALL") { public String shout() {
                        return "AHHH"; }
                     },
      BOB("SUCKER") { public String shout() {
                        return "YOOO"; }
                     },
      JOE("RED"),
      ROE("BLUE");

      private String nickName;

      Name(String nickName) {
         this.nickName = nickName;
      }

      public String getNickName() {
         return this.nickName;
      }
      public String shout() {
         return "FFDSFJKSLJGSDJG";
      }
   }

   public static void main(String[] args) {
      
   }
}