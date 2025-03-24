create type Stato as enum('LIBERO', 'OCCUPATO');

create type Tipo as enum('PARZIALE', 'TOTALE');

create table case_in_vendita (
	catastale varchar(50) NOT NULL,
	indirizzo varchar(50) NOT NULL,
	numero_civico varchar (10) NOT NULL,
	piano int NOT NULL,
	metri real NOT NULL,
	vani int NOT NULL,
	prezzo real NOT NULL,
	stato Stato NOT NULL,
	filiale_proponente varchar(50) NOT NULL,
    primary key(catastale),
	foreign key (filiale_proponente) references filiali(partita_iva)

);

create table case_in_affitto(
	catastale varchar(50) Not null,
	indirizzo varchar(50) Not null,
	civico varchar(10) Not null,
	tipo_affitto Tipo Not null,
	bagno_personale int Not null,
	prezzo_mensile real Not null,
	filiale_proponente varchar(50) Not null,
	primary key(catastale),
    foreign key (filiale_proponente) references filiali(partita_iva)
);

create table filiali(
	partita_iva varchar(50),
	nome varchar(50),
	indirizzo_sede varchar(50),
	civico varchar(50),
	telefono varchar(10),
	primary key(partita_iva)
);

CREATE TABLE vendite_casa (
    catastale varchar(50),
    data_vendita date,
    filiale_proponente varchar(20),
    filiale_venditrice varchar(20),
    prezzo_vendita real,
    primary key(catastale),
    foreign key (catastale) references case_in_vendita(catastale),
    foreign key (filiale_proponente) references filiali(partita_iva),
    foreign key (filiale_venditrice) references filiali(partita_iva)
);

CREATE TABLE affitti_casa (
    catastale varchar(50),
    data_affitto date,
    filiale_proponente varchar(20),
    filiale_venditrice varchar(20),
    prezzo_affitto real,
    durata_contratto int,
    primary key(catastale),
    foreign key (catastale) references case_in_affitto(catastale),
    foreign key (filiale_proponente) references filiali(partita_iva),
    foreign key (filiale_venditrice) references filiali(partita_iva)
);