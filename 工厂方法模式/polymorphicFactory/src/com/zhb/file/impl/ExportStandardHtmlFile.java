package com.zhb.file.impl;

import com.zhb.file.ExportFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 23:05
 * @Description:
 */
public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版HTML文件");
        return true;
    }
}
