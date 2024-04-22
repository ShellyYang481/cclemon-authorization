package org.cclemon.cclemonauthorization.app.service;

import java.util.List;

import org.cclemon.cclemonauthorization.app.dto.AppDTO;
import org.cclemon.cclemonauthorization.app.entity.AppEntity;
import org.cclemon.cclemonauthorization.app.repository.AppRepository;
import org.cclemon.cclemonauthorization.app.specification.AppSpecification;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppService {

    private final AppRepository appRepository;

    public List<AppEntity> query(AppDTO dto) {

        AppEntity entity = new AppEntity();

        BeanUtils.copyProperties(dto, entity);

        Specification<AppEntity> spec = AppSpecification.create(entity);

        return appRepository.findAll(spec);

    }

}
