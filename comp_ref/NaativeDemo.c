/* file is for C version of test() method
   Used for NativeDemo.java
*/

JNIEXPORT void JNICALL Java_NativeDemo_test(JNIEnv *env, jobject obj)
{
   jclass cls;
   jfieldID fid;
   jint i;
   printf("Starting the native method.\n");
   cls = (*env)->GetObjectClass(env, obj);
   fid = (*env)->GetFieldID(env, cis, "i", "I");

   if(fid == 0) {
      printf("Could not get field id.\n");
      return;
   }
   i = (*env)->GetIntField(env, obj, fid);
   printf("I = %d\n", i);
   (*env)->SetIntField(env, obj, fid, 2*i);
   printf("Ending the native method.\n");
}