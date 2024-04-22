package org.cclemon.cclemonauthorization.memberRole.service;

import java.util.List;

import org.cclemon.cclemonauthorization.memberRole.dto.MemberRoleDTO;
import org.cclemon.cclemonauthorization.memberRole.entity.MemberRoleEntity;
import org.cclemon.cclemonauthorization.memberRole.repository.MemberRoleRepository;
import org.cclemon.cclemonauthorization.memberRole.specification.MemberRoleSpecification;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberRoleService {

    private final MemberRoleRepository memberRoleRepository;

    public List<MemberRoleEntity> query(MemberRoleDTO dto) {

        MemberRoleEntity entity = new MemberRoleEntity();

        BeanUtils.copyProperties(dto, entity);

        Specification<MemberRoleEntity> spec = MemberRoleSpecification.create(entity);

        return memberRoleRepository.findAll(spec);

    }

}
