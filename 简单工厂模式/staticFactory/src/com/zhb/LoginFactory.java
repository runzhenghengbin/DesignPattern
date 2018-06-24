package com.zhb;

/**
 * @Auther: curry
 * @Date: 2018/6/24 16:09
 * @Description:
 */
public class LoginFactory {

    public static Login factory(String type){
        if(type.equals("passwordLogin")){
            return new PasswordLogin();
        }else if(type.equals("domainLogin")){
            return new DomainLogin();
        }else {
            throw  new RuntimeException("没有找到对应的登录类型");
        }
    }
}
