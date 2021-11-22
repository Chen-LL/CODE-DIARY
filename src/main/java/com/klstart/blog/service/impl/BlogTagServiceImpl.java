package com.klstart.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.klstart.blog.entity.BlogTag;
import com.klstart.blog.mapper.BlogTagMapper;
import com.klstart.blog.service.BlogTagService;
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
public class BlogTagServiceImpl extends ServiceImpl<BlogTagMapper, BlogTag> implements BlogTagService {

}
