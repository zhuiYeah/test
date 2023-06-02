package com.example.test.mapper;


import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

//DAO层访问数据库接口文件
@Mapper
public interface UserMapper {
    UserBean getInfo(String name, String password);
}
