package net.totime.mail.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * 邮件与信件评论表(Comment)表实体类
 *
 * @author JanYork
 * @since 2023-04-23 14:54:45
 */
@Data
@Builder
public class CommentVO {
    /**
     * 评论ID
     */
    private Long id;
    /**
     * 父级评论ID
     */
    private Long parentId;
    /**
     * 评论用户ID
     */
    private Long userId;
    /**
     * 评论对应邮件或者信件
     */
    private String mailOrLetterId;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论时间
     */
    private Date createTime;
    /**
     * 是否过滤
     */
    private Integer isFilter;
    /**
     * 子评论
     */
    private List<CommentVO> children;
}
