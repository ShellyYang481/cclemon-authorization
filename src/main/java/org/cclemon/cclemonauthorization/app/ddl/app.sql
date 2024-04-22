CREATE TABLE `app` (
  `app_num` bigint unsigned NOT NULL AUTO_INCREMENT,
  `app_name` varchar(100) NOT NULL,
  `menu_num` bigint NOT NULL,
  `app_url` varchar(100) NOT NULL COMMENT 'e.g. /COA001',
  `create_by` bigint NOT NULL,
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` bigint DEFAULT NULL,
  `update_at` timestamp NULL DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`app_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci