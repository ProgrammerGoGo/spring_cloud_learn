package com.cuijian.order.mapper;

import com.cuijian.order.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    @Select("select * from tb_order where id = #{id}")
    Order getById(@Param("id") Long id);
}
