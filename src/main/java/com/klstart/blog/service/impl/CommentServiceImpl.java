package com.klstart.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.klstart.blog.entity.Comment;
import com.klstart.blog.mapper.CommentMapper;
import com.klstart.blog.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author KLStart
 * @since 2021-11-20
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
