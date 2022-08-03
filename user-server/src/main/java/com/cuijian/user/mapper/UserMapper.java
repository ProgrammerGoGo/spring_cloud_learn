package com.cuijian.user.mapper;

import com.cuijian.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User getUserById(@Param("id") Long id);
}
