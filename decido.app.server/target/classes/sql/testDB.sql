drop table users;
       create table users(
           id int,
           name varchar(25),
           primary key(id)
       );

       insert into users values(1,'Aay');
       insert into users values(2,'Bay');
       insert into users values(3,'Cay');
       insert into users values(4,'Day');
       insert into users values(5,'Eay');
       insert into users values(6,'Fay');

       commit;