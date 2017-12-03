CREATE TABLE imagem (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	exame_id BIGINT(20) NOT NULL,
	url VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO imagem (exame_id, url) values (1, 'http://localhost:8080/imagens');
