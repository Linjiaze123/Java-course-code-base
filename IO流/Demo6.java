package cn.xidian.test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/*
打印流可以打印任意类型的数据，打印数据之前都会先把数据转换成字符串再进行打印
 */
class Animal{
    String name;
    String color;
    public Animal(String name,String color){
        this.name = name;
        this.color = color;
    }
    @Override
     public String toString() {
        return "名字："+this.name+ " 颜色："+ this.color;
    }
}
public class Demo6 {
    public static void main(String[] args) throws IOException {
        /*
  File file = new File("/home/gavinzhou/a.txt");
  //创建打印流
  PrintStream printStream = new PrintStream(file);
  //打印任何信息到文件中
  printStream.println(97);
  printStream.println(3.14);
  printStream.println('a');
  printStream.println(true);
  Animal a = new Animal("老鼠", "黑色");
  printStream.println(a);
  //更改标准的输入输出
  System.setOut(printStream); //标准输出是到屏幕上
  System.out.println("test.......");
  */
        //收集异常的日志信息。
        File logFile = new File("/home/gavinzhou/test.log");
        PrintStream logPrintStream = new PrintStream( new FileOutputStream(logFile,true) );
        try{
            int c = 4/0;
            //引起异常
            System.out.println("c="+c);
            int[] arr = null;
            System.out.println(arr.length);
        }
        catch(Exception e){
            e.printStackTrace(logPrintStream);
            //输出到文件而不是屏幕上
        }
    }
}
