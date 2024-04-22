package org.cclemon.cclemonauthorization.role.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.cclemon.cclemonauthorization.dto.CclemonResult;
import org.cclemon.cclemonauthorization.role.service.RoleService;
import org.cclemon.cclemonauthorization.role.dto.RoleDTO;
import org.cclemon.cclemonauthorization.role.entity.RoleEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/role")
    public CclemonResult<List<RoleEntity>> query(@ModelAttribute RoleDTO roleDTO) {

        List<RoleEntity> qRes = roleService.query(roleDTO);

        return CclemonResult.<List<RoleEntity>>builder().result(qRes).code(CclemonResult.SUCCESS_CODE).build();
    }

}