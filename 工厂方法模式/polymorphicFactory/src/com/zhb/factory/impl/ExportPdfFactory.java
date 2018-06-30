package com.zhb.factory.impl;

import com.zhb.factory.ExportFactory;
import com.zhb.file.ExportFile;
import com.zhb.file.impl.ExportFinancialHtmlFile;
import com.zhb.file.impl.ExportFinancialPdfFile;
import com.zhb.file.impl.ExportStandardHtmlFile;
import com.zhb.file.impl.ExportStandardPdfFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 23:15
 * @Description:
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){

            return new ExportStandardPdfFile();
        }else if("financial".equals(type)){

            return new ExportFinancialPdfFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
