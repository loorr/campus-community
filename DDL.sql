CREATE DATABASE IF NOT EXISTS `campus_im` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

CREATE TABLE IF NOT EXISTS `campus_im`.`user` (
    `id` INT(20) UNSIGNED auto_increment COMMENT '主键',
    `uid` BIGINT(20) unique NOT NULL COMMENT '用户Id',
    `nickname` VARCHAR(20) unique NOT NULL COMMENT '昵称',
    `email` VARCHAR(20) unique NOT NULL COMMENT '邮箱',
    `phone` BIGINT(11) unique COMMENT '手机号',
    `password` VARCHAR(20) NOT NULL COMMENT '密码',
    `admin` tinyint(1) default false COMMENT '是否管理员',
    `db_create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `db_modify_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '用户表';

CREATE TABLE IF NOT EXISTS `campus_im`.`user_role` (
  `id` INT(20) UNSIGNED auto_increment COMMENT '主键',
  `uid` BIGINT(20) NOT NULL COMMENT '用户Id',
  `role_id` VARCHAR(20) NOT NULL COMMENT '角色Id',
  `db_create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `db_modify_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  unique INDEX `uniq_uid_role_id` (`uid`, `role_id`) USING BTREE,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '角色表';

CREATE TABLE IF NOT EXISTS `campus_im`.`role` (
  `id` INT(20) UNSIGNED auto_increment COMMENT '主键',
  `role_id` BIGINT(20) unique NOT NULL COMMENT '角色Id',
  `role_name` VARCHAR(20) unique NOT NULL COMMENT '角色名称',
  `db_create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `db_modify_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '角色表';

CREATE TABLE IF NOT EXISTS `campus_im`.`friends` (
    `id` INT(20) UNSIGNED auto_increment COMMENT '主键',
    `to_uid` BIGINT(20)   NOT NULL COMMENT '被加用户Id',
    `from_uid` BIGINT(20) NOT NULL COMMENT '加用户Id',
    `db_create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `db_modify_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    unique INDEX `uniq_to_uid_from_chat_uid` (`to_uid`, `from_uid`) USING BTREE,
    unique INDEX `uniq_from_uid_to_chat_uid` (`from_uid`, `to_uid`) USING BTREE,
    PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '好友关系表';

CREATE TABLE IF NOT EXISTS `campus_im`.`essay` (
    `id` INT(20) UNSIGNED auto_increment COMMENT '主键',
    `uid` BIGINT(20)   NOT NULL COMMENT '加密用户Id, 如果是匿名消息, 则存加密后的用户id',
    `content` TEXT NOT NULL COMMENT '内容',
    `topic` VARCHAR(50) COMMENT '话题',
    `like_num` INT(10) NOT NULL DEFAULT 0 COMMENT '点赞数',
    `dislike_num` INT(10) NOT NULL DEFAULT 0 COMMENT '不喜欢',
    `has_secret` tinyint(1) default true COMMENT '标识是否匿名(false 正常个人动态, true 匿名动态)',
    `can_public` tinyint(1) default true COMMENT '标识是否公开(false 私有, true 公开)',
    `has_delete` tinyint(1) default true COMMENT '标识是否删除(false 正常, true 删除)',
    `db_create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `db_modify_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '好友关系表';

CREATE TABLE IF NOT EXISTS `campus_im`.`comment` (
    `id` INT(20) UNSIGNED auto_increment COMMENT '主键',
    `essay_id` BIGINT(20)  NOT NULL COMMENT 'essay id',
    `u_id` BIGINT(20)  NOT NULL COMMENT '评论用户id',
    `content` VARCHAR(255) NOT NULL COMMENT '内容',
    `like_num` INT(10) NOT NULL DEFAULT 0 COMMENT '点赞数',
    `dislike_num` INT(10) NOT NULL DEFAULT 0 COMMENT '不喜欢',
    `has_delete` tinyint(1) default true COMMENT '标识是否删除(false 正常, true 删除)',
    `db_create_time` DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `db_modify_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '好友关系表';
