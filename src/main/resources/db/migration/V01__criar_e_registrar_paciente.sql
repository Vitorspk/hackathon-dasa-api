CREATE TABLE paciente (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	cpf VARCHAR(50) NOT NULL,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO paciente (nome, cpf) values ('Vitor Schiavo', '846.525.780-91');
INSERT INTO paciente (nome,cpf) values ('Gilberto Santos', '578.556.570-61');
INSERT INTO paciente (nome,cpf) values ('Thiago', '823.660.849-27');
INSERT INTO paciente (nome,cpf) values ('Jean', '313.583.625-80');

INSERT INTO paciente (nome,cpf) values ('Thiago da Silva', '918.326.631-32');


INSERT INTO paciente (nome, cpf) values ('Vitor Hugo', '726.606.522-44');
INSERT INTO paciente (nome,cpf) values ('Gilberto Da Silva', '222.726.411-05');
INSERT INTO paciente (nome,cpf) values ('Thiago Macedo', '509.585.228-47');
INSERT INTO paciente (nome,cpf) values ('Jean Henrique', '236.940.972-01'); 



