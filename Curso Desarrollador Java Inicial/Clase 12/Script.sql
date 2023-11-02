CREATE TABLE departamento(
	nombre varchar(50) NOT NULL,
	presupuesto int NOT NULL,
	PRIMARY KEY (nombre)
);

CREATE TABLE empleado(
	dni int NOT NULL,
	nombre varchar(50) NOT NULL,
	apellido varchar(50) NOT NULL,
	nacionalidad varchar(100) NOT NULL,
	departamento varchar(100) NOT NULL,
	PRIMARY KEY (dni),
	FOREIGN KEY (departamento) REFERENCES departamento(nombre)
);

INSERT departamento (nombre, presupuesto) VALUES ('logistica', 25000);
INSERT departamento (nombre, presupuesto) VALUES ('sistemas', 50000);
INSERT departamento (nombre, presupuesto) VALUES ('compras', 100000);
INSERT departamento (nombre, presupuesto) VALUES ('administracion', 150000);

-- 4) Insertar un empleado nuevo en la nómina de trabajo.
INSERT empleado VALUES (12345678, 'Jose', 'Perez', 'Argentina', 'logistica');
INSERT empleado VALUES (23412637, 'Santiago', 'Gimenez', 'Argentina', 'sistemas');
INSERT empleado VALUES (87654321, 'Pedro', 'Paredes', 'Brasil', 'compras');
INSERT empleado VALUES (12873465, 'Felipe', 'Melo', 'Paraguay', 'logistica');
INSERT empleado VALUES (22232789, 'Mateo', 'Mussu', 'Uruguay', 'administracion');

-- 5) Modificar la nacionalidad de algún empleado.
UPDATE empleado SET nacionalidad='Colombia' WHERE dni=23412637;
UPDATE empleado SET nacionalidad='Peru' WHERE dni=12873465;

-- 6) Eliminar un departamento.
DELETE FROM empleado WHERE departamento = 'administracion';
DELETE FROM departamento WHERE nombre = 'administracion';

-- 7) Conocer los empleados que trabajan en el departamento de “logística” (puede ser cualquiera de los que agreguen).
SELECT * FROM empleado WHERE departamento = 'logistica';

-- 8) Mostrar todos los departamentos ordenados alfabéticamente.
SELECT * FROM departamento ORDER BY nombre ASC;