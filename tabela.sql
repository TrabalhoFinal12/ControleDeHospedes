create database BKMHotel;
use BKMHotel;

create table endereco(
ID_endereco int not null AUTO_INCREMENT,
nacionalidade varchar(200) not null,
estado varchar(100) not null,
cidade varchar(100) not null,
bairro varchar(300) not null,
rua varchar(100) not null,
numero int not null,
complemento varchar(300),
CEP varchar(8),
primary key(ID_endereco)
);

create table Hotel(
ID_hotel int not null AUTO_INCREMENT,
ID_endereco int not null,
ID_f int not null,
ID_quartos int not null,
nome varchar(100) not null,
descricao varchar(500) not null,
telefone varchar(200) not null,
primary key(ID_hotel),
foreign key(ID_endereco) references endereco(ID_endereco),
foreign key(ID_f) references funcionario(ID_f),
foreign key(ID_quartos) references quartos(ID_quartos)
);


create table hospede(
ID_h int not null AUTO_INCREMENT,
ID_endereco int not null,
nome varchar(100) not null,
CPF varchar(15) not null,
dataDeNasc Date not null,
telefone varchar(30) not null,
email varchar(200),
primary key(ID_h),
foreign key(ID_endereco) references endereco(ID_endereco)
);

create table funcionario(
ID_f int not null AUTO_INCREMENT,
ID_endereco int not null,
nome varchar(100) not null,
CPF varchar(15) not null,
dataDeNasc Date not null,
telefone varchar(30) not null,
email varchar(200) not null,
senha int not null,
primary key(ID_f),
foreign key(ID_endereco) references endereco(ID_endereco)
);

create table tiposDeQuarto(
ID_tipo int not null AUTO_INCREMENT,
tipo varchar(30) not null,
descricao varchar(500) not null,
quantidadeDeQuartos INT(100),
precoDiaria numeric(9,2) not null,
primary key(ID_tipo)
);

create table quartos(
ID_quartos int not null AUTO_INCREMENT,
ID_tipo int not null,
tipo varchar(30) not null,
primary key(ID_quartos),
foreign key(ID_tipo) references tiposDeQuarto(ID_tipo)
);

Create table reserva(
ID_reserva int not null AUTO_INCREMENT,
ID_h int not null,
ID_quartos int not null,
ID_hotel int not null,
dataChegada Date not null,
dataSaida Date not null,
horaChegada Time not null,
horaSaida Time not null,
primary key(ID_reserva),
foreign key(ID_h) references hospede(ID_h),
foreign key(ID_quartos) references quartos(ID_quartos),
foreign key(ID_hotel) references Hotel(ID_hotel)
);