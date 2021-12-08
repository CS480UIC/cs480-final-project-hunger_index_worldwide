create database if not exists hunger_index_worldwide ;
use hunger_index_worldwide; 



drop table if exists world_hunger_statistics;
create table world_hunger_statistics (
user_id INT PRIMARY KEY,
avg_income INT NOT NULL,
vaccination_rate FLOAT NOT NULL,
death_rate FLOAT NOT NULL,
happiness_index FLOAT NOT NULL,
unemplyment_rate FLOAT NOT NULL,
body_fate_percentage FLOAT NOT NULL,
date_added Date
);


drop table if exists world_body_fat_percentage;
create table world_body_fat_percentage (
body_fate_percentage FLOAT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL
);


drop table if exists world_death_rate;

create table world_death_rate (
death_rate FLOAT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL

);



drop table if exists world_happiness_index;

create table world_happiness_index (
happiness_index FLOAT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL
);



drop table if exists world_income_index;

create table world_income_index (
avg_income INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL
);

drop table if exists world_unemployment_rate;

create table world_unemployment_rate(
unemployment_rate FLOAT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL
);

drop table if exists world_vaccination_rate;

create table world_vaccination_rate(
vaccination_rate FLOAT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL
);



drop table if exists user;

CREATE TABLE user
(
  
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);


drop table if exists entity1;

CREATE TABLE entity1 
(
  
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);
