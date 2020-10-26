package com.wxh.factory.mybatis.unpooled;

import com.wxh.factory.mybatis.DataSource;
import com.wxh.factory.mybatis.DataSourceFactory;

public class UnpooledDataSourceFactory implements DataSourceFactory {

    public DataSource dataSource = new UnpooledDataSource();

    public DataSource getDataSource() {
        return this.dataSource;
    }
}
