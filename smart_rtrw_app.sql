-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 06, 2021 at 12:32 PM
-- Server version: 10.5.5-MariaDB
-- PHP Version: 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smart_rtrw_app`
--

DELIMITER $$
--
-- Functions
--
$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `dashboard`
--

CREATE TABLE `dashboard` (
  `no_dashboard` int(11) NOT NULL,
  `status` text DEFAULT NULL,
  `link_surat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dashboard`
--

INSERT INTO `dashboard` (`no_dashboard`, `status`, `link_surat`) VALUES
(3, 'Masih diproses', '-'),
(4, 'Masih diproses', '-'),
(5, 'Disetujui', 'https://drive.google.com/drive/folders/1ZF3Q2CR-mQfyal6Qbptir6EsHU-jv7QF'),
(6, 'Disetujui', 'https://roymubarak.wordpress.com/2020/04/10/kalkulus-relational/'),
(7, 'Disetujui', 'https://drive.google.com/drive/folders/1ZF3Q2CR-mQfyal6Qbptir6EsHU-jv7QF'),
(8, 'Disetujui', 'https://docs.google.com/presentation/d/1S-7EI2mZ4cwQ9XUs8hHkRH8joulrUTmr/edit#slide=id.p3'),
(9, 'Masih diproses', '-'),
(10, 'Masih diproses', '-'),
(11, 'Masih diproses', '-'),
(12, 'Masih diproses', '-'),
(13, 'Disetujui', 'https://elearning.uin-malang.ac.id/'),
(14, 'Masih diproses', '-'),
(15, 'Masih diproses', '-'),
(16, 'Masih diproses', '-'),
(17, 'Disetujui', 'https://drive.google.com/drive/folders/1ZF3Q2CR-mQfyal6Qbptir6EsHU-jv7QF'),
(18, 'Disetujui', 'https://drive.google.com/drive/folders/1ZF3Q2CR-mQfyal6Qbptir6EsHU-jv7QF'),
(19, 'Disetujui', 'https://drive.google.com/drive/folders/1ZF3Q2CR-mQfyal6Qbptir6EsHU-jv7QF'),
(20, 'Disetujui', 'https://drive.google.com/drive/my-drive'),
(21, 'Masih diproses', '-'),
(22, 'Masih diproses', '-'),
(23, 'Masih diproses', '-');

-- --------------------------------------------------------

--
-- Table structure for table `domisili`
--

CREATE TABLE `domisili` (
  `Kd_domisili` int(11) NOT NULL,
  `provinsi` text DEFAULT NULL,
  `kota` text DEFAULT NULL,
  `kecamatan` text DEFAULT NULL,
  `kelurahan` text DEFAULT NULL,
  `RT` int(11) DEFAULT NULL,
  `RW` int(11) DEFAULT NULL,
  `alamat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `domisili`
--

INSERT INTO `domisili` (`Kd_domisili`, `provinsi`, `kota`, `kecamatan`, `kelurahan`, `RT`, `RW`, `alamat`) VALUES
(2123, 'aq', 'sds', 'asd', 'asd', 5, 4, 'asd'),
(2821, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 2, 8, 'JL Sidodadi II/02'),
(2823, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 2, 8, 'JL Sidodadi II/02'),
(2824, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 2, 8, 'JL Sidodadi II/02'),
(3113, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 3, 1, 'JL Sidomulyo I'),
(3456, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 3, 4, 'JL Sidorejo V'),
(3781, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 3, 7, 'JL Sidomukti 8'),
(4343, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 4, 3, 'JL Sidomukti IV'),
(4621, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 4, 6, 'JL Sidomukti 2/II'),
(4673, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 4, 6, 'JL Sidorejo VII'),
(5221, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 5, 2, 'JL Sidomulyo II/02'),
(5671, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 5, 6, 'JL Sidodadi VII'),
(6657, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 6, 6, 'JL Sidodadi VI'),
(7815, 'Jawa Timur', 'Malang', 'Singosari', 'Pagentan', 7, 8, 'JL Sidorejo I'),
(7854, 'azz', 'az', 'az', 'za', 1, 8, 'vc'),
(7865, 'as', 'as', 'as', 'as', 8, 1, 'as'),
(9090, 'ee', 'dsds', 'sds', 'ds', 8, 8, 'sds');

-- --------------------------------------------------------

--
-- Table structure for table `jenis_surat`
--

CREATE TABLE `jenis_surat` (
  `no_jenis_surat` int(11) NOT NULL,
  `Nama_surat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_surat`
--

INSERT INTO `jenis_surat` (`no_jenis_surat`, `Nama_surat`) VALUES
(2, 'Surat Pengantar Usaha'),
(3, 'Surat Pengantar Usaha'),
(4, 'Surat Pengantar Usaha'),
(5, 'Surat Pengantar Usaha'),
(6, 'Surat Pengantar KK'),
(10, 'Surat Pengantar KTP'),
(11, 'Surat Pengantar Kelahiran'),
(12, 'Surat Pengantar Kematian'),
(13, 'Surat Pengantar KTP'),
(14, 'Surat Pengantar KTP'),
(15, 'Surat Pengantar Domisili'),
(16, 'Surat Pengantar Kelahiran'),
(17, 'Surat Pengantar Domisili'),
(18, 'Surat Pengantar Domisili'),
(19, 'Surat Pengantar Domisili'),
(20, 'Surat Pengantar Mutasi');

-- --------------------------------------------------------

--
-- Table structure for table `surat_pengantar`
--

CREATE TABLE `surat_pengantar` (
  `no_surat` int(11) NOT NULL,
  `Tanggal_surat` date DEFAULT NULL,
  `keperluan` text DEFAULT NULL,
  `NIK` varchar(20) NOT NULL,
  `no_jenis_surat` int(11) NOT NULL,
  `no_dashboard` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `surat_pengantar`
--

INSERT INTO `surat_pengantar` (`no_surat`, `Tanggal_surat`, `keperluan`, `NIK`, `no_jenis_surat`, `no_dashboard`) VALUES
(11, '2020-12-22', 'Membuat KTP Baru', '350724526780001', 10, 13),
(13, '2020-12-23', 'membuat surat kematian', '350724526780001', 12, 15),
(14, '2020-12-23', 'Membuat Kartu Tanda Penduduk Baru', '3507248457100007', 13, 16),
(17, '2020-12-23', 'mengurus akta kelahiran', '3507242908000017', 16, 19),
(18, '2020-12-09', 'Pengurusan surat domisili', '3507240007601', 17, 20),
(19, '2021-03-24', 'ngajuin surat', '3507242908000017', 19, 22),
(20, '2021-03-03', 'pangajuan mutasi', 'aza', 20, 23);

-- --------------------------------------------------------

--
-- Table structure for table `warga`
--

CREATE TABLE `warga` (
  `NIK` varchar(20) NOT NULL,
  `Nama` text DEFAULT NULL,
  `Kd_domisili` int(11) DEFAULT NULL,
  `No_KK` varchar(20) DEFAULT NULL,
  `Tempat_lahir` text DEFAULT NULL,
  `Tanggal_lahir` date DEFAULT NULL,
  `Jenis_Kelamin` text DEFAULT NULL,
  `Agama` text DEFAULT NULL,
  `Pekerjaan` text DEFAULT NULL,
  `Pendidikan` text DEFAULT NULL,
  `Status_kawin` text DEFAULT NULL,
  `Warga_negara` text DEFAULT NULL,
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(12) DEFAULT NULL,
  `option` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warga`
--

INSERT INTO `warga` (`NIK`, `Nama`, `Kd_domisili`, `No_KK`, `Tempat_lahir`, `Tanggal_lahir`, `Jenis_Kelamin`, `Agama`, `Pekerjaan`, `Pendidikan`, `Status_kawin`, `Warga_negara`, `username`, `password`, `option`) VALUES
('3507240007601', 'Aminullah', 6657, '3507240007601', 'Malang', '2000-12-08', 'Laki-Laki', 'Islam', 'Mahasiswa', 'SMA', 'Belum Kawin', 'Indonesia', 'amin', 'amin123', 'USER'),
('3507242908000001', 'Muhammad Zaim Maulana', 2824, '350724001', 'Malang', '2000-03-17', 'Laki-Laki', 'Islam', 'Mahasiswa', 'SMA', 'Belum Kawin', 'Indonesia', 'admin', 'admin123', 'Admin'),
('3507242908000017', 'Ahmad', 4343, '3507242908000011', 'Surabaya', '2000-12-14', 'Laki-Laki', 'Islam', 'Mahasiswa', 'SMA', 'Belum Kawin', 'Indonesia', 'ahmad', 'ahmad123', 'USER'),
('350724526780001', 'Saifullah', 4673, '350724526780001', 'Sidoarjo', '1990-12-06', 'Laki-Laki', 'Islam', 'Petani', 'SMA', 'Sudah Kawin', 'Indonesia', 'saiful', 'saiful123', 'USER'),
('3507248457100007', 'Sintabella', 7815, '3507248457100007', 'Bandung', '2002-12-19', 'Perempuan', 'Islam', 'Mahasiswa', 'SMA', 'Belum Kawin', 'Indonesia', 'sinta', 'sinta123', 'USER'),
('aa', 'aa', 2123, 'aa', 'aa', '2021-03-04', 'Laki-Laki', 'Islam', 'aa', 'aa', 'Belum Kawin', 'aa', 'aa', 'aa', 'USER'),
('asd', 'asds', 7865, 'sdad', 'asd', '2021-03-05', 'Laki-Laki', 'Islam', 'sda', 'das', 'Belum Kawin', 'sd', 'asd', 'asfdads', 'USER'),
('aza', 'az', 7854, 'az', 'az', '2021-03-04', 'Laki-Laki', 'Islam', 'az', 'az', 'Belum Kawin', 'az', 'az', 'az', 'USER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dashboard`
--
ALTER TABLE `dashboard`
  ADD PRIMARY KEY (`no_dashboard`);

--
-- Indexes for table `domisili`
--
ALTER TABLE `domisili`
  ADD PRIMARY KEY (`Kd_domisili`);

--
-- Indexes for table `jenis_surat`
--
ALTER TABLE `jenis_surat`
  ADD PRIMARY KEY (`no_jenis_surat`);

--
-- Indexes for table `surat_pengantar`
--
ALTER TABLE `surat_pengantar`
  ADD PRIMARY KEY (`no_surat`),
  ADD KEY `NIK` (`NIK`),
  ADD KEY `no_jenis_surat` (`no_jenis_surat`),
  ADD KEY `no_dashboard` (`no_dashboard`);

--
-- Indexes for table `warga`
--
ALTER TABLE `warga`
  ADD PRIMARY KEY (`NIK`),
  ADD UNIQUE KEY `password` (`password`),
  ADD KEY `Kd_domisili` (`Kd_domisili`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dashboard`
--
ALTER TABLE `dashboard`
  MODIFY `no_dashboard` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `jenis_surat`
--
ALTER TABLE `jenis_surat`
  MODIFY `no_jenis_surat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `surat_pengantar`
--
ALTER TABLE `surat_pengantar`
  MODIFY `no_surat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `surat_pengantar`
--
ALTER TABLE `surat_pengantar`
  ADD CONSTRAINT `surat_pengantar_ibfk_1` FOREIGN KEY (`NIK`) REFERENCES `warga` (`NIK`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `surat_pengantar_ibfk_2` FOREIGN KEY (`no_jenis_surat`) REFERENCES `jenis_surat` (`no_jenis_surat`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `surat_pengantar_ibfk_3` FOREIGN KEY (`no_dashboard`) REFERENCES `dashboard` (`no_dashboard`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `warga`
--
ALTER TABLE `warga`
  ADD CONSTRAINT `warga_ibfk_1` FOREIGN KEY (`Kd_domisili`) REFERENCES `domisili` (`Kd_domisili`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
