/*
comentario multilínea
*/

-- comentario de 1 línea

-- ================================================
-- Tabla: programa
-- Un programa académico ("Ingeniería", "Derecho")
-- ================================================

/*
CREATE TABLE programa(
	id_programa SERIAL PRIMARY KEY, --SERIAL= número automático (1,2,3.....)
	nombre VARCHAR(100) NOT NULL UNIQUE -- obligatorio y único
);
*/

-- Insertar datos en tabla programa

-- INSERT INTO
-- 	PROGRAMA (NOMBRE)
-- VALUES
-- 	('Ingeniería de Sistemas');
	

--SELECT * FROM programa

-- ==========================================================
-- Tabla: estudiente
-- Relación uno a muchos
-- ==========================================================

-- CREATE TABLE estudiante (
-- 	id_estudiante SERIAL PRIMARY KEY,
-- 	nombre VARCHAR(100) NOT NULL,
-- 	numero_documento VARCHAR(50),
-- 	email VARCHAR(120) NOT NULL UNIQUE,
-- 	id_programa_fk INT NOT NULL,

-- 	CONSTRAINT fk_estudiante_programa --regla o restricción
-- 		FOREIGN KEY (id_programa_fk) 
-- 		REFERENCES programa(id_programa) 
-- 		ON DELETE RESTRICT  -- evita borrar un programa si tiene estudiantes		
-- );

-- INSERT INTO estudiante (nombre,email,numero_documento,id_programa_fk) VALUES
-- ('Fred', 'fred@gmail.com',79784, 2);

-- SELECT * FROM estudiante;
-- SELECT * FROM programa;