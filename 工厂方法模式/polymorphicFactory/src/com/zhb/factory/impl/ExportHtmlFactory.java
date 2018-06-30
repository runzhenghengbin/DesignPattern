package com.zhb.factory.impl;

import com.zhb.factory.ExportFactory;
import com.zhb.file.ExportFile;
import com.zhb.file.impl.ExportFinancialHtmlFile;
import com.zhb.file.impl.ExportStandardHtmlFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 23:10
 * @Description:
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){

            return new ExportStandardHtmlFile();
        }else if("financial".equals(type)){

            return new ExportFinancialHtmlFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
