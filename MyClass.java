class MyClass {
   int a;
   int b;

   MyClass(int a, int b) {
      this.a = a;
      this.b = b;
   }

   MyClass(int i) {
      this(i, i);
   }

   MyClass() {
      this(0); 
   }
}