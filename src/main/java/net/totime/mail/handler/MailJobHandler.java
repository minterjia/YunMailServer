package net.totime.mail.handler;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxl.job.core.handler.annotation.XxlJob;
import net.totime.mail.entity.Mail;
import net.totime.mail.response.ApiResponse;
import net.totime.mail.service.MailService;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/03/28
 * @description 邮件任务处理器
 * @since 1.0.0
 */
@Configuration
public class MailJobHandler {
    @Resource
    private MailService ms;

    private final static String STATUS = "status";
    private final static String USE_SERVE = "use_serve";
    private final static String GO_TO_TIME = "go_to_time";

    /**
     * 云寄定时邮件任务处理器
     *
     * @return {@link ApiResponse}<{@link String}> 处理结果
     */
    @XxlJob("MailSend")
    public ApiResponse<String> execute() {
        List<Mail> list = getMailList(0L);
        //TODO:发送邮件
        return ApiResponse.ok("邮件任务处理器");
    }

    /**
     * 云寄邮件
     *
     * @return {@link ApiResponse}<{@link String}>
     */
    @XxlJob("MailRemind")
    public ApiResponse<String> remind() {
        List<Mail> list = getMailList(24 * 60 * 60 * 1000L);
        //TODO:向管理员发送邮件提醒
        return ApiResponse.ok("邮件提醒处理器");
    }

    /**
     * 获取邮件列表
     *
     * @param time 目标在当前时间之前N个TIME
     * @return {@link List}<{@link Mail}> 邮件列表
     */
    private List<Mail> getMailList(Long time) {
        return ms.list(
                new QueryWrapper<Mail>()
                        .eq(STATUS, 0)
                        .eq(USE_SERVE, 0)
                        .orderByAsc(GO_TO_TIME)
                        .lt(GO_TO_TIME, System.currentTimeMillis() - time)
        );
    }
}