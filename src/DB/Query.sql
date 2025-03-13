Create table Cargo (
    Id integer primary key autoincrement,
    Nombre text unique not null
);

Create table Empleado (
    Cedula integer primary key,
    Nombre text not null,
    Apellido text not null,
    Celular text not null,
    correo text unique not null,
    FK_IdCargo integer not null,
    foreign key (FK_IdCargo) references Cargo(id)
);

Create table Estudiante (
    Codigo_Estudiante integer primary key,
    Nombre text not null,
    Apellido text not null,
    Fecha_Nacimiento text not null,
    email text not null,
    curriculum text not null,
    Grado_de_avance text not null
);

Create table Empresa (
    Nit integer primary key,
    Nombre text not null
);

Create table Departamento (
    Id integer primary key autoincrement,
    Nombre text unique not null,
    FK_idDecano integer not null,
    foreign key (FK_idDecano) references Empleado(Cedula)
);

Create table Oficina_de_trabajo (
    Id integer primary key,
    FK_idSecretaria integer not null,
    FK_idDepartamento integer unique not null,
    foreign key (FK_idSecretaria) references Empleado(Cedula),
    foreign key (FK_idDepartamento) references Departamento(Id)
);

Create table Estudiante_Oficina (
    Id integer primary key autoincrement,
    FK_Codigo_Estudiante integer not null,
    FK_idOficina integer not null,
    foreign key (FK_Codigo_Estudiante) references Estudiante(Codigo_Estudiante),
    foreign key (FK_idOficina) references Oficina_de_trabajo(id)
);

Create table Ofertas_De_Empleo(
    Codigo integer primary key,
    Descripcion text not null,
    Publicacion integer null,
    Fecha_de_aparicion text not null,
    Fecha_limite_de_presentacion text not null,
    FK_idOficinaDeTrabajo integer not null,
    FK_idDepartamento integer,
    Fk_idEmpresa integer,
    figuraNombre integer not null,
    foreign key (FK_idOficinaDeTrabajo) references Oficina_de_trabajo(Id),
    foreign key (FK_idDepartamento) references Departamento(Id),
    foreign key (Fk_idEmpresa) references Empresa(Nit),
    CONSTRAINT UnaSolaLlave CHECK (FK_idDepartamento is not null or Fk_idEmpresa is not null)
);

Create table Postulacion(
    Id integer primary key autoincrement,
    fecha text not null,
    hora text not null,
    ganador integer not null,
    FK_Codigo_Estudiante integer not null,
    FK_Codigo_Oferta integer not null,
    foreign key (FK_Codigo_Estudiante) references Estudiante(Codigo_Estudiante),
    foreign key (FK_Codigo_Oferta) references Ofertas_De_Empleo(Codigo)
);

insert into Cargo (Nombre) VALUES ('Decano');
insert into Cargo (Nombre) VALUES ('Secretaria');

insert into Empleado (Cedula, Nombre, Apellido, Celular, correo, FK_IdCargo) VALUES (1, 'Juan', 'Perez', '1234567890', 'jperez@ucentral.edu.co', 1);
insert into Empleado (Cedula, Nombre, Apellido, Celular, correo, FK_IdCargo) VALUES (2, 'Viviana', 'Morales', '1234567890', 'vmorales@ucentral.edu.co', 1);
insert into Empleado (Cedula, Nombre, Apellido, Celular, correo, FK_IdCargo) VALUES (3, 'Maria', 'Gomez', '1234567890', 'mgomez@ucentral.edu.ci', 2);
insert into Empleado (Cedula, Nombre, Apellido, Celular, correo, FK_IdCargo) VALUES (4, 'Paula', 'Garzon', '1234567890', 'pgarzon@ucentral.edu.co', 2);

insert into Estudiante (Codigo_Estudiante, Nombre, Apellido, Fecha_Nacimiento, email, curriculum, Grado_de_avance) VALUES (1, 'Pedro', 'Gomez', '01/01/2000', 'pgomez@ucentral.edu.co', 'Curriculum', 'Grado de avance');
insert into Estudiante (Codigo_Estudiante, Nombre, Apellido, Fecha_Nacimiento, email, curriculum, Grado_de_avance) VALUES (2, 'Juan', 'Gomez', '01/01/2000', 'jgomez@ucentral.edu.co', 'Curriculum', 'Grado de avance');

insert into Departamento (Nombre, FK_idDecano) VALUES ('Ingenieria', 1);
insert into Departamento (Nombre, FK_idDecano) VALUES ('Ciencias', 2);

insert into Oficina_de_trabajo (Id, FK_idSecretaria, FK_idDepartamento) VALUES (1010, 4, 1);
insert into Oficina_de_trabajo (Id, FK_idSecretaria, FK_idDepartamento) VALUES (2020, 3, 2);

insert into Estudiante_Oficina (FK_Codigo_Estudiante, FK_idOficina) VALUES (1, 1010);
insert into Estudiante_Oficina (FK_Codigo_Estudiante, FK_idOficina) VALUES (1, 2020);
insert into Estudiante_Oficina (FK_Codigo_Estudiante, FK_idOficina) VALUES (2, 2020);

select TOF.id as CodigoOficina, TD.Nombre as NombreDepartamento, TEM.Nombre || ' ' || TEM.Apellido as Decano  from Estudiante TE inner join Estudiante_Oficina TEO on TE.Codigo_Estudiante = TEO.FK_Codigo_Estudiante inner join Oficina_de_trabajo TOF on TEO.FK_idOficina = TOF.Id inner join Departamento TD on TOF.FK_idDepartamento = TD.Id inner join Empleado TEM on TD.FK_idDecano = TEM.Cedula where TE.Codigo_Estudiante = 1;