CREATE TABLE `role` (
  `role_num` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT 'name of the role',
  `app_num` bigint DEFAULT NULL COMMENT 'Mapping to the pk of the app table',
  `description` varchar(255) DEFAULT NULL COMMENT 'Description of the role',
  `parent_role` bigint DEFAULT NULL COMMENT 'It refers to the parent role from which this role inherits. (Mapping to the pk of the same table)',
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `create_by` bigint NOT NULL DEFAULT '0',
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`role_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci