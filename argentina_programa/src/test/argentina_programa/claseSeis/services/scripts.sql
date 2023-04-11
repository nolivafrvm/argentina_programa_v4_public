-- Tabla turno
CREATE TABLE tb_turno(
id int,
fechaTurno date,
idMedico int,
idPaciente int,
observaciones varchar(255),
estado varchar(255)
);