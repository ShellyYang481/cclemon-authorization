package org.cclemon.cclemonauthorization.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.cclemon.cclemonauthorization.app.dto.AppDTO;
import org.cclemon.cclemonauthorization.app.entity.AppEntity;
import org.cclemon.cclemonauthorization.app.service.AppService;
import org.cclemon.cclemonauthorization.dto.CclemonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AppController {

  private final AppService appService;

  @GetMapping("/app")
  public CclemonResult<List<AppEntity>> query(@ModelAttribute AppDTO appDTO) {

    List<AppEntity> qRes = appService.query(appDTO);

    return CclemonResult.<List<AppEntity>>builder()
        .result(qRes)
        .code(CclemonResult.SUCCESS_CODE)
        .build();
  }
}
