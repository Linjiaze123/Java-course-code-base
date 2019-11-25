package cn.xidian.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("/home/gavinzhou/a.txt");
        File desFile = new File("/home/gavinzhou/b.txt");
        //创建输入流
        BufferedReader input = new BufferedReader(new FileReader(sourceFile));
        //创建输出流
        BufferedWriter output = new BufferedWriter(new FileWriter(desFile));
        //读取源文件,写入到新的文件
        String line = null;
        while((line = input.readLine()) != null){
            output.write(line);
            output.newLine();
        }
        //关闭输入输出流
        input.close();
        output.close();
    }
}
