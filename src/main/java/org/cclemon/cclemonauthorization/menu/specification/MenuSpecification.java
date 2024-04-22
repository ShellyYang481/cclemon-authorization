package org.cclemon.cclemonauthorization.menu.specification;

import jakarta.persistence.criteria.Predicate;
import org.cclemon.cclemonauthorization.menu.entity.MenuEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;



public class MenuSpecification {

    public static Specification<MenuEntity> create(MenuEntity filter) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();

            if (StringUtils.hasText(filter.getMenuNum())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("menuNum"), filter.getMenuNum()));
            }
            if (StringUtils.hasText(filter.getMenuName())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("menuName"), filter.getMenuName()));
            }
            if (filter.getOrder() != null) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("order"), filter.getOrder()));
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
