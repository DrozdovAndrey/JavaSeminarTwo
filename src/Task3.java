import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static String strConcat(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("TEXT ");
        }
        return sb.toString();
    }
    public static void writeFiles(String str){

        try{
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/sw.txt");
            System.out.println(pathFile);
            FileWriter fw = new FileWriter(pathFile, false);
            fw.append(str);
            fw.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void main(String[] args) {
        String str = strConcat();
        System.out.println(str);
        writeFiles(str);
        System.out.println();
    }

}
