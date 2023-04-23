-- USE
USE demo

-- INSERT
load data local infile "./items.csv" into table items fields terminated by ',' optionally enclosed by '"';
commit;