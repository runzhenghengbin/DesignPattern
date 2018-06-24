package com.zhb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: curry
 * @Date: 2018/6/23 11:54
 * @Description:
 */
public class CharacterInputStream extends FilterInputStream {
    public CharacterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if(c >= 97 && c<= 122  || c >= 65 && c <= 90){
            return 32;
        }else {
            return c;
        }
    }
}
