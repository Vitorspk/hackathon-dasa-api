CREATE TABLE imagem (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	exame_id BIGINT(20) NOT NULL,
	url VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--PARA O PACIENTE 1
INSERT INTO imagem (exame_id, url) values (1, 'https://s3-sa-east-1.amazonaws.com/s1-major/kfjsdfjsfj439r8498risdjf49.jpg');
INSERT INTO imagem (exame_id, url) values (2, 'https://s3-sa-east-1.amazonaws.com/s1-major/lsgflsdksadlkladsfalgf04tt95095.jpg');
INSERT INTO imagem (exame_id, url) values (3, 'https://s3-sa-east-1.amazonaws.com/s1-major/14025120041_e07b47fa0a67808fb9112729ffdbc236.jpg');
INSERT INTO imagem (exame_id, url) values (4, 'https://s3-sa-east-1.amazonaws.com/s1-major/fsadfsadfgkwiwfijskfwe8594859345.jpg');
INSERT INTO imagem (exame_id, url) values (5, 'https://s3-sa-east-1.amazonaws.com/s1-major/lsgflsdksadlkladsfalgf04tt95095.jpg');
INSERT INTO imagem (exame_id, url) values (6, 'https://s3-sa-east-1.amazonaws.com/s1-major/kjfksdfkasjfkljfskdfjkj455345.pnhg.jpg');
