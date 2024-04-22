package org.cclemon.cclemonauthorization.menu.entity;

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
@Table(name="menu")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MenuEntity extends BaseEntity {
    
	/**
	 * Desc:
	 * Column Name:menu_num, Column Type:BIGINT UNSIGNED, Nullable:N
	 */
    private String menuNum ;
	/**
	 * Desc:
	 * Column Name:menu_name, Column Type:VARCHAR, Nullable:N
	 */
    private String menuName ;
	/**
	 * Desc:display order of the menu
	 * Column Name:order, Column Type:INT, Nullable:N
	 */
    private BigDecimal order ;
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

    public static MenuEntity getMenu() {
        MenuEntity entity = new MenuEntity();
        entity.setMenuNum("");
        entity.setMenuName("");
        entity.setOrder(new BigDecimal(0));
        entity.setCreateBy(new BigDecimal(0));
        entity.setCreateAt("");
        entity.setUpdateBy(new BigDecimal(0));
        entity.setUpdateAt("");
        return entity;
    }

}
