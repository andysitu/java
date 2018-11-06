// A character queue inferface
public interface ICharQ {
   void put(char ch) throws QueueFullException;

   char get() throws QueueEmptyException;
}