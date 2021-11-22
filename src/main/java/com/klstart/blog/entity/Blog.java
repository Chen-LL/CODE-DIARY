package com.klstart.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author KLStart
 * @since 2021-11-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Blog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 内容
     */
    private String content;

    /**
     * 首图
     */
    private String headImage;

    /**
     * 浏览次数
     */
    private Integer views;

    /**
     * 开启赞赏：0否1是
     */
    private Integer appreciation;

    /**
     * 开启版权声明：0否1是
     */
    private Integer copyright;

    /**
     * 开启评论：0否1是
     */
    private Integer comment;

    /**
     * 开启发布：0否1是
     */
    private Integer publish;

    /**
     * 分类id
     */
    private Integer typeId;


}
