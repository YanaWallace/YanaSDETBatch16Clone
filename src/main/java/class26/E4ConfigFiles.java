package class26;

public class E4ConfigFiles {
    public static void main(String[] args) {
        //System.getProperty("user.dir") gives the path of the project
        System.out.println(System.getProperty("user.dir"));
        String path=System.getProperty("user.dir")+"Files\\Config.properties";
        System.out.println(path);
    }
}
