package org.cclemon.cclemonauthorization.memberRole.specification;

import jakarta.persistence.criteria.Predicate;
import org.cclemon.cclemonauthorization.memberRole.entity.MemberRoleEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class MemberRoleSpecification {

  public static Specification<MemberRoleEntity> create(MemberRoleEntity filter) {
    return (root, query, criteriaBuilder) -> {
      Predicate predicate = criteriaBuilder.conjunction();

      if (StringUtils.hasText(filter.getMrNum())) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("mrNum"), filter.getMrNum()));
      }
      if (filter.getMemNum() != null) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("memNum"), filter.getMemNum()));
      }
      if (filter.getRoleNum() != null) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("roleNum"), filter.getRoleNum()));
      }
      if (filter.getIsActive() != null) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("isActive"), filter.getIsActive()));
      }
      if (filter.getCreateBy() != null) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("createBy"), filter.getCreateBy()));
      }
      if (StringUtils.hasText(filter.getCreateAt())) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("createAt"), filter.getCreateAt()));
      }
      if (filter.getUpdateBy() != null) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("updateBy"), filter.getUpdateBy()));
      }
      if (StringUtils.hasText(filter.getUpdateAt())) {
        predicate =
            criteriaBuilder.and(
                predicate, criteriaBuilder.equal(root.get("updateAt"), filter.getUpdateAt()));
      }

      return predicate;
    };
  }
}
