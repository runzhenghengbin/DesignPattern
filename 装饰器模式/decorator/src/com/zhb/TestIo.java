package com.zhb;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther: curry
 * @Date: 2018/6/23 10:01
 * @Description:
 */
public class TestIo {
    public static void main(String[] args) throws IOException {


        DataInputStream in = new DataInputStream(
                new CharacterInputStream(
                        new FileInputStream("src/test.txt")));

        String str;
        while((str =  in.readLine()) != null){
            System.out.println(str);
        }
    }

}
