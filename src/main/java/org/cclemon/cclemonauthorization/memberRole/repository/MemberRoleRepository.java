package org.cclemon.cclemonauthorization.memberRole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.cclemon.cclemonauthorization.memberRole.entity.MemberRoleEntity;

@Repository
public interface MemberRoleRepository extends JpaRepository<MemberRoleEntity, Long>,JpaSpecificationExecutor<MemberRoleEntity> {

}