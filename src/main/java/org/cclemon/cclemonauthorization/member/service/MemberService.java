package org.cclemon.cclemonauthorization.member.service;

import java.util.List;

import org.cclemon.cclemonauthorization.member.dto.MemberDTO;
import org.cclemon.cclemonauthorization.member.entity.MemberEntity;
import org.cclemon.cclemonauthorization.member.repository.MemberRepository;
import org.cclemon.cclemonauthorization.member.specification.MemberSpecification;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberEntity> query(MemberDTO dto) {

        MemberEntity entity = new MemberEntity();

        BeanUtils.copyProperties(dto, entity);

        Specification<MemberEntity> spec = MemberSpecification.create(entity);

        return memberRepository.findAll(spec);

    }

}
