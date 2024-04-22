package org.cclemon.cclemonauthorization.menu.repository;

import org.cclemon.cclemonauthorization.menu.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long>,JpaSpecificationExecutor<MenuEntity> {

}