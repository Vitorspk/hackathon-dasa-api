CREATE TABLE imagem (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	imagemURL VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO imagem (imagemURL) values ( 'http://localhost:8080/imagens');
