package com.zhou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zhou.entity.common.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * User
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
@Data
@TableName(value = "tb_user")
public class User extends BaseEntity {

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "创建时间", name = "create_time")
    private Integer id;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id", name = "user_uuid")
    private String userUuid;

    /**
     * 账号类型  1： 门户  0 ： 后台
     */
    @ApiModelProperty(value = "账号类型", name = "type")
    private Integer type;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", name = "username")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", name = "password")
    private String password;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;
    /**
     * 电话
     */
    @ApiModelProperty(value = "电话", name = "telephone")
    private String telephone;
    /**
     * 角色
     */
    @ApiModelProperty(value = "角色", name = "role")
    private String role;

    /**
     * 用户状态  1： 启用  0 ：禁用
     */
    @ApiModelProperty(value = "用户状态 1启用0禁用", name = "status")
    private Integer status;
    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户头像", name = "image")
    private String image;

    /**
     * 上次登录IP
     */
    @ApiModelProperty(value = "上次登录IP", name = "last_ip")
    private String lastIp;
    /**
     * 上次登录时间
     */
    @ApiModelProperty(value = "上次登录时间", name = "last_time")
    private Date lastTime;

}



