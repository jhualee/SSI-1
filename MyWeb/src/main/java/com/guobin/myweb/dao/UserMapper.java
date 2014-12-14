package com.guobin.myweb.dao;

import com.guobin.myweb.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by withnate on 14-12-14.
 */
public interface UserMapper {
    @Select("SELECT * FROM STUDENT WHERE STUDENT_ID = #{userId}")
    UserBean getUser(@Param("userId") String userId);
}
