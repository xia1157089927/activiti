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
insert into t_post(post_id, dept_id, post_name)values(1, 9, '产品经理-北京' );
insert into t_post(post_id, dept_id, post_name)values(2, 14, '产品经理-南京' );
insert into t_post(post_id, dept_id, post_name)values(3, 10, 'java开发' );
insert into t_post(post_id, dept_id, post_name)values(4, 5, '.net开发' );
insert into t_post(post_id, dept_id, post_name)values(5, 8, 'UI-北京' );
insert into t_post(post_id, dept_id, post_name)values(6, 13, 'UI-南京' );
insert into t_post(post_id, dept_id, post_name)values(7, 7, '系统架构-北京' );
insert into t_post(post_id, dept_id, post_name)values(8, 11, '系统架构-南京' );
insert into t_post(post_id, dept_id, post_name)values(9, 3, '南京信息部总监' );
insert into t_post(post_id, dept_id, post_name)values(10, 2, '北京信息部总监' );
insert into t_post(post_id, dept_id, post_name)values(11, 6, '前端开发-北京' );
insert into t_post(post_id, dept_id, post_name)values(12, 12, '前端开发-南京' );
insert into t_post(post_id, dept_id, post_name)values(18, 4, '运维' );
insert into t_post(post_id, dept_id, post_name)values(14, 4, '实施' );
insert into t_post(post_id, dept_id, post_name)values(15, 15, '软件测试' );



drop table if exists `t_dept`;
create table if not exists `t_dept`(
	`dept_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键' ,
	`company_id` int(11) not null comment '公司编号',
	`dept_name` varchar(128) not null comment '部门名称',
	`parent_dept_id` int(11) not null comment '上级部门名称',
	primary key (`dept_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='公司部门表';
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (1, 1, '信息部', -1);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (2, 1, '北京信息部', 1);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (3, 1, '南京信息部', 1);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (4, 1, '实施运维组', 2);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (5, 1, '.net开发组', 2);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (6, 1, '北京前端开发组', 2);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (7, 1, '北京架构组', 2);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (8, 1, '北京UI开发组', 2);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (9, 1, '北京产品组', 2);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (10, 1, 'Java开发组', 3);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (11, 1, '南京架构组', 3);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (12, 1, '南京前端开发组', 3);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (13, 1, '南京UI开发组', 3);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (14, 1, '南京产品组', 3);
insert into t_dept(dept_id, company_id, dept_name, parent_dept_id) values (15, 1, '南京测试组', 3);


drop table if exists `t_company`;
create table if not exists `t_company`(
	`company_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键' ,
	`cpmpany_name` varchar(128) not null comment '公司名称',
	`parent_company_id` int(11) comment '上级公司名称',
	primary key(`company_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='公司表' ;
insert into t_company(company_id, cpmpany_name, parent_company_id) values(1, '华汽', -1);
insert into t_company(company_id, cpmpany_name, parent_company_id) values(2, '华汽-南京分公司', 1);
insert into t_company(company_id, cpmpany_name, parent_company_id) values(3, '华汽-吉林分公司', 1);
insert into t_company(company_id, cpmpany_name, parent_company_id) values(4, '华汽-西安分公司', 1);

drop table if exists `t_role`;
create table if not exists `t_role`(
	`role_id` int(11) UNSIGNED AUTO_INCREMENT ,
	`role_name` varchar(128) not null comment '角色名称',
	`describe` varchar(256) comment '角色描述',
	primary key(`role_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='角色表';
insert into t_role(role_id, role_name, `describe`) values (1, '管理员', '');
insert into t_role(role_id, role_name, `describe`) values (2, '董事', '');
insert into t_role(role_id, role_name, `describe`) values (3, '董事长', '');
insert into t_role(role_id, role_name, `describe`) values (4, '总裁', '');
insert into t_role(role_id, role_name, `describe`) values (5, '总经理', '');
insert into t_role(role_id, role_name, `describe`) values (6, '部门总监', '');
insert into t_role(role_id, role_name, `describe`) values (7, '部门副总监', '');
insert into t_role(role_id, role_name, `describe`) values (8, '小组组长', '');
insert into t_role(role_id, role_name, `describe`) values (9, '普通员工', '');
insert into t_role(role_id, role_name, `describe`) values (10, '游客', '');

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