-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-07-2019 a las 18:44:53
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `controlescolar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_usuario` int(11) NOT NULL,
  `n_completo` varchar(50) NOT NULL,
  `f_nacimiento` varchar(15) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `nomusuario` varchar(20) NOT NULL,
  `contraseña` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_usuario`, `n_completo`, `f_nacimiento`, `sexo`, `correo`, `telefono`, `direccion`, `nomusuario`, `contraseña`) VALUES
(1, 'ningunos', '1985-08-22', 'Masculino', 'ninguno@s', '9513241121', 'calle 333', 'root', 'root');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `id_docente` int(11) NOT NULL,
  `n_completo` varchar(50) NOT NULL,
  `cod_presu` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `año_ingreSEP` varchar(15) NOT NULL,
  `año_ingreESC` varchar(15) NOT NULL,
  `año_ingreZN` varchar(15) NOT NULL,
  `f_nacimiento` varchar(15) NOT NULL,
  `RFC` varchar(13) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  `no_ident` varchar(10) NOT NULL,
  `contraseña` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`id_docente`, `n_completo`, `cod_presu`, `telefono`, `direccion`, `correo`, `CURP`, `año_ingreSEP`, `año_ingreESC`, `año_ingreZN`, `f_nacimiento`, `RFC`, `cargo`, `no_ident`, `contraseña`) VALUES
(2, 'Perez Perez Maria', 'ADS', '95127870', 'DIRECCION', 'prznmaria@gmail.com', 'PRSMA', '1994-12-02', '2000-02-11', '2000-02-03', '2019-07-16', 'RFC', 'MAESTRO', '123', '123'),
(15, 'Hernandez Perez Mario', 'CODIGO', '951', 'CALLE', 'CORREO', 'HPM293JJ', '2003-7-6', '2000-7-20', '2018-9-8', '1983-6-11', 'RFC', 'CARGO', '901', '901'),
(17, 'NOMBE', 'CODIGO', 'TELE', 'DIREC', 'CORREO', 'CURP', '2019-6-1', '2019-6-2', '2019-6-3', '2019-6-4', 'RFC', 'CARGO', 'IDEN', 'CONTRA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `id_estudiante` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  `n_completo` varchar(50) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `f_nacimiento` varchar(15) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `grp_sanguineo` varchar(5) NOT NULL,
  `id_grado` int(11) NOT NULL,
  `id_padre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id_estudiante`, `matricula`, `n_completo`, `CURP`, `f_nacimiento`, `sexo`, `grp_sanguineo`, `id_grado`, `id_padre`) VALUES
(1, '192301', 'Juarez Perez Jose', 'JUPJ130716HOCRRSA4', '2013-07-16', 'Femenino', 'AB +', 3, 4),
(2, '192301', 'Martinez Hernandez', 'MAHP061016HOCRRDA4', '2001-10-01', 'Masculino', 'O -', 2, 1),
(3, '192302', 'Juarez Perez Luis LUIS', 'JUPJ120381HOCRRSR2', '1999-02-05', 'Masculino', 'B +', 3, 1),
(17, '1234', 'pedro pereznnnn', 'd', '2019-06-01', 'Masculino', 'AB +', 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado`
--

CREATE TABLE `grado` (
  `id_grado` int(11) NOT NULL,
  `numero` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grado`
--

INSERT INTO `grado` (`id_grado`, `numero`) VALUES
(1, '1º'),
(2, '2º'),
(3, '3º');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo_identificador`
--

CREATE TABLE `grupo_identificador` (
  `id_grupo` int(11) NOT NULL,
  `letra` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grupo_identificador`
--

INSERT INTO `grupo_identificador` (`id_grupo`, `letra`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C'),
(10, 'D');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gupos_disponibles`
--

CREATE TABLE `gupos_disponibles` (
  `id_grpdisponibles` int(11) NOT NULL,
  `id_grado` int(11) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `gupos_disponibles`
--

INSERT INTO `gupos_disponibles` (`id_grpdisponibles`, `id_grado`, `id_grupo`, `id_docente`) VALUES
(1, 1, 1, 15),
(2, 2, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `id_grado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre`, `id_grado`) VALUES
(1, 'Español', 1),
(2, 'Matematicas', 1),
(3, 'Biologia', 1),
(4, 'Geografia', 1),
(5, 'Ingles', 1),
(6, 'Artes', 1),
(7, 'Formacion civica y etica', 1),
(8, 'Historia', 1),
(9, 'Educacion Fisica', 1),
(10, 'Autonomia curricular', 1),
(11, 'Tutoria y educacion socioemocional', 1),
(12, 'Español II', 2),
(13, 'Matematicas II', 2),
(14, 'Ciencias II', 2),
(15, 'Ingles II', 2),
(16, 'Artes II', 2),
(17, 'Educacion Fisica II', 2),
(18, 'Formacion civica y etica II', 2),
(19, 'Historia II', 2),
(20, 'Autonomia curricular II', 2),
(21, 'Tutoria y educacion socioemocional II', 2),
(22, 'Español III', 3),
(23, 'Matematicas III', 3),
(24, 'Ciencias III', 3),
(25, 'Ingles III', 3),
(26, 'Artes III', 3),
(27, 'Educacion fisica III', 3),
(28, 'Formacion civica y etica III', 3),
(29, 'Historia III', 3),
(30, 'Autonomia curricular III', 3),
(31, 'Tutoria y educacion socioemocional III', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `padre`
--

CREATE TABLE `padre` (
  `id_padre` int(11) NOT NULL,
  `np_completo` varchar(50) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `padre`
--

INSERT INTO `padre` (`id_padre`, `np_completo`, `correo`, `telefono`, `direccion`) VALUES
(1, 'Perez Perez Maria', 'prznmaria@gmail.com', '9510901122', 'calle diaz ordaz'),
(2, 'Martinez Diaz Jose', 'josemtz@gmail.com', '9512531147', 'calle zapata numero 23'),
(4, 'Jose juan', 'jose@gmail.com', '951222', 'calle'),
(6, 'maria v', 'maria@gmail.com', '951233', 'casacasa ');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`id_estudiante`),
  ADD KEY `grado_escolar` (`id_grado`),
  ADD KEY `padro_tutor` (`id_padre`);

--
-- Indices de la tabla `grado`
--
ALTER TABLE `grado`
  ADD PRIMARY KEY (`id_grado`);

--
-- Indices de la tabla `grupo_identificador`
--
ALTER TABLE `grupo_identificador`
  ADD PRIMARY KEY (`id_grupo`);

--
-- Indices de la tabla `gupos_disponibles`
--
ALTER TABLE `gupos_disponibles`
  ADD PRIMARY KEY (`id_grpdisponibles`),
  ADD KEY `asignargrados` (`id_grado`),
  ADD KEY `asignargrupos` (`id_grupo`),
  ADD KEY `asignardocente` (`id_docente`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`),
  ADD KEY `grado_esco` (`id_grado`);

--
-- Indices de la tabla `padre`
--
ALTER TABLE `padre`
  ADD PRIMARY KEY (`id_padre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `id_estudiante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `grado`
--
ALTER TABLE `grado`
  MODIFY `id_grado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `grupo_identificador`
--
ALTER TABLE `grupo_identificador`
  MODIFY `id_grupo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `gupos_disponibles`
--
ALTER TABLE `gupos_disponibles`
  MODIFY `id_grpdisponibles` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `padre`
--
ALTER TABLE `padre`
  MODIFY `id_padre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD CONSTRAINT `grado_escolar` FOREIGN KEY (`id_grado`) REFERENCES `grado` (`id_grado`),
  ADD CONSTRAINT `padro_tutor` FOREIGN KEY (`id_padre`) REFERENCES `padre` (`id_padre`);

--
-- Filtros para la tabla `gupos_disponibles`
--
ALTER TABLE `gupos_disponibles`
  ADD CONSTRAINT `asignardocente` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`),
  ADD CONSTRAINT `asignargrados` FOREIGN KEY (`id_grado`) REFERENCES `grado` (`id_grado`),
  ADD CONSTRAINT `asignargrupos` FOREIGN KEY (`id_grupo`) REFERENCES `grupo_identificador` (`id_grupo`);

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `grado_esco` FOREIGN KEY (`id_grado`) REFERENCES `grado` (`id_grado`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
