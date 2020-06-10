package com.zhou.site.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.entity.User;

import java.util.List;

/**
 * UserDao
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
public interface UserDao extends BaseMapper<User> {


    List<User> getUserList();
}
