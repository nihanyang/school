package com.school.web.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.school.dao.mapper.school"},sqlSessionFactoryRef = "sqlSessionFactory2")
public class MybatisTestConfig {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.school.dao.model.school");
        Resource[] resources = new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mapper/school/*Mapper.xml");
        factoryBean.setMapperLocations(resources);
        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory2());
        return template;
    }


}
