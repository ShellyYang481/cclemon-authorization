package org.cclemon.cclemonauthorization.member.repository;

import java.util.List;
import org.cclemon.cclemonauthorization.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>,JpaSpecificationExecutor<MemberEntity> {

  @Query("from MemberEntity where fullName =:fullName")
  List<MemberEntity> findByQuery(@Param("fullName") String fullName);
}