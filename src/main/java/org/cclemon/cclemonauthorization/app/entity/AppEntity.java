package org.cclemon.cclemonauthorization.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.cclemon.cclemonauthorization.menu.entity.MenuEntity;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "app")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AppEntity {

  /** Desc: Column Name:app_num, Column Type:BIGINT UNSIGNED, Nullable:N */
  @Id private String appNum;

  /** Desc: Column Name:app_name, Column Type:VARCHAR, Nullable:N */
  private String appName;

  /** Desc: Column Name:menu_num, Column Type:BIGINT, Nullable:N */
  private BigDecimal menuNum;

  /** Desc:e.g. /COA001 Column Name:app_url, Column Type:VARCHAR, Nullable:N */
  private String appUrl;

  /** Desc: Column Name:create_by, Column Type:BIGINT, Nullable:N */
  private BigDecimal createBy;

  /** Desc: Column Name:create_at, Column Type:TIMESTAMP, Nullable:N */
  private String createAt;

  /** Desc: Column Name:update_by, Column Type:BIGINT, Nullable:N */
  private BigDecimal updateBy;

  /** Desc: Column Name:update_at, Column Type:TIMESTAMP, Nullable:N */
  private String updateAt;

  /** Desc: Column Name:is_active, Column Type:BIT, Nullable:N */
  private Boolean isActive;

  @OneToOne private MenuEntity menuEntity;
}
