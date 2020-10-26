package com.wxh.factory.mybatis.unpooled;

import com.wxh.factory.mybatis.DataSource;

public class UnpooledDataSource implements DataSource {

    public String username;
    public String password;
    public String driverd;

    public UnpooledDataSource(){
        this.username = "Ning";
        this.password = "123";
        this.driverd = "com.mysql.cj.jdbc.Driver";
    }

    public void getConnection() {
        System.out.println("获取数据库连接(Unpooled)");
    }
}
