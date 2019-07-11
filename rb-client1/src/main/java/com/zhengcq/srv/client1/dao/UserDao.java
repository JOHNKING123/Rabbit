package com.zhengcq.srv.client1.dao;

import com.zhengcq.srv.client1.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao    {

    User getByUserId(@Param("userId")Long userId);

}
