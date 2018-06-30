package com.zhb.file.impl;

import com.zhb.factory.ExportFactory;
import com.zhb.file.ExportFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 23:02
 * @Description:
 */
public class ExportFinancialHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {

        System.out.println("导出财务版HTML文件");
        return true;
    }
}
