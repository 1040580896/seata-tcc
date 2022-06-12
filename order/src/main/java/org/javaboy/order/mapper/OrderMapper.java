package org.javaboy.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Mapper
public interface OrderMapper {

    @Insert("insert into order_tbl(userId,productId,count,money) values(#{userId},#{productId},#{count},#{money})")
    Integer addOrder(@Param("userId") String userId, @Param("productId") String productId, @Param("count") Integer count, @Param("money") Double money);
}

