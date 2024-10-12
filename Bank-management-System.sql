create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20),name varchar(20),father_name varchar(20),dob varchar(20),gender varchar(20),email varchar(20),marital varchar(20),address varchar(20),city varchar(20),pincode varchar(20),state varchar(20));

create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),Education varchar(20),Occupation varchar(20),Pan varchar(20),addhar varchar(20),Seniorcitizen varchar(20),existingaccount varchar(20));

create table signupthree(formno varchar(20),accountType varchar(40),cardnumber varchar(25),pin varchar(20),facility varchar(100));

create table login(formno varchar(20),cardnumber varchar(25),pin varchar(10));

create table bank(pin varchar(10),date varchar(50),type  varchar(20),amount varchar(20));





