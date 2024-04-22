package org.cclemon.cclemonauthorization.member.specification;


import jakarta.persistence.criteria.Predicate;
import org.cclemon.cclemonauthorization.member.entity.MemberEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class MemberSpecification {

    public static Specification<MemberEntity> create(MemberEntity filter) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();

            if (StringUtils.hasText(filter.getMemNum())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("memNum"), filter.getMemNum()));
            }
            if (StringUtils.hasText(filter.getFullName())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("fullName"), filter.getFullName()));
            }
            if (StringUtils.hasText(filter.getAccount())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("account"), filter.getAccount()));
            }
            if (StringUtils.hasText(filter.getPassword())) {
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("password"), filter.getPassword()));
            }
            
            return predicate;
        };
    }

}
