package org.cclemon.cclemonauthorization.role.specification;

import jakarta.persistence.criteria.Predicate;
import org.cclemon.cclemonauthorization.role.entity.RoleEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class RoleSpecification {

    public static Specification<RoleEntity> create(RoleEntity filter) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();

            if (StringUtils.hasText(filter.getRoleNum())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("roleNum"), filter.getRoleNum()));
            }
            if (StringUtils.hasText(filter.getName())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("name"), filter.getName()));
            }
            if (filter.getAppNum() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("appNum"), filter.getAppNum()));
            }
            if (StringUtils.hasText(filter.getDescription())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("description"), filter.getDescription()));
            }
            if (filter.getParentRole() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("parentRole"), filter.getParentRole()));
            }
            if (filter.getIsActive() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("isActive"), filter.getIsActive()));
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
            
            return predicate;
        };
    }

}
