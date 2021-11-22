package com.klstart.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.klstart.blog.entity.Tag;
import com.klstart.blog.mapper.TagMapper;
import com.klstart.blog.service.TagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
