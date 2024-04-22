package org.cclemon.cclemonauthorization.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import java.time.LocalDateTime;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@MappedSuperclass
@EntityListeners({ AuditingEntityListener.class })
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

  /**
   * Desc:
   * Column Name:id, Column Type:BIGINT, Nullable:N
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * Desc:
   * Column Name:version, Column Type:INT, Nullable:N
   */
  @Version
  private Integer version;

  /**
   * Desc:
   * Column Name:create_user_id, Column Type:INT, Nullable:N
   */
  @CreatedBy
  private Integer createUserId;

  /**
   * Desc:
   * Column Name:create_time, Column Type:DATETIME, Nullable:N
   */
  @CreatedDate
  @Column(name = "create_time", nullable = false, updatable = false)
  private LocalDateTime createTime;

  /**
   * Desc:
   * Column Name:last_modified_user_id, Column Type:INT, Nullable:N
   */
  @LastModifiedBy
  private Integer lastModifiedUserId;

  /**
   * Desc:
   * Column Name:last_modified_time, Column Type:DATETIME, Nullable:N
   */
  @LastModifiedDate
  private LocalDateTime LastModifiedTime;

  /**
   * Desc:
   * Column Name:deleted, Column Type:BIT, Nullable:N
   */
  private Boolean deleted;
}