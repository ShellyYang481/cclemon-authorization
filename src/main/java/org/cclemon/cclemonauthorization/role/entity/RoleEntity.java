package org.cclemon.cclemonauthorization.role.entity;

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
@Table(name="role")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity extends BaseEntity {
    
	/**
	 * Desc:
	 * Column Name:role_num, Column Type:BIGINT UNSIGNED, Nullable:N
	 */
    private String roleNum ;
	/**
	 * Desc:name of the role
	 * Column Name:name, Column Type:VARCHAR, Nullable:N
	 */
    private String name ;
	/**
	 * Desc:Mapping to the pk of the app table
	 * Column Name:app_num, Column Type:BIGINT, Nullable:N
	 */
    private BigDecimal appNum ;
	/**
	 * Desc:Description of the role
	 * Column Name:description, Column Type:VARCHAR, Nullable:N
	 */
    private String description ;
	/**
	 * Desc:It refers to the parent role from which this role inherits. (Mapping to the pk of the same table)
	 * Column Name:parent_role, Column Type:BIGINT, Nullable:N
	 */
    private BigDecimal parentRole ;
	/**
	 * Desc:
	 * Column Name:is_active, Column Type:BIT, Nullable:N
	 */
    private Boolean isActive ;
	/**
	 * Desc:
	 * Column Name:create_by, Column Type:BIGINT, Nullable:N
	 */
    private BigDecimal createBy ;
	/**
	 * Desc:
	 * Column Name:create_at, Column Type:TIMESTAMP, Nullable:N
	 */
    private String createAt ;
	/**
	 * Desc:
	 * Column Name:update_by, Column Type:BIGINT, Nullable:N
	 */
    private BigDecimal updateBy ;
	/**
	 * Desc:
	 * Column Name:update_at, Column Type:TIMESTAMP, Nullable:N
	 */
    private String updateAt ;

    public static RoleEntity getRole() {
        RoleEntity entity = new RoleEntity();
        entity.setRoleNum("");
        entity.setName("");
        entity.setAppNum(new BigDecimal(0));
        entity.setDescription("");
        entity.setParentRole(new BigDecimal(0));
        entity.setIsActive(true);
        entity.setCreateBy(new BigDecimal(0));
        entity.setCreateAt("");
        entity.setUpdateBy(new BigDecimal(0));
        entity.setUpdateAt("");
        return entity;
    }
}
