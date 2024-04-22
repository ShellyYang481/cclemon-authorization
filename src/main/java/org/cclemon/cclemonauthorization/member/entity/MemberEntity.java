package org.cclemon.cclemonauthorization.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.cclemon.cclemonauthorization.entity.BaseEntity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="member")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity extends BaseEntity {
    
	/**
	 * Desc:membership pk
	 * Column Name:mem_num, Column Type:BIGINT UNSIGNED, Nullable:N
	 */
    private String memNum ;
	/**
	 * Desc:first name
	 * Column Name:full_name, Column Type:VARCHAR, Nullable:N
	 */
    private String fullName ;
	/**
	 * Desc:帳號
	 * Column Name:account, Column Type:VARCHAR, Nullable:N
	 */
    private String account ;
	/**
	 * Desc:password
	 * Column Name:password, Column Type:VARCHAR, Nullable:N
	 */
    private String password ;

    public static MemberEntity getMember() {
        MemberEntity entity = new MemberEntity();
        entity.setMemNum("");
        entity.setFullName("");
        entity.setAccount("");
        entity.setPassword("");
        return entity;
    }
}
