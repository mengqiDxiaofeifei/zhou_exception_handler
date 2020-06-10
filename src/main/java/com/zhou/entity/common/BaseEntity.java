package com.zhou.entity.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * BaseEntity
 * 通用实体
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
@Data
@ApiModel(value = "通用实体")
public class BaseEntity {

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", name = "update_time")
    private Date updateTime;
}
