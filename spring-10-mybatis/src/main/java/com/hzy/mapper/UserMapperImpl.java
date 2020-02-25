package com.hzy.mapper;

import com.hzy.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> getUserList() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.getUserList();
    }
}
