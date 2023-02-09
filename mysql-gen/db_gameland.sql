CREATE DATABASE db_gen_game;

USE db_gen_game;

    CREATE TABLE tb_classes(
        id BIGINT AUTO_INCREMENT,
        descricao VARCHAR(50) NOT NULL,

        PRIMARY KEY(id)
    );

INSERT INTO tb_classes(descricao) VALUES ('mago'),('bruxa'),('rainha'),('espiã'),('guerreira')

CREATE TABLE tb_personagens(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    reino INT NOT NULL,
    poder_id VARCHAR(20) NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY(poder_id) REFERENCES tb_classes(id)
);

SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;

INSERT INTO tb_personagens(nome, reino, poder_id) VALUES ('Couve', 9898, 434, 1);
INSERT INTO tb_personagens(nome, reino, poder_id) VALUES ('Manga', 1232, 567, 1);
INSERT INTO tb_personagens(nome, reino, poder_id) VALUES ('Pequi', 4579, 677, 2);
INSERT INTO tb_personagens(nome, reino, poder_id) VALUES ('Feijão', 6900, 543, 2);
INSERT INTO tb_personagens(nome, reino, poder_id) VALUES ('Maçã', 1233, 566, 3);

SELECT * FROM tb_personagens WHERE poder_id > 650;
SELECT * FROM tb_personagens WHERE reino BETWEEN 2000 AND 210;
SELECT * FROM tb_personagens WHERE nome LIKE '%C%';

SELECT * FROM tb_personagens INNER JOIN tb_classes tc on tc.id = tb_personagens.poder_id