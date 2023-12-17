-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 17, 2023 at 01:03 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop_gudangpartpc`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_gudang`
--

CREATE TABLE `tb_gudang` (
  `ID` int NOT NULL,
  `Nama` varchar(70) NOT NULL,
  `Merek` varchar(70) NOT NULL,
  `Jenis` varchar(70) NOT NULL,
  `Harga` double NOT NULL,
  `Stok` int NOT NULL,
  `Pajak` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tb_gudang`
--

INSERT INTO `tb_gudang` (`ID`, `Nama`, `Merek`, `Jenis`, `Harga`, `Stok`, `Pajak`) VALUES
(1, 'RTX 2060', 'NVIDA', 'VGA', 900000, 3, 27000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembelian`
--

CREATE TABLE `tb_pembelian` (
  `ID` int NOT NULL,
  `Pembeli` varchar(80) NOT NULL,
  `Barang` varchar(80) NOT NULL,
  `Jumlah` int NOT NULL,
  `Alamat` varchar(200) NOT NULL,
  `Harga` double NOT NULL,
  `Pajak` double NOT NULL,
  `TotalHarga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tb_pembelian`
--

INSERT INTO `tb_pembelian` (`ID`, `Pembeli`, `Barang`, `Jumlah`, `Alamat`, `Harga`, `Pajak`, `TotalHarga`) VALUES
(1, 'asd', 'RTX 2060', 321, 'sad', 3, 28.89, 991.89),
(2, 'ihksan', 'RTX 2060', 3, 'asd', 900, 81, 2781);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_gudang`
--
ALTER TABLE `tb_gudang`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_gudang`
--
ALTER TABLE `tb_gudang`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tb_pembelian`
--
ALTER TABLE `tb_pembelian`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
