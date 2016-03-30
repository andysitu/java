import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
   String str();
   int val();
}

class Meta {
   @MyAnno(str = "Annotation Example", val = 100)
   public static void myMeth() {
      Meta ob = new Meta();

      try {
         Class<?> c = ob.getClass();
         System.out.println(c);

         Method m = c.getMethod("myMeth");
         System.out.println(m);

         MyAnno anno = m.getAnnotation(MyAnno.class);
         System.out.println(MyAnno.class);
         System.out.println(anno);

         System.out.println(anno.str() + " " + anno.val());
      } catch(NoSuchMethodException exc) {
         System.out.println("Method not found");
      }
   }

   public static void main(String args[]) {
      myMeth();
   }
}