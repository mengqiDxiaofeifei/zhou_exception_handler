package com.zhou.site.controller;

import com.zhou.entity.User;
import com.zhou.site.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "UserController", description = "UserController", tags = {"用户相关"})
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 用户列表
     */
    @GetMapping("")
    @ApiOperation(value = "用户列表", notes = "用户列表")
    public List<User> getUserList() {
        log.info("用户列表");
       List<User> list  =  userService.getUserList();
       return list;
    }
}
