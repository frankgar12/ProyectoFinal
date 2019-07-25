create schema control_escolar authorization postgres;

set search_path to control_escolar;

create table padre
(
id_padre int primary key,
n_completo varchar (50),
correo varchar (50),
telefono varchar (10),
direccion varchar (150),
foto bytea
);

create table administrador
(
id_usuario int primary key,
n_completo varchar (50),
f_nacimiento date,
sexo varchar (20),
correo varchar (30),
telefono varchar (10),
direccion varchar (150),
nom_us varchar (20),
contraseña varchar (10),
foto bytea
);

create table docente
(
id_docente int primary key,
n_completo varchar (50),
cod_presu varchar (30),
telefono varchar (10),
direccion varchar (150),
correo varchar (30),
CURP varchar (18),
año_ingreSEP date,
año_ingreESC date,
año_ingreZN date,
f_nacimiento date,
RFC varchar (13),
cargo varchar (30),
no_ident int,
contraseña int,
foto bytea
);


create table grado
(
id_grado int primary key,
numero varchar (2)
);

create table grupo_identificador
(
id_grupo int primary key,
letra varchar (1)
);

create table materia
(
id_materia int primary key,
nombre varchar (50),
id_grado int,
foreign key (id_grado) references grado (id_grado) match full on update cascade on delete restrict
);

create table estudiante 
(
id_estudiante int primary key,
matricula int,
n_completo varchar (50),
CURP varchar (18),
f_nacimiento date,
sexo varchar (20),
grp_sanguineo varchar (2),
id_grado int,
id_padre int,
foreign key (id_grado) references grado (id_grado) match full on update cascade on delete restrict,
foreign key (id_padre) references padre (id_padre) match full on update cascade on delete restrict
);



create table grupos_creados
(
id_gruposcreados int primary key,
id_grado int,
id_grupo int,
id_estudiante int,
foreign key (id_grado) references grado (id_grado) match full on update cascade on delete restrict,
foreign key (id_grupo) references grupo_identificador (id_grupo) match full on update cascade on delete restrict,
foreign key (id_estudiante) references estudiante (id_estudiante) match full on update cascade on delete restrict
);


create table asignar_docente
(
id_asignardocente int primary key,
id_gruposcreados int,
id_docente int,
foreign key (id_gruposcreados) references grupos_creados (id_gruposcreados) match full on update cascade on delete restrict,
foreign key (id_docente) references docente (id_docente) match full on update cascade on delete restrict
);

create table asignar_materias
(
id_asignarmaterias int primary key,
id_gruposcreados int,
id_materia int,
foreign key (id_gruposcreados) references grupos_creados (id_gruposcreados) match full on update cascade on delete restrict,
foreign key (id_materia) references materia (id_materia) match full on update cascade on delete restrict
);


create table calificaciones
(
id_calificaciones int primary key,
bimestre_uno decimal,
bimestre_dos decimal,
bimestre_tres decimal,
bimestre_cuatro decimal,
bimestre_cinco decimal,
bimestre_seis decimal,
promedio decimal,
id_gruposcreados int,
foreign key (id_gruposcreados) references grupos_creados (id_gruposcreados) match full on update cascade on delete restrict
);