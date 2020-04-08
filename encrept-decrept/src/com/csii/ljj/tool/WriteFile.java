package com.csii.ljj.tool;

import java.io.*;

/**
 * @author lanjingjing
 * @description file
 * @date 2020/4/8
 */
public class WriteFile {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();

        // bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G://writer.txt"),"UTF-8"),1024);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt"),"UTF-8"));

        for (int i=0;i<30000;i++){
         sb.append("中华人民共和国").append("|+|").append("你好").append("中华人民共和国").append("|+|").append("你好").append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("中华人民共和国").append("|+|").append("你好")
                 .append("\n");
            if (i%50000==0){
                bw.write(sb.toString());
                bw.flush();
                sb.delete(0,sb.length());
            }
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();



    }
}
