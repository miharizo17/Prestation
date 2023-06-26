create database prestation;
create role prestation login password 'prestation';
alter database prestation owner to prestation;

create table admin(
    id serial primary key,
    nom varchar(255),
    mdp varchar(255),
    etat int default 0
);
insert into admin(nom,mdp) values ('mia','mia');

create table employe(
    id serial primary key,
    nom varchar(255),
    prenom varchar(255),
    mdp varchar(255),
    adresse varchar(255),
    sexe varchar(255),
    contact varchar(255),
    etat int default 0
);
insert into employe(nom,prenom,mdp,adresse,sexe,contact) values ('ANDRIANIONY','Kanto','kanto','Ambohitrarahaba','femme','0346050961');
insert into employe(nom,prenom,mdp,adresse,sexe,contact) values ('RANDRIAMBELO','Zo','zo','Ambohipanja','homme','0348601955');
insert into employe(nom,prenom,mdp,adresse,sexe,contact) values ('Ony','Miary','miary','Ilafy','homme','0345480796');

create table typeprestation(
    id serial primary key,
    type varchar(255)
);
insert into typeprestation(type) values ('fete');
insert into typeprestation(type) values ('spectacle');
insert into typeprestation(type) values ('tournee');

create table unite(
    id serial primary key,
    unite varchar(255)
);
insert into unite(unite) values ('heures');
insert into unite(unite) values ('jours');

create table depense(
    id serial primary key,
    type varchar(255),
    etat int default 0
);
insert into depense(type) values ('communication');
insert into depense(type) values ('transport');

create table ville(
    id serial primary key,
    ville varchar(255)
);
insert into ville(ville) values ('Analamahisty');
insert into ville(ville) values ('Analakely');
insert into ville(ville) values ('Ambohitrarahaba');
insert into ville(ville) values ('Andoharanofotsy');

create table typelieu(
    id serial primary key,
    type varchar(255)
);
insert into typelieu(type) values ('salle');
insert into typelieu(type) values ('espace');
insert into typelieu(type) values ('terrain');

create table categorieplace(
    id serial primary key,
    categorie varchar(255)
);
insert into categorieplace(categorie) values ('VIP');
insert into categorieplace(categorie) values ('Reserve');
insert into categorieplace(categorie) values ('Normal');

create table lieu(
    id serial primary key,
    idville int,
    idtypelieu int,
    nom varchar(255),
    etat int default 0,
    nbrpersonnes int
);
alter table lieu add foreign key(idville) references ville(id);
alter table lieu add foreign key(idtypelieu) references typelieu(id);
insert into lieu(idville,idtypelieu,nom,nbrpersonnes) values (1,1,'FootSalle',100);
insert into lieu(idville,idtypelieu,nom,nbrpersonnes) values (2,2,'Piettra Hotel',50);

create table lieuphoto(
    id serial primary key,
    idlieu int,
    sary text
);
alter table lieuphoto add foreign key(idlieu) references lieu(id);

create table lieucategorieplace(
    id serial primary key,
    idlieu int,
    idcategorieplace int,
    capacite int
); 
alter table lieucategorieplace add foreign key(idlieu) references lieu(id);
alter table lieucategorieplace add foreign key(idcategorieplace) references categorieplace(id);


create or replace view v_lieu as
select lieu.*,typelieu.type,ville.ville,lieuphoto.sary
from lieu
join ville on ville.id = lieu.idville
join typelieu on typelieu.id=lieu.idtypelieu
join lieuphoto on lieuphoto.idlieu = lieu.id;


create table typesonorisation(
    id serial primary key,
    type varchar(255)
);
insert into typesonorisation(type) values ('standart');
insert into typesonorisation(type) values ('premium');

create table sonorisation(
    id serial primary key,
    idtypesono int,
    tarif double precision,
    duree double precision,   
    idunite int,
    etat int default 0
);
alter table sonorisation add foreign key(idtypesono) references typesonorisation(id);
alter table sonorisation add foreign key(idunite) references unite(id);

create or replace view v_sono as 
select sonorisation.*,typesonorisation.type,unite.unite
from sonorisation 
join typesonorisation on typesonorisation.id = sonorisation.idtypesono
join unite on unite.id= sonorisation.idunite;
select * from v_sono;

create table typelogistique(
    id serial primary key,
    type varchar(255)
);
insert into typelogistique(type) values ('standart');
insert into typelogistique(type) values ('premium');

create table logistique(
    id serial primary key,
    idtypelogistique int,
    tarif double precision,
    duree double precision,
    idunite int,
    etat int default 0
);
alter table logistique add foreign key(idtypelogistique) references typelogistique(id);
alter table logistique add foreign key(idunite) references unite(id);

create or replace view v_logistique as
select logistique.*,typelogistique.type,unite.unite
from logistique
join typelogistique on typelogistique.id = logistique.idtypelogistique
join unite on unite.id= logistique.idunite;

create table artiste(
    id serial primary key,
    nom varchar(255),
    tarif double precision,
    duree double precision,
    idunite int,
    etat int default 0,
    sary text
);
alter table artiste add foreign key(idunite) references unite(id);

create table prestation(
    id serial primary key,
    nomprestation varchar(255),
    idtypeprestation int,
    idemploye int,
    etat int default 0,
    datespectacle date,
    heurespectacle varchar(255)
);
alter table prestation add foreign key(idtypeprestation) references typeprestation(id);
alter table prestation add foreign key(idemploye) references employe(id);

create table prestationlieu(
    id serial primary key,
    idprestation int,
    idlieu int,
    tarif double precision,
    etat int default 0
);
alter table prestationlieu add foreign key(idprestation) references prestation(id);
alter table prestationlieu add foreign key(idlieu) references lieu(id);

create table prestationlieucategorieplace(
    id serial primary key,
    idprestation int,
    idlieu int,
    idlieucategorieplace int,
    tarif double precision,
    etat int default 0,
    totalcategorieplace double precision
);
alter table prestationlieucategorieplace add foreign key(idprestation) references prestation(id);
alter table prestationlieucategorieplace add foreign key(idlieu) references lieu(id);
alter table prestationlieucategorieplace add foreign key(idlieucategorieplace) references lieucategorieplace(id);

create table prestationartiste(
    id serial primary key,
    idprestation int,
    idartiste int,
    duree double precision,
    montanttotal double precision,
    etat int default 0
);
alter table prestationartiste add foreign key(idprestation) references prestation(id);
alter table prestationartiste add foreign key(idartiste) references artiste(id);

create table prestationsono(
    id serial primary key,
    idprestation int,
    idsono int,
    duree double precision,
    montanttotal double precision,
    etat int default 0
);
alter table prestationsono add foreign key(idprestation) references prestation(id);
alter table prestationsono add foreign key(idsono) references sonorisation(id);

create table prestationlogistique(
    id serial primary key,
    idprestation int,
    idlogistique int,
    duree double precision,
    montanttotal double precision,
    etat int default 0
);
alter table prestationlogistique add foreign key(idprestation) references prestation(id);
alter table prestationlogistique add foreign key(idlogistique) references logistique(id);

create table prestationdepense(
    id serial primary key,
    idprestation int,
    iddepense int,
    tarif double precision,
    etat int default 0
);
alter table prestationdepense add foreign key(idprestation) references prestation(id);
alter table prestationdepense add foreign key(iddepense) references depense(id);

create table prestationdevis(
    id serial primary key,
    idprestation int,
    montanttotal double precision,
    recette double precision,
    depense double precision,
    benefice double precision,
    beneficeAvecTaxe double precision,
    etat int default 0
);
alter table prestationdevis add foreign key(idprestation) references prestation(id);

create or replace view v_prestationdevis as
select prestationdevis.*,
prestation.nomprestation,prestation.datespectacle,prestation.heurespectacle
from prestationdevis
join prestation on prestation.id = prestationdevis.idprestation;

create table image(
id serial primary key,
sary text
);

create or replace view v_lieucategorieplace as
select lieucategorieplace.*,
v_lieu.nom,v_lieu.type,v_lieu.nbrpersonnes,v_lieu.ville,
categorieplace.categorie
from lieucategorieplace
join v_lieu on v_lieu.id = lieucategorieplace.idlieu
join categorieplace on categorieplace.id =lieucategorieplace.idcategorieplace ;

create table taxe(
id serial primary key,
taxe int
);

create table test(
id serial primary key,
nom varchar(255),
prenom varchar(255),
age int
);
insert into test(nom,prenom,age) values ('Mia','kan',19);
insert into test(nom,prenom,age) values ('Nanto','zo',19);