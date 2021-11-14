create database hunger_index_worldwide ;
use hunger_index_worldwide; 



drop table if exists world_hunger_statistics;
create table world_hunger_statistics (
user_id INT PRIMARY KEY,
avg_income INT NOT NULL,
vaccination_rate INT NOT NULL,
death_rate INT NOT NULL,
happiness_index INT NOT NULL,
unemplyment_rate INT NOT NULL,
body_fate_percentage INT NOT NULL,
);


drop table if exists world_body_fat_percentage;
create table world_body_fat_percentage (
body_fate_percentage INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL,
FOREIGN KEY (body_fate_percentage) REFERENCES world_hunger_statistics(body_fate_percentage) on update cascade on delete cascade
);


drop table if exists world_death_rate;

create table world_death_rate (
death_rate INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL,
FOREIGN KEY (death_rate) REFERENCES world_hunger_statistics(death_rate) on update cascade on delete cascade

);



drop table if exists world_happiness_index;

create table world_happiness_index (
happiness_index INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL,
FOREIGN KEY (happiness_index) REFERENCES world_hunger_statistics(happiness_index) on update cascade on delete cascade
);



drop table if exists login_user;
 create table login_user(
  user_id INT primary key,
  user_name VARCHAR(50) ,
  FOREIGN KEY (user_id) REFERENCES world_hunger_statistics(user_id) on update cascade on delete cascade
  );

drop table if exists world_income_index;

create table world_income_index (
avg_income INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL,
FOREIGN KEY (avg_income) REFERENCES world_hunger_statistics(avg_income) on update cascade on delete cascade
);

drop table if exists world_unemployment_rate;

create table world_unemployment_rate(
unemplyment_rate INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL,
FOREIGN KEY (unemplyment_rate) REFERENCES world_hunger_statistics(unemplyment_rate) on update cascade on delete cascade
);

drop table if exists world_vaccination_rate;

create table world_vaccination_rate(
vaccination_rate INT PRIMARY KEY,
country VARCHAR(30) NOT NULL,
continent VARCHAR(30) NOT NULL,
FOREIGN KEY (vaccination_rate) REFERENCES world_hunger_statistics(vaccination_rate) on update cascade on delete cascade
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
