package com.zhb;

import java.io.*;

/**
 * @Auther: curry
 * @Date: 2018/6/24 11:12
 * @Description:
 */
public class TestIo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/test.txt");
        InputStream in0 = new FileInputStream(file);
        InputStream in1 = new BufferedInputStream(new FileInputStream(file));
        InputStream in2 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));


        FileInputStream in3 = new FileInputStream(file);
        BufferedInputStream in4 = new BufferedInputStream(new FileInputStream(file));
        DataInputStream in5 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    }
}
