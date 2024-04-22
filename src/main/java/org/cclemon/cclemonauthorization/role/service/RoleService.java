package org.cclemon.cclemonauthorization.role.service;

import java.util.List;

import org.cclemon.cclemonauthorization.role.dto.RoleDTO;
import org.cclemon.cclemonauthorization.role.entity.RoleEntity;
import org.cclemon.cclemonauthorization.role.repository.RoleRepository;
import org.cclemon.cclemonauthorization.role.specification.RoleSpecification;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public List<RoleEntity> query(RoleDTO dto) {

        RoleEntity entity = new RoleEntity();

        BeanUtils.copyProperties(dto, entity);

        Specification<RoleEntity> spec = RoleSpecification.create(entity);

        return roleRepository.findAll(spec);

    }

}
