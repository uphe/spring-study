package com.hzy.config;

import com.hzy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



//这里如果有多个配置文件，也可以用@Import()引入
//例如引入MyConfig2注解只需在类上面写@Import(MyConfig2.class)

//该注解会被Spring托管，注册到容器中，他该表这是一个配置类，相当于我们的applicationContext.xml
@Configuration
public class MyConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签，这个方法中的名字，就相当于bean标签中的id
    @Bean
    public User user() {
        return new User(); //返回要注入到bean的对象
    }
}
