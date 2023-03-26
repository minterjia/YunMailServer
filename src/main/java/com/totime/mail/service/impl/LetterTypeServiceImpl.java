package com.totime.mail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.totime.mail.entity.LetterType;
import com.totime.mail.mapper.LetterTypeMapper;
import com.totime.mail.service.LetterTypeService;
import org.springframework.stereotype.Service;

/**
 * (LetterType)表服务实现类
 *
 * @author JanYork
 * @since 2023-03-26 17:54:03
 */
@Service
public class LetterTypeServiceImpl extends ServiceImpl<LetterTypeMapper, LetterType> implements LetterTypeService {

}