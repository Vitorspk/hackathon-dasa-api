CREATE TABLE paciente (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	cpf VARCHAR(50) NOT NULL,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO paciente (nome, cpf) values ('Vitor', '40634071874');
INSERT INTO paciente (nome,cpf) values ('Tucho', '04332988981');
