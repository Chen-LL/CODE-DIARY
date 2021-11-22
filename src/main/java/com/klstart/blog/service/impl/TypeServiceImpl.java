package com.klstart.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.klstart.blog.entity.Type;
import com.klstart.blog.mapper.TypeMapper;
import com.klstart.blog.service.TypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
