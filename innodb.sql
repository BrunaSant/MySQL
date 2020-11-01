begin;
insert into colaboradores (nome, nascimento, sexo, peso, altura) values 
('Jacqueline','1996-05-09','F','49.5','1.58');

	select * from colaboradores;
rollback;
	select * from colaboradores;