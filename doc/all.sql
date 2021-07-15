drop table if exists `user`;
create table `user`(
    `id` bigint comment '用户ID',
    `name` varchar(10) comment '用户名',
    `password` varchar(10) comment '用户密码',
    primary key (`id`)
)engine=innodb;