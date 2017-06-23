-- --------------------------------------------------------  
-- 主机                            	:localhost  
-- 服务器版本             				:5.7.18-0-community-log - MySQL Community Edition (GPL)  
-- 服务器操作系统                    	:ubuntu0.16.04.1 
-- HeidiSQL 版本                   	:7.0.0.4278  
-- 创建                            	:2017-06-23 10:40:19  
-- --------------------------------------------------------  
  
  
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;  
/*!40101 SET NAMES utf8 */;  
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;  
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;  

drop table IF EXISTS `t_post`;
create table IF NOT EXISTS `t_post`(
	`post_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键' ,
	`dept_id`  int(11) not null comment '部门ID',
	`post_name` varchar(128) not null comment '岗位名称',
	PRIMARY KEY ( `post_id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='部门岗位表';

drop table if exists `t_dept`;
create table if not exists `t_dept`(
	`dept_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键' ,
	`company_id` int(11) not null comment '公司编号',
	`dept_name` varchar(128) not null comment '部门名称',
	`parent_dept_id` int(11) not null comment '上级部门名称',
	primary key (`dept_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='公司部门表';

drop table if exists `t_company`;
create table if not exists `t_company`(
	`company_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键' ,
	`cpmpany_name` varchar(128) not null comment '公司名称',
	`parent_company_id` int(11) comment '上级公司名称',
	primary key(`company_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='公司表' ;

drop table if exists `t_role`;
create table if not exists `t_role`(
	`role_id` int(11) UNSIGNED AUTO_INCREMENT ,
	`role_name` varchar(128) not null comment '角色名称',
	primary key(`role_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='角色表';

drop table if exists `t_user_role`;
create table if not exists `t_user_role`(
	`id` int(11) UNSIGNED not null AUTO_INCREMENT COMMENT '主键',
	`user_id` int(11) not null comment '用户编号',
	`role_id` int(11) not null comment '角色编号',
	primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='用户角色表' ;

drop table if exists `t_user_post`;
create table if not exists `t_user_post`(
	`id` int(11) UNSIGNED not null AUTO_INCREMENT COMMENT '主键',
	`user_id` int(11) not null comment '用户编号',
	`post_id` int(11) not null comment '岗位编号',
	primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='用户岗位表' ;