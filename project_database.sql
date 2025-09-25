create database project_management;
use project_management;

create table Project(
	id int primary key not null,
    status ENUM('active','archived') DEFAULT 'active'
);