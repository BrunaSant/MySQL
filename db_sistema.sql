create database db_sistema;
use db_sistema;
create table colaboradores(
id_registro int not null auto_increment,
nome varchar (30),
nascimento date,
sexo enum ('F','M','O'),
salario decimal (7,2),
primary key(id_registro)
)engine = innodb;
insert into colaboradores 
	(id_registro,nome,nascimento,sexo,salario)
    values
	(default,'Bruna','1996-05-09','F','15769'),
    (default,'Jacqueline','1986-05-09','F','1600'),
    (default,'Karina','1931-05-09','F','4700'),
    (default,'Cleiton','2000-05-09','M','3000'),
    (default,'Guilherme','1896-05-09','M','7900');
    
    select * from colaboradores where salario > 2000;
    select * from colaboradores where salario < 2000;