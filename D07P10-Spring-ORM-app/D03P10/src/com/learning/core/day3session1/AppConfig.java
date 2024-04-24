package com.learning.core.day3session1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import javax.sql.DataSource;
import java.util.Properties;
 
@Configuration
public class AppConfig {
    @Bean
    public DataSource dataSource() {
        // Configure DataSource
    }
 
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        // Configure SessionFactory
    }
 
    @Bean
    public HibernateTemplate hibernateTemplate() {
        return new HibernateTemplate(sessionFactory().getObject());
    }
}
