package org.cclemon.cclemonauthorization.app.specification;

import jakarta.persistence.criteria.Predicate;

import org.cclemon.cclemonauthorization.app.entity.AppEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;



public class AppSpecification {

    public static Specification<AppEntity> create(AppEntity filter) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();

            if (StringUtils.hasText(filter.getAppNum())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("appNum"), filter.getAppNum()));
            }
            if (StringUtils.hasText(filter.getAppName())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("appName"), filter.getAppName()));
            }
            if (filter.getMenuNum() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("menuNum"), filter.getMenuNum()));
            }
            if (StringUtils.hasText(filter.getAppUrl())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("appUrl"), filter.getAppUrl()));
            }
            if (filter.getCreateBy() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("createBy"), filter.getCreateBy()));
            }
            if (StringUtils.hasText(filter.getCreateAt())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("createAt"), filter.getCreateAt()));
            }
            if (filter.getUpdateBy() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("updateBy"), filter.getUpdateBy()));
            }
            if (StringUtils.hasText(filter.getUpdateAt())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("updateAt"), filter.getUpdateAt()));
            }
            if (filter.getIsActive() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("isActive"), filter.getIsActive()));
            }
            
            return predicate;
        };
    }

}
