-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 02, 2021 at 07:10 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pardoschicken`
--

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `buscarCliente`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarCliente` (IN `nombre_cliente` VARCHAR(255))  BEGIN
SELECT * FROM factura 
WHERE nombreCliente LIKE concat('%',nombre_cliente,'%');
END$$

DROP PROCEDURE IF EXISTS `detalleFactura`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `detalleFactura` (`idfac` INT)  BEGIN
SELECT nomProd, cantidad, precioProd, montoProd FROM detallefactura WHERE idFactura = idfac;
END$$

DROP PROCEDURE IF EXISTS `prodCate`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `prodCate` (`cat` VARCHAR(200))  BEGIN
SELECT*FROM prod_view WHERE Categoría = cat;
END$$

DROP PROCEDURE IF EXISTS `truncate`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `truncate` ()  BEGIN
TRUNCATE TABLE facturatemp;
END$$

DROP PROCEDURE IF EXISTS `ultimoId`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `ultimoId` ()  BEGIN
SELECT idFactura FROM factura ORDER BY idFactura DESC LIMIT 1;
END$$

DROP PROCEDURE IF EXISTS `validarUsuario`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `validarUsuario` (`correo` VARCHAR(45), `pass` VARCHAR(20))  BEGIN
SELECT * FROM administrador WHERE username = correo and contraseña = pass;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
CREATE TABLE IF NOT EXISTS `administrador` (
  `idAdministrador` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  PRIMARY KEY (`idAdministrador`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `administrador`
--

INSERT INTO `administrador` (`idAdministrador`, `nombre`, `telefono`, `mail`, `username`, `contraseña`) VALUES
(1, 'William Chávez Díaz', '987654321', 'will@gmail.com', 'will', 'admin'),
(3, 'Merly Vallejos Huarcaya', '983125764', 'mer@gmail.com', 'mer', 'admin'),
(10, 'Silvia Figueroa Luque', '987602312', 'silvia@gmail.com', 'sil', 'admin');

--
-- Triggers `administrador`
--
DROP TRIGGER IF EXISTS `TRIGGER_DELETE_ADMINISTRADOR`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_DELETE_ADMINISTRADOR` AFTER DELETE ON `administrador` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ELIMINO UN ADMINISTRADOR")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_INSERT_ADMINISTRADOR`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_INSERT_ADMINISTRADOR` AFTER INSERT ON `administrador` FOR EACH ROW INSERT INTO auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE INSERTO UN NUEVO ADMINISTRADOR")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_UPDATE_ADMINISTRADOR`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_UPDATE_ADMINISTRADOR` AFTER UPDATE ON `administrador` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ACTUALIZO UN ADMINISTRADOR")
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `auditoria`
--

DROP TABLE IF EXISTS `auditoria`;
CREATE TABLE IF NOT EXISTS `auditoria` (
  `idRegistro` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fecha` datetime NOT NULL,
  `accion` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idRegistro`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `auditoria`
--

INSERT INTO `auditoria` (`idRegistro`, `usuario`, `fecha`, `accion`) VALUES
(1, 'root@localhost', '2021-11-02 00:00:00', 'SE INSERTO UN NUEVO ADMINISTRADOR'),
(2, 'root@localhost', '2021-11-02 13:51:36', 'SE INSERTO UN NUEVO ADMINISTRADOR'),
(3, 'root@localhost', '2021-11-02 13:59:11', 'SE ACTUALIZO UN ADMINISTRADOR'),
(4, 'root@localhost', '2021-11-02 14:01:14', 'SE ELIMINO UN ADMINISTRADOR');

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int NOT NULL AUTO_INCREMENT,
  `nomCat` varchar(200) NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nomCat`) VALUES
(1, 'Promoción'),
(2, 'Menú'),
(3, 'Bebidas'),
(4, 'Extras'),
(5, 'Tragos');

--
-- Triggers `categoria`
--
DROP TRIGGER IF EXISTS `TRIGGER_DELETE_CATEGORIA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_DELETE_CATEGORIA` AFTER DELETE ON `categoria` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ELIMINO UNA CATEGORIA DE PRODUCTO")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_INSERT_CATEGORIA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_INSERT_CATEGORIA` AFTER INSERT ON `categoria` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE INSERTO UNA NUEVA CATEGORIA DE PRODUCTO")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_UPDATE_CATEGORIA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_UPDATE_CATEGORIA` AFTER UPDATE ON `categoria` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ACTUALIZO UNA CATEGORIA DE PRODUCTO")
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `detallefactura`
--

DROP TABLE IF EXISTS `detallefactura`;
CREATE TABLE IF NOT EXISTS `detallefactura` (
  `idDetalleFactura` int NOT NULL AUTO_INCREMENT,
  `idFactura` int NOT NULL,
  `nomProd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cantidad` int NOT NULL,
  `precioProd` decimal(10,2) NOT NULL,
  `montoProd` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idDetalleFactura`),
  KEY `idFactura` (`idFactura`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `detallefactura`
--

INSERT INTO `detallefactura` (`idDetalleFactura`, `idFactura`, `nomProd`, `cantidad`, `precioProd`, `montoProd`) VALUES
(1, 1, 'Pardos Brasa 1/4', 1, '26.90', '26.90'),
(2, 1, 'Pilsen', 1, '10.50', '10.50'),
(3, 1, 'Doble', 1, '24.90', '24.90'),
(4, 1, 'Vaso', 1, '5.90', '5.90'),
(5, 1, 'Tequeños', 2, '8.50', '17.00'),
(6, 2, 'Pardos Brasa Familiar', 1, '52.90', '52.90'),
(7, 2, 'Limonada Frozen', 2, '10.90', '21.80'),
(8, 2, 'Papas fritas familiar', 1, '12.50', '12.50'),
(9, 2, 'Tequeños', 1, '8.50', '8.50'),
(10, 6, 'Chicha Frozen', 1, '10.90', '10.90'),
(11, 6, 'Jarra', 1, '19.90', '19.90'),
(12, 6, 'Jarra', 1, '19.90', '19.90'),
(13, 7, 'Pardos Brasa Extra Familiar', 1, '70.00', '70.00'),
(14, 7, 'Papas fritas familiar', 1, '12.50', '12.50'),
(15, 7, 'Tequeños', 1, '8.50', '8.50'),
(16, 8, 'Pardos Brasa Extra Familiar', 1, '70.00', '70.00'),
(17, 8, 'Papas fritas familiar', 1, '12.50', '12.50'),
(18, 8, 'Inka Cola 1.5lt', 1, '12.90', '12.90'),
(19, 8, 'Coca Cola 1.5lt', 1, '12.90', '12.90'),
(20, 8, 'Ensalada familiar', 1, '12.50', '12.50');

--
-- Triggers `detallefactura`
--
DROP TRIGGER IF EXISTS `TRIGGER_DELETE_DETALLE_FACTURA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_DELETE_DETALLE_FACTURA` AFTER DELETE ON `detallefactura` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ELIMINO UN DETALLE DE FACTURA")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_INSERT_DETALLE_FACTURA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_INSERT_DETALLE_FACTURA` AFTER INSERT ON `detallefactura` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE INSERTO UN DETALLE FACTURA")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_UPDATE_DETALLE_FACTURA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_UPDATE_DETALLE_FACTURA` AFTER UPDATE ON `detallefactura` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ACTUALIZO UN DETALLE DE FACTURA")
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE IF NOT EXISTS `factura` (
  `idFactura` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `nombreCliente` varchar(255) NOT NULL,
  `dniRuc` varchar(11) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `administrador` varchar(80) NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  `igv` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `metodoPago` varchar(25) NOT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `factura`
--

INSERT INTO `factura` (`idFactura`, `fecha`, `nombreCliente`, `dniRuc`, `telefono`, `administrador`, `subtotal`, `igv`, `total`, `metodoPago`) VALUES
(1, '2021-10-27', 'Willito', '78896546', '954165131', 'Merly Vallejos Huarcaya', '85.20', '15.34', '100.54', 'Tarjeta'),
(2, '2021-10-27', 'Pepito', '70416351', '956135165', 'Merly Vallejos Huarcaya', '95.70', '17.23', '112.93', 'Efectivo'),
(5, '2021-11-02', 'mermexd', '70381226', '931375925', 'William Chávez Díaz', '44.80', '8.06', '52.86', 'Efectivo'),
(6, '2021-11-02', 'merme2', '41272156', '964136527', 'Merly Vallejos Huarcaya', '50.70', '9.13', '59.83', 'Tarjeta'),
(7, '2021-11-02', 'clienteprueba', '10321310312', '987531313', 'Merly Vallejos Huarcaya', '91.00', '16.38', '107.38', 'Tarjeta'),
(8, '2021-11-02', 'Jhony B', '75839032', '987654321', 'William Chávez Díaz', '120.80', '21.74', '142.54', 'Tarjeta');

--
-- Triggers `factura`
--
DROP TRIGGER IF EXISTS `TRIGGER_DELETE_FACTURA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_DELETE_FACTURA` AFTER DELETE ON `factura` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ELIMINO UNA FACTURA")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_INSERT_FACTURA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_INSERT_FACTURA` AFTER INSERT ON `factura` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE INSERTO UNA NUEVO FACTURA")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_UPDATE_FACTURA`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_UPDATE_FACTURA` AFTER UPDATE ON `factura` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ACTUALIZO UNA FACTURA")
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `facturatemp`
--

DROP TABLE IF EXISTS `facturatemp`;
CREATE TABLE IF NOT EXISTS `facturatemp` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `nombreCliente` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dniRuc` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telefono` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `administrador` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `metodoPago` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nombreProducto` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cantidad` int NOT NULL,
  `precioProducto` decimal(10,2) NOT NULL,
  `montoProducto` decimal(10,2) NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  `igv` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idPedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `idCategoria` int NOT NULL,
  `nomProd` varchar(255) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `FK_Categoria` (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`idProducto`, `idCategoria`, `nomProd`, `precio`) VALUES
(1, 1, 'Pardos Brasa 1/4', '26.90'),
(2, 1, 'Pardos Parrillero 1/4', '34.90'),
(3, 1, 'Pardos Brasa 1/2', '40.90'),
(4, 1, 'Pardos Parrillero 1/2', '44.90'),
(5, 1, 'Pardos Brasa Familiar', '52.90'),
(6, 1, 'Pardos Brasa Extra Familiar', '70.00'),
(7, 2, 'Pardo Brasa 1/4 Menú', '20.90'),
(8, 3, 'Vaso', '5.90'),
(9, 3, 'Chicha Frozen', '10.90'),
(10, 3, 'Jarra', '19.90'),
(11, 3, 'Vaso', '5.90'),
(12, 3, 'Limonada Frozen', '10.90'),
(13, 3, 'Jarra', '19.90'),
(14, 3, 'Inka Cola 500ml', '6.50'),
(15, 3, 'Inka Cola 1.5lt', '12.90'),
(16, 3, 'Coca Cola 500ml', '6.50'),
(17, 3, 'Coca Cola 1.5lt', '12.90'),
(18, 4, 'Papas fritas familiar', '12.50'),
(19, 4, 'Ensalada familiar', '12.50'),
(20, 4, 'Anticuchos', '25.90'),
(21, 4, 'Tequeños', '8.50'),
(22, 4, 'Mollejas', '12.90'),
(23, 4, 'Chicharrón de pollo', '24.90'),
(24, 4, 'Ensalada cocida', '18.90'),
(25, 4, 'Ensalada fresca', '18.90'),
(26, 5, 'Pilsen', '10.50'),
(27, 5, 'Cusqueña', '11.50'),
(28, 5, 'Tarbernero Gran Tinto', '43.50'),
(29, 5, 'Simple', '19.90'),
(30, 5, 'Doble', '24.90');

--
-- Triggers `producto`
--
DROP TRIGGER IF EXISTS `TRIGGER_DELETE_PRODUCTO`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_DELETE_PRODUCTO` AFTER DELETE ON `producto` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ELIMINO UN PRODUCTO")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_INSERT_PRODUCTO`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_INSERT_PRODUCTO` AFTER INSERT ON `producto` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE INSERTO UN NUEVO PRODUCTO")
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `TRIGGER_UPDATE_PRODUCTO`;
DELIMITER $$
CREATE TRIGGER `TRIGGER_UPDATE_PRODUCTO` AFTER UPDATE ON `producto` FOR EACH ROW INSERT into auditoria (usuario,fecha,accion)
VALUES (CURRENT_USER(),NOW(),"SE ACTUALIZO PRODUCTO")
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Stand-in structure for view `prod_view`
-- (See below for the actual view)
--
DROP VIEW IF EXISTS `prod_view`;
CREATE TABLE IF NOT EXISTS `prod_view` (
`idProducto` int
,`nomProd` varchar(255)
,`precio` decimal(10,2)
,`Categoría` varchar(200)
);

-- --------------------------------------------------------

--
-- Structure for view `prod_view`
--
DROP TABLE IF EXISTS `prod_view`;

DROP VIEW IF EXISTS `prod_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `prod_view`  AS  select `p`.`idProducto` AS `idProducto`,`p`.`nomProd` AS `nomProd`,`p`.`precio` AS `precio`,`c`.`nomCat` AS `Categoría` from (`producto` `p` join `categoria` `c` on((`p`.`idCategoria` = `c`.`idCategoria`))) ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD CONSTRAINT `detallefactura_ibfk_1` FOREIGN KEY (`idFactura`) REFERENCES `factura` (`idFactura`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FK_Categoria` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
