package org.cclemon.cclemonauthorization.memberRole.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.cclemon.cclemonauthorization.dto.CclemonResult;
import org.cclemon.cclemonauthorization.memberRole.service.MemberRoleService;
import org.cclemon.cclemonauthorization.memberRole.dto.MemberRoleDTO;
import org.cclemon.cclemonauthorization.memberRole.entity.MemberRoleEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MemberRoleController {

    private final MemberRoleService memberRoleService;

    @GetMapping("/memberRole")
    public CclemonResult<List<MemberRoleEntity>> query(@ModelAttribute MemberRoleDTO memberRoleDTO) {

        List<MemberRoleEntity> qRes = memberRoleService.query(memberRoleDTO);

        return CclemonResult.<List<MemberRoleEntity>>builder().result(qRes).code(CclemonResult.SUCCESS_CODE).build();
    }

}