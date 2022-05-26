CREATE DATABASE BD_DAWI_CL2_EscobarAdrian;
USE BD_DAWI_CL2_EscobarAdrian;

create table genero(
idGenero int key auto_increment,  
nombreGenero varchar(45)
);

create table clasificacion(
idClasificacion int key auto_increment,  
nombreClasificacion varchar(45),
descripcionClasificacion varchar(255)
);

create table pelicula(
idPelicula int primary key auto_increment,
titulo varchar(45),
fecha int,
duracion varchar(10),
idGenero int,
idClasificacion int				
);

alter table pelicula add constraint FK01_genero foreign key(idGenero) references genero(idGenero);
alter table pelicula add constraint FK02_clasificacion foreign key(idClasificacion) references clasificacion(idClasificacion);

insert into genero values (null, 'Comedia');
insert into genero values (null, 'Accion');
insert into genero values (null, 'Aventura');
select * from genero;

insert into clasificacion values (null, 'A', 'Película para todo público');
insert into clasificacion values (null, 'B', 'Película para adolescentes de 12 años en adelante');
insert into clasificacion values (null, 'B15', 'Película no recomendable para menores de 15 años de edad');
select* from clasificacion;


insert into pelicula values (null, 'Lobo de Wall Street', 2013,'3 horas',1,3);
insert into pelicula values (null, 'Deadpool', 2016,'2 horas',1,2);

insert into pelicula values (null, 'Misión Imposible', 2018,'2 horas',2,1);
insert into pelicula values (null, 'The Purge', 2021,'2 horas',2,3);

insert into pelicula values (null, 'Doctor Strange', 2022,'2 horas',3,1);
insert into pelicula values (null, 'Interstellar', 2014,'3 horas',3,2);

select * from pelicula;