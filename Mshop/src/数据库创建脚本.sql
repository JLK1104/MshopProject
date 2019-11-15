--ɾ�����ݿ�
DROP DATABASE IF EXISTS mshop ;
--�������ݿ�
CREATE DATABASE mshop CHARACTER SET UTF8 ;
--ʹ��mshop���ݿ�
use mshop;
--ɾ�����ݱ�
drop table IF EXISTS leixing;
drop table IF EXISTS admin;
drop table IF EXISTS member;
drop table IF EXISTS shangpin;
drop table IF EXISTS dingdan;
drop table IF EXISTS dingdanxq;

--�������ݱ�
--1.������Ʒ���ͱ�

create table leixing
(
   lid                  int not null,
   name                 varchar(50),
   primary key (lid)
)type=innodb;
--��������Ա��
create table admin
(
   aid                  varchar(50) not null,
   password             varchar(32),
   lastdate                 datetime,
   primary key (aid)
)type=innodb;
--�����û���
create table member
(
   mid                  varchar(50) not null,
   password             varchar(32),
   name                 varchar(10),
   tel                  varchar(50),
   address              varchar(100),
   status               int,
   code                 varchar(100),
   regdate              datetime ,
   photo                varchar(50),
   primary key (mid)
)type=innodb;
--������Ʒ��
create table shangpin
(
   sid                  int not null,
   lid                  int,
   odid                 int,
   aid                  varchar(50),
   sname                varchar(50),
   sdate                datetime,
   price                float,
   sno                  int,
   fno                  int,
   miaoshu              text,
   sphoto               varchar(100),
   spzt                 int,
   primary key (sid)
)type=innodb;

alter table shangpin add constraint FK_Reference_1 foreign key (lid)
      references leixing (lid) on delete restrict on update restrict;

alter table shangpin add constraint FK_Reference_4 foreign key (odid)
      references dingdanxq (odid) on delete restrict on update restrict;

alter table shangpin add constraint FK_Reference_5 foreign key (aid)
      references admin (aid) on delete restrict on update restrict;
--����������
create table dingdan
(
   did                  int not null,
   mid                  varchar(50),
   dname                varchar(50),
   dtel                 varchar(50),
   dadd                 varchar(100),
   dtime                datetime,
   allprice             float,
   primary key (did)
)type=innodb;

alter table dingdan add constraint FK_Reference_2 foreign key (mid)
      references member (mid) on delete restrict on update restrict;
--�������������
create table dingdanxq
(
   odid                 int not null,
   did                  int,
   dname                varchar(50),
   price                float,
   number               int,
   primary key (odid)
)type=innodb;

alter table dingdanxq add constraint FK_Reference_3 foreign key (did)
      references dingdan (did) on delete restrict on update restrict;

