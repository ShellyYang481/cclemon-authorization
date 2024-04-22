package org.cclemon.cclemonauthorization.memberRole.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.cclemon.cclemonauthorization.entity.BaseEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "member_role")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRoleEntity extends BaseEntity {

  /** Desc:Pk of the table Column Name:mr_num, Column Type:BIGINT UNSIGNED, Nullable:N */
  private String mrNum;

  /** Desc:mapping to pk of the member table Column Name:mem_num, Column Type:BIGINT, Nullable:N */
  private BigDecimal memNum;

  /**
   * Desc:Mapping to the pk of the role table Column Name:role_num, Column Type:BIGINT, Nullable:N
   */
  private BigDecimal roleNum;

  /** Desc: Column Name:is_active, Column Type:BIT, Nullable:N */
  private Boolean isActive;

  /** Desc: Column Name:create_by, Column Type:BIGINT, Nullable:N */
  private BigDecimal createBy;

  /** Desc: Column Name:create_at, Column Type:TIMESTAMP, Nullable:N */
  private String createAt;

  /** Desc: Column Name:update_by, Column Type:BIGINT, Nullable:N */
  private BigDecimal updateBy;

  /** Desc: Column Name:update_at, Column Type:TIMESTAMP, Nullable:N */
  private String updateAt;

  public static MemberRoleEntity getMemberRole() {
    MemberRoleEntity entity = new MemberRoleEntity();
    entity.setMrNum("");
    entity.setMemNum(new BigDecimal(0));
    entity.setRoleNum(new BigDecimal(0));
    entity.setIsActive(true);
    entity.setCreateBy(new BigDecimal(0));
    entity.setCreateAt("");
    entity.setUpdateBy(new BigDecimal(0));
    entity.setUpdateAt("");
    return entity;
  }
}
