package Chapt8.Code;
import java.io.*;

public class New {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File f = new File("Chapt8/Code/new.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop);
        writer.append("HanFaye伏龙飞\n");//覆盖文件
        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip);
        while (reader.ready()) {
            int a = reader.read();
            System.out.println(a+" "+(char)a);
        }
        reader.close();
        fip.close();;
    }
}
