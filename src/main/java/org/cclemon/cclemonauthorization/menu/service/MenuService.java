package org.cclemon.cclemonauthorization.menu.service;

import java.util.List;

import org.cclemon.cclemonauthorization.menu.entity.MenuEntity;
import org.cclemon.cclemonauthorization.menu.specification.MenuSpecification;
import org.cclemon.cclemonauthorization.menu.dto.MenuDTO;
import org.cclemon.cclemonauthorization.menu.repository.MenuRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuEntity> query(MenuDTO dto) {

//        MenuEntity entity = new MenuEntity();
//
//        BeanUtils.copyProperties(dto, entity);
//
//        Specification<MenuEntity> spec = MenuSpecification.create(entity);

        return menuRepository.findAll();

    }

}
