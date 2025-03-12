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