package org.cclemon.cclemonauthorization.member.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.cclemon.cclemonauthorization.dto.CclemonResult;
import org.cclemon.cclemonauthorization.member.dto.MemberDTO;
import org.cclemon.cclemonauthorization.member.entity.MemberEntity;
import org.cclemon.cclemonauthorization.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MemberController {

  private final MemberService memberService;

  @GetMapping("/member")
  public CclemonResult<List<MemberEntity>> query(@ModelAttribute MemberDTO memberDTO) {

    List<MemberEntity> qRes = memberService.query(memberDTO);

    return CclemonResult.<List<MemberEntity>>builder()
        .result(qRes)
        .code(CclemonResult.SUCCESS_CODE)
        .build();
  }

  @GetMapping("/member/findByName")
  public CclemonResult<List<MemberEntity>> findByQuery(@RequestBody MemberDTO memberDTO) {

    List<MemberEntity> qRes = memberService.findByQuery(memberDTO);

    return CclemonResult.<List<MemberEntity>>builder()
        .result(qRes)
        .code(CclemonResult.SUCCESS_CODE)
        .build();
  }
}
