package com.zhb;

import com.zhb.factory.ExportFactory;
import com.zhb.factory.impl.ExportHtmlFactory;
import com.zhb.file.ExportFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 22:57
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String data = "";

        ExportFactory exportFactory = new ExportHtmlFactory();

        ExportFile exportFile = exportFactory.factory("financial");

        exportFile.export(data);
    }
}
