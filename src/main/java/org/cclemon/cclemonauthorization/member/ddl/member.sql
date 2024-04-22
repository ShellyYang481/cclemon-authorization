CREATE TABLE `member` (
  `mem_num` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'membership pk',
  `full_name` varchar(200) NOT NULL COMMENT 'first name',
  `account` varchar(200) NOT NULL COMMENT '帳號',
  `password` varchar(200) NOT NULL COMMENT 'password',
  PRIMARY KEY (`mem_num`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci