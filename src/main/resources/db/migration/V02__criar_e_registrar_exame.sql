CREATE TABLE exame (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	data VARCHAR(50) NOT NULL,
	laudo VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO exame (data, laudo) values ('2017-02-12', 'http://localhost:8080/imagens');
