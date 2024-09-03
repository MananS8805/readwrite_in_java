
import java.io.*;
import java.nio.*;
public class biniaryfile {
    public static void main(String[] args) {
        String name="Writefile.bin";
        String content="This is the content that will be written in binary file";
        byte[] bytes_of_content=content.getBytes();
        try (FileOutputStream fos = new FileOutputStream(name) ){
            fos.write(bytes_of_content);
            fos.close();
            
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        // now to read the binary file
        try (FileInputStream fis = new FileInputStream(name)){
            byte[] data=fis.readAllBytes();
            String filedata=new String(data);
            System.out.println("The data of binary file is: \n" + filedata);
            
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
    
}
