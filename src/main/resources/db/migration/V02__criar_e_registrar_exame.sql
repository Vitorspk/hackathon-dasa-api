CREATE TABLE exame (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo BIGINT(20) NOT NULL,
	data VARCHAR(50) NOT NULL,
	laudo VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `hackathondasaapi`.`exame`
(`id`,
`codigo`,
`data`,
`laudo`)
VALUES
(1,
123456,
'2017-11-01',
'http://localhost:8080/exames');


INSERT INTO `hackathondasaapi`.`exame`
(`id`,
`codigo`,
`data`,
`laudo`)
VALUES
(2,
1234567,
'2017-11-02',
'http://localhost:8080/exames');
