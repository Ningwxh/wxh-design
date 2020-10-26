package com.wxh.factory.mybatis.pooled;

import com.wxh.factory.mybatis.unpooled.UnpooledDataSourceFactory;

public class PooledDataSourceFactory extends UnpooledDataSourceFactory {

    public PooledDataSourceFactory(){
        this.dataSource = new PooledDataSource();
    }

}
