package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Get the location of the file
Either navigate to that file or bring that file into the memory
 */
public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //System.getProperty("user.dir") => it gives you the path till your project
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        // For Mac
      //  String path=System.getProperty("user.dir")+"/Files/Config.properties";
        //Brings the data from the file in the form of bytes
        FileInputStream fis=new FileInputStream(path);
        // converts the data in the form of key value pairs
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));

    }
}
