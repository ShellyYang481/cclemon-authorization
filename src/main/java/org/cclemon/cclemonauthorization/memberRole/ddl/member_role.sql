CREATE TABLE `member_role` (
  `mr_num` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'Pk of the table',
  `mem_num` bigint NOT NULL COMMENT 'mapping to pk of the member table',
  `role_num` bigint NOT NULL COMMENT 'Mapping to the pk of the role table',
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `create_by` bigint NOT NULL DEFAULT '0',
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`mr_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci