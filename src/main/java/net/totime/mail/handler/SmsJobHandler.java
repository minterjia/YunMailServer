package net.totime.mail.handler;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxl.job.core.handler.annotation.XxlJob;
import net.totime.mail.entity.Message;
import net.totime.mail.response.ApiResponse;
import net.totime.mail.service.MessageService;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/03/28
 * @description 短信任务处理器
 * @since 1.0.0
 */
@Configuration
public class SmsJobHandler {
    @Resource
    private MessageService ms;

    @XxlJob("SmsJobHandler")
    public ApiResponse<String> execute() {
        List<Message> list = ms.list(
                new QueryWrapper<Message>()
                        .eq("status", 0)
                        .orderByAsc("send_time")
                        .gt("send_time", System.currentTimeMillis())
        );
        //TODO:发送短信
        return ApiResponse.ok("短信任务处理器");
    }
}