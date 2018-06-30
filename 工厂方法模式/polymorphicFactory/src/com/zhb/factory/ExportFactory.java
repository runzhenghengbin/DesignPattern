package com.zhb.factory;

import com.zhb.file.ExportFile;

/**
 * @Auther: curry
 * @Date: 2018/6/25 22:59
 * @Description:
 */
public interface ExportFactory {

    public ExportFile factory(String type);
}
