package cn.totime.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (RelationshipInfo)表实体类
 *
 * @author JanYork
 * @since 2023-01-01 20:44:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RelationshipInfo extends Model<RelationshipInfo> {
    private static final long serialVersionUID = -3122655072357372163L;

    /**
     * 关系表自增ID
     */
    @TableId(type = IdType.AUTO)
    private Integer relationshipId;
    /**
     * 关系名称
     */
    private String relationshipName;
}