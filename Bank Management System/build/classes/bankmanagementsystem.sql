create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(40), city varchar(20), pincode varchar(20), state varchar(25));

show tables;
ALTER TABLE signup RENAME COLUMN formnp TO formno;
ALTER TABLE signup RENAME COLUMN pincode TO city;
select * from signup;