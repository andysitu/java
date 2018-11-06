import java.lang.annotation.*;
import java.lang.reflect.*;

// Marker Annotation that can applied to a type.
@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

@Target(ElementType.TYPE_USE)
@interface Unique {}

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.Type_PARAMETER)
@interface What {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {}

@Target(ElementType.METHOD)
@interface Recommend{}

class TypeAnnoDemo<@What(description = "Generaic data type") T> {

    // TypeAnnotation on a constructtor
    public @Unique TypeAnnoDemo() {}

    @TypeAnno String str;

    @EmptyOK String test;

    public int f(@typeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    // Annotate the return type
    public @TypeAnno Integer f2(int j, int k) {
        return j+k;
    }

    public @Recommend Integer f3(String str) {
        return str.length() / 2;
    }
    
    public void f4() throws @TypeAnno NullPointerException {

    }

    String @MaxLen(10) [] @NotZeroLen [] w;

    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        TypeAnnoDemo<@TypeAnno Integer> ob =
                new TypeAnnoDemo<@TypeAnno Integer>();

        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = Integer.valueOf(10);

        Integer y;

        // Type annotation on a cast
        y = (@TypeAnno Integer) x;
    }

    public static void main(String args[]) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}