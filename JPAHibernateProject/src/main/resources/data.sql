insert into Course(id,name) values (1001,'MicroService');
insert into Course(id,name) values (1002,'Spring Boot');
insert into Course(id,name) values (1003,'Java8');

insert into Passport(id,num) values(2001,'E123');
insert into Passport(id,num) values(2002,'F123');
insert into Passport(id,num) values(2003,'G123');

insert into Student(id ,name,passport_id) values (3001,'Ranga',2001);
insert into Student(id ,name,passport_id) values (3002,'Anand',2002);
insert into Student(id ,name,passport_id) values (3003,'Drishti',2003);

insert into Review(id,description,rating,course_id) values(4001,'Good' ,'5=Star',1001);
insert into Review(id,description,rating,course_id) values(4002,'Bad' ,'2=Star',1001);
insert into Review(id,description,rating,course_id) values(4003,'Average' ,'3=Star',1003);