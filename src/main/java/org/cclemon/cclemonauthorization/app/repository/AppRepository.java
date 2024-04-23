package org.cclemon.cclemonauthorization.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.cclemon.cclemonauthorization.app.entity.AppEntity;

@Repository
public interface AppRepository extends JpaRepository<AppEntity, Long>,JpaSpecificationExecutor<AppEntity> {
}