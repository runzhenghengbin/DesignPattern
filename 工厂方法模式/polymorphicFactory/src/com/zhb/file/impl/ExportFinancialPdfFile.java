package com.zhb.file.impl;

import com.zhb.file.ExportFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 23:04
 * @Description:
 */
public class ExportFinancialPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版PDF文件");
        return true;
    }
}
