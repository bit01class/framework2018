create table bbs2(
	idx integer primary key auto_increment,
	sub varchar(20),
	content text,
	nalja timestamp,
	cnt int
);

insert into bbs2 (sub,content,nalja,cnt) values ('test1','test',now(),0);
insert into bbs2 (sub,content,nalja,cnt) values ('test2','test',now(),0);
insert into bbs2 (sub,content,nalja,cnt) values ('test3','test',now(),0);
insert into bbs2 (sub,content,nalja,cnt) values ('test4','test',now(),0);
insert into bbs2 (sub,content,nalja,cnt) values ('test5','test',now(),0);
commit;
select * from bbs2 order by idx desc;