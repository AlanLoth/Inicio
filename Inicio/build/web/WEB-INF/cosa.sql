drop database if exists cosa; 
create database cosa;
use cosa;

create table usuarios (
    usuario nvarchar (100),
    contraseña nvarchar (100),
    primary key (usuario)
);

insert into usuarios values('Alan', 'Loth'),('Perez', 'Tafoya');

delimiter //
    create procedure agrega(in nom nvarchar(100),in pass nvarchar(100))
        begin
            declare msj nvarchar(100);
            if exists(select usuario from usuarios where usuario = nom) then
		set msj = 'el usuario ya esta registrado';
            else
		insert into usuario values (nom,pass);
                set msj = 'registrado con exito';
            end if;
            select  msj;
        end//
delimiter ;