import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return ;
        }

        // try {
        //     fin = new FileInputStream(args[0]);
        // } catch(FileNotFoundException e) {
        //     System.out.println("Cannot open file");
        //     return ;
        // }

        try(FileINputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch(IOException e) {
            System.out.println("Error Reading File");
            System.out.println("IO ERROR");
        } 
        
        // finally {
        //     try {
        //         fin.close();
        //     } catch(IOException e) {
        //         System.out.println("Error closing file");
        //     }
        // }
    }
}