package com.lbcy.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.util.JdbcConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.activation.DataSource;

@Configuration
public class DataSourcesConfiguration
{
    @Bean
    public DataSource dataSource1() throws Throwable
    {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl("jdbc:mysql://wuxiaodong.mysql.rds.aliyuncs.com:3306/test_for_blog?serverTimezone=GMT%2B8");
        ds.setName("test_for_blog");
        ds.setPassword("A1b2c3d4e5");
        ds.setDbType(JdbcConstants.MYSQL);
        return (DataSource) ds;
    }

    @Bean
    @Primary
    public DataSource dataSource2() throws Throwable
    {
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl("jdbc:mysql://118.190.0.86:3306/bw?serverTimezone=GMT%2B8&zeroDateTimeBehavior=convertToNull&characterEncoding=utf-8");
        ds.setName("root");
        ds.setPassword("Pass@2017");
        ds.setDbType(JdbcConstants.MYSQL);
        return (DataSource) ds;
    }
}
