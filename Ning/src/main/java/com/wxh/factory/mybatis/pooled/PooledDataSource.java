package com.wxh.factory.mybatis.pooled;

import com.wxh.factory.mybatis.DataSource;
import com.wxh.factory.mybatis.unpooled.UnpooledDataSource;

public class PooledDataSource implements DataSource {

    private DataSource dataSource = new UnpooledDataSource();

    public void getConnection() {
        System.out.println("返回DataSource");
    }
}
