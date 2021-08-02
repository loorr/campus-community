package com.example.springbootstudy.dao;


import com.example.springbootstudy.model.User;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zjianfa
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user limit #{num}")
    List<User> getAllUser(@Param("num") int num);

    @Insert("INSERT INTO `user`(uid, nickname, email, phone, password, is_admin) " +
            "values(#{uid}, #{nickname}, #{email}, #{phone}, #{password}, #{isAdmin})")
    int insertOne(User user);

    @Update("UPDATE `user` SET nickname=#{nickname}, email=#{email}, phone=#{phone}, " +
            "password=#{password},is_admin=#{isAdmin} " +
            "WHERE uid=#{uid}")
    int updateOne(User user);

    @Delete("DELETE FROM `user` WHERE uid = #{uid}")
    int deleteOne(@Param("uid") Long uid);

}
