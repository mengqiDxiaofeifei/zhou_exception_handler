package com.zhou.site.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.entity.User;

import java.util.List;

/**
 * IUserService
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
public interface IUserService extends IService<User> {

    /**
     * 用户列表
     *
     * @return
     */
    List<User> getUserList();
}
