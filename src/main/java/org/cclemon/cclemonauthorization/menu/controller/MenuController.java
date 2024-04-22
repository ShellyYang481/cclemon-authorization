package org.cclemon.cclemonauthorization.menu.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.cclemon.cclemonauthorization.dto.CclemonResult;
import org.cclemon.cclemonauthorization.menu.entity.MenuEntity;
import org.cclemon.cclemonauthorization.menu.service.MenuService;
import org.cclemon.cclemonauthorization.menu.dto.MenuDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menu")
    public CclemonResult<List<MenuEntity>> query(@ModelAttribute MenuDTO menuDTO) {

        List<MenuEntity> qRes = menuService.query(menuDTO);

        return CclemonResult.<List<MenuEntity>>builder().result(qRes).code(CclemonResult.SUCCESS_CODE).build();
    }

}