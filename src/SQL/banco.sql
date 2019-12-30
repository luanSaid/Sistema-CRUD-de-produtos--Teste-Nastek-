/**
 * Author:  Luan Said Meira
 * Created: 29 de dez de 2019
 */
CREATE DATABASE estoque
  WITH ENCODING='UTF8'
       CONNECTION LIMIT=-1;

create table categorias (
	id serial unique,
	nome varchar(50)
);
create table produtos (
	id serial unique,
	nome varchar(50),
	quantidade int,
	id_categoria int,
	FOREIGN KEY (id_categoria) REFERENCES categorias (id)
);

insert into categorias (nome) values ('Cama, mesa e banho');
insert into categorias (nome) values ('Utensílios de cozinha');
insert into categorias (nome) values ('Artefatos de costura');
insert into categorias (nome) values ('Perfumaria');

insert into produtos (nome, quantidade, id_categoria) values ('Toalha',15,1);
insert into produtos (nome, quantidade, id_categoria) values ('Cobertor',20,1);
insert into produtos (nome, quantidade, id_categoria) values ('Roupão',10,1);

insert into produtos (nome, quantidade, id_categoria) values ('Escumadeira',45,2);
insert into produtos (nome, quantidade, id_categoria) values ('Frigideira',5,2);
insert into produtos (nome, quantidade, id_categoria) values ('Colher de pau',70,2);

insert into produtos (nome, quantidade, id_categoria) values ('Agulha',45,3);
insert into produtos (nome, quantidade, id_categoria) values ('Máquina de costura',25,3);
insert into produtos (nome, quantidade, id_categoria) values ('Tubo de linha',100,3);

insert into produtos (nome, quantidade, id_categoria) values ('Malbec',200,4);
insert into produtos (nome, quantidade, id_categoria) values ('Egeo',50,4);
insert into produtos (nome, quantidade, id_categoria) values ('Quasar',35,4);