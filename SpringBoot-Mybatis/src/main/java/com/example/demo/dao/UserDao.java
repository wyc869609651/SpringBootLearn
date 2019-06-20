package com.example.demo.dao;

import com.example.demo.entity.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {

    /*@Select("SELECT * FROM `user`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "password", column = "password"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "email", column = "email"),
            @Result(property = "regTime", column = "reg_time")
    })*/
    List<UserBean> getAll();

    /*@Insert("INSERT INTO `user`(id, user_name, `password`, nick_name, email, reg_time) " +
            "VALUE(NULL, #{userName}, #{password}, #{nickName}, #{email}, #{regTime})")
    @SelectKey(keyProperty = "id", before = false, resultType = Long.class, statement = "SELECT LAST_INSERT_ID() AS id")*/
    void insert(UserBean user);

    //@Update("UPDATE `user` SET nick_name=#{nickName} WHERE user_name = #{userName}")
    void updateNickName(@Param("userName") String userName, @Param("nickName") String nickName);

    //@Delete("DELETE FROM `user` WHERE user_name = #{userName}")
    void delete(@Param("userName") String userName);
}
