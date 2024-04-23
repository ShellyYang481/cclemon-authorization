package org.cclemon.cclemonauthorization.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="member")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {
    
	/**
	 * Desc:membership pk
	 * Column Name:mem_num, Column Type:BIGINT UNSIGNED, Nullable:N
	 */
	@Id
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
