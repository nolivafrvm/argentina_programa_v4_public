-- Tabla turno
CREATE TABLE tb_turno(
id int,
fechaTurno date,
idMedico int,
idPaciente int,
observaciones varchar(255),
estado varchar(255)
);

CREATE TABLE especialidades(
id int,
nombre varchar(255),
descripcion varchar(255)
);