package com.zhb;

/**
 * @Auther: curry
 * @Date: 2018/6/24 16:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        String type = "passwordLogin";

        String name = "name";

        String password = "password";

        Login login = LoginFactory.factory(type);

        Boolean bool =  login.verify(name,password);
        if(bool){
            //业务逻辑
        }else{
            //业务逻辑
        }
    }
}
