package cn.xdian.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
public class Demo2 {
    public static void main(String[] args) throws IOException {
        cutFile();
        //切割MP3文件
        mergeFlile();
        //合并MP3文件
    }
    //合并MP3
    public static void mergeFlile() throws IOException{
        File dir = new File("/home/gavinzhou/music_test");
        //找到文件夹下所有的MP3文件
        Vector<FileInputStream> vector = new Vector<FileInputStream>();
        File[] files = dir.listFiles();
        for (File file : files){
            if(file.getName().endsWith(".mp3")){
                vector.add(new FileInputStream(file));
            }
        }
        //通过Vector获取迭代器
        Enumeration<FileInputStream> e = vector.elements();
        //创建序列流
        SequenceInputStream inputStream = new SequenceInputStream(e);
        //输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/gavinzhou/conbine.mp3");
        //读取分割的MP3文件
        byte[] buf = new byte[1024];
        int length = 0 ;
        while((length = inputStream.read(buf))!=-1){
            fileOutputStream.write(buf,0,length);
        }
        //关闭流
        fileOutputStream.close();
        inputStream.close();
    }
    //切割MP3
    public static void cutFile() throws IOException{
        File file = new File("/home/gavinzhou/test.mp3");
        File dir = new File("/home/gavinzhou/music_test");
        //输入字节流
        FileInputStream fileInputStream = new FileInputStream(file);
        //读取文件
        byte[] buf = new byte[1024*1024];
        int length = 0;
        for (int i = 0 ; (length = fileInputStream.read(buf))!=-1 ; i++){
            FileOutputStream fileOutputStream = new FileOutputStream(new File(dir,"part"+i+".mp3"));
            fileOutputStream.write(buf,0,length);
            fileOutputStream.close();
        }
        //关闭流
        fileInputStream.close();
    }
}
