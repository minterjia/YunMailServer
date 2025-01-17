package net.totime.mail.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.totime.mail.enums.MailState;
import net.totime.mail.enums.MailUseServer;

/**
 * 邮件任务表(Mail)表实体类
 *
 * @author JanYork
 * @since 2023-03-27 22:13:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Mail extends Model<Mail> {
    private static final long serialVersionUID = -8324377863828666746L;
    /**
     * 邮件唯一ID
     */
    @TableId
    private String mailId;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 邮件标题
     */
    private String mailTitle;
    /**
     * 邮件内容
     */
    private String mailContent;
    /**
     * 邮件创建时间
     */
    private Date mailCreateTime;
    /**
     * 发往地址
     */
    private String goTo;
    /**
     * 邮件是否公开
     */
    private Boolean isPublic;
    /**
     * 邮件发送时间
     */
    private Date goToTime;
    /**
     * 邮件是否发给自己
     */
    private Boolean isYourself;
    /**
     * 邮件发送使用的服务
     */
    private MailUseServer useServe;
    /**
     * 邮件发送状态
     */
    private MailState state;
}