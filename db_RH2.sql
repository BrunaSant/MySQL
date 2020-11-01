create database db_RH2;
use db_RH2;

create table tb_funcionario(
id_funcionario int not null auto_increment,
nome varchar(30),
sexo enum('F','M','O'),
nascimento date,
cargo varchar(30),
id_cargo int,
primary key(id_funcionario),
constraint fk_funcionario_cargo foreign key(id_cargo) references tb_cargo(id_cargo)
)engine = innodb;


create table tb_cargo(
id_cargo int not null auto_increment,
cargo varchar(30),
setor varchar(30),
salario decimal(7,2),
primary key(id_cargo)
)engine = innodb;

insert into tb_funcionario values
(default,'Karina Lima','F','1995-09-06','Diretora',1),
(default,'Jacqueline Barbosa','O','1992-09-15','Suervisora',2),
(default,'Bruna Santos','F','1996-05-09','auxiliar',3),
(default,'Nathalia Moreno','F','1995-10-29','auxiliar',3),
(default,'Ednilson','M','1982-07-23','auxiliar',3);

insert into tb_cargo values
(default,'diretor','administrativo','19000.00'),
(default,'supervisor','contabilidade','7562.00'),
(default,'auxiliar','governança','1800.00');

select * from tb_cargo where salario > 2000;
select * from tb_cargo where salario >1000.00 and salario < 2000.00;

select * from tb_cargo 
inner join tb_funcionario
where tb_cargo.id_cargo = tb_funcionario.id_cargo;