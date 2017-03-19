# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table account (
  account_id                    integer not null,
  about_me                      varchar(255),
  profile_picture               varchar(255),
  cover_photo                   varchar(255),
  email                         varchar(255),
  constraint uq_account_email unique (email),
  constraint pk_account primary key (account_id)
);
create sequence accseq increment by 1;

create table user (
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table account add constraint fk_account_email foreign key (email) references user (email) on delete restrict on update restrict;


# --- !Downs

alter table account drop constraint if exists fk_account_email;

drop table if exists account;
drop sequence if exists accseq;

drop table if exists user;

