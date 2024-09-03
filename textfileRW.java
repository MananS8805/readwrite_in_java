
import java.io.*;
import java.util.Scanner;

class textfileRW{
    public static void main(String[] args) {
        try (FileWriter F1=new FileWriter("f1.txt"))
        {
            F1.write("Hey i am here and this is my first written file\nlets try writing to another file ");
       } catch (IOException e) {
        System.out.println("An error occured");
       }

       try(FileWriter F2= new FileWriter("f2.txt"))
       {
            Scanner reader = new Scanner(new File("f1.txt"));
            while(reader.hasNextLine())
            {
                String line=reader.nextLine();
                F2.write(line);
                F2.write("\n");
            }

       }
       catch(IOException e)
       {
            System.out.println("An error occured");
       }
   
}
}