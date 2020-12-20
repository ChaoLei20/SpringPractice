create table user_info
(
    id      varchar(50) not null
        primary key,
    name    varchar(10) null,
    age     int         null,
    address int         null
)
    comment '用户信息';

INSERT INTO testify.user_info (id, name, age, address) VALUES ('1234', '姓名2', 24, 1606);