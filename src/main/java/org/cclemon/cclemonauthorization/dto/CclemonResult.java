package org.cclemon.cclemonauthorization.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CclemonResult<T> {

  public static Integer SUCCESS_CODE = 200;

  private String msg;

  private Integer code;

  private T result;

}