package net.totime.mail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.totime.mail.entity.LetterType;
import net.totime.mail.mapper.LetterTypeMapper;
import net.totime.mail.service.LetterTypeService;
import org.springframework.stereotype.Service;

/**
 * 信件类型表(LetterType)表服务实现类
 *
 * @author JanYork
 * @since 2023-03-29 10:46:48
 */
@Service
public class LetterTypeServiceImpl extends ServiceImpl<LetterTypeMapper, LetterType> implements LetterTypeService {

}