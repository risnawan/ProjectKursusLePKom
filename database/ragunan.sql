-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2017 at 05:27 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ragunan`
--

-- --------------------------------------------------------

--
-- Table structure for table `fauna`
--

CREATE TABLE `fauna` (
  `id_fauna` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `ringkasan` text NOT NULL,
  `makanan` varchar(25) NOT NULL,
  `habitat` varchar(25) NOT NULL,
  `lama_hidup` varchar(11) NOT NULL,
  `penyebaran` varchar(30) NOT NULL,
  `id_tipefauna` int(1) NOT NULL,
  `foto` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fauna`
--

INSERT INTO `fauna` (`id_fauna`, `nama`, `ringkasan`, `makanan`, `habitat`, `lama_hidup`, `penyebaran`, `id_tipefauna`, `foto`, `jumlah`) VALUES
(4, 'e', 's	', '2', '2', '2', '2', 2, 'null', 1),
(6, 'ss', '1', '1', '1', '1', '1', 1, 'null', 1),
(7, '123', 'qw', '123', '123', '123', '123', 0, 'null', 23),
(8, '4', '3', '3', '3', '3', '3', 0, 'null', 3),
(10, 'd', 'd', 'd', 'd', 'd', 'd', 0, 'null', 1),
(11, 'z', 'z', 'z', 'z', 'z', 'z', 0, 'IMG_1393.JPG', 2),
(12, '4', '4', '4', '4', '4', '4', 0, 'null', 4),
(13, '3', '3', '3', '3', '3', '3', 0, 'default.jpg', 3);

-- --------------------------------------------------------

--
-- Table structure for table `flora`
--

CREATE TABLE `flora` (
  `id_flora` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tinggi` varchar(10) NOT NULL,
  `ringkasan` text NOT NULL,
  `foto` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flora`
--

INSERT INTO `flora` (`id_flora`, `nama`, `tinggi`, `ringkasan`, `foto`) VALUES
(1, 'null', '123 cm', 'qwerasdadqweqweq\nasasd\nqweqwe', 'Black and white 1.jpg'),
(2, 'null', '123 cm', 'sqsqqs', 'IMG_20161108_104436.jpg'),
(3, 'bunga', '121', '', 'login.png'),
(4, '123', '12', '321231', 'Gunadarma.jpg'),
(5, 'antu', '92 cm', '', 'IMG-20140729-00377.jpg'),
(6, 'tasik', '123', 'coa	', 'IMG-20140729-00386.jpg'),
(7, 'ddasdqw', '123', 'dasd', '_MG_1409.JPG'),
(8, 'sd', 'asd', 'asd', 'IMG-20141207-WA0022.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id_jabatan` int(11) NOT NULL,
  `nama_jabatan` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id_jabatan`, `nama_jabatan`) VALUES
(0, 'Tenaga IT Administrasi'),
(1, 'Tenaga  Keamanan'),
(2, 'Tenaga IT Jaringan'),
(3, 'Tenaga Loket'),
(4, 'Tenaga Perawat Satwa'),
(5, 'Tenaga Pakan Satwa'),
(6, 'Tenaga Penterjemah Bahasa Inggris'),
(7, 'Tenaga Fisik Listrik dan Air'),
(8, 'Tenaga Teknik Sipil (arsitektur)'),
(9, 'Tenaga Kebersihan dan Pertanaman'),
(10, 'Tenaga Dokter Hewan'),
(11, 'Tenaga Laboratorium'),
(12, 'Tenaga Rontgen'),
(13, 'Tenaga Pengemudi'),
(14, 'Tenaga Akuntansi');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `id_jabatan` int(1) NOT NULL,
  `foto` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama`, `alamat`, `no_telp`, `id_jabatan`, `foto`) VALUES
(1, 'M Risnawan Budianto', 'Jl.Bina Marga RT 01/06 Cipayung Jakarta Timur', '083895622226', 1, '12.JPG'),
(2, 'Faisal Akbar', 'Bogor', '085612399992', 1, ''),
(3, 'Reky Rolen Kencana', 'Jatinangor', '080788922221', 7, 'IMG-20141207-WA0022.jpg'),
(5, 'Luky Ahmad H ', 'Jl. Cawang Jakarta Selatan', '08161922308', 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `id_tiket` int(11) NOT NULL,
  `tipe` char(1) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`id_tiket`, `tipe`, `harga`) VALUES
(0, '0', 4000),
(1, '1', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `tipe`
--

CREATE TABLE `tipe` (
  `id_tipefauna` int(11) NOT NULL,
  `nama_tipe` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipe`
--

INSERT INTO `tipe` (`id_tipefauna`, `nama_tipe`) VALUES
(0, 'Mamalia'),
(1, 'Reptil'),
(2, 'Aves'),
(3, 'Pisces'),
(4, 'Amphibia');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `no` int(11) NOT NULL,
  `id_transaksi` varchar(30) NOT NULL,
  `waktu_transaksi` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `anak` int(11) NOT NULL,
  `dewasa` int(11) NOT NULL,
  `b_anak` int(11) NOT NULL,
  `b_dewasa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no`, `id_transaksi`, `waktu_transaksi`, `anak`, `dewasa`, `b_anak`, `b_dewasa`) VALUES
(1, '2017/April/10/1', '2017-04-10 12:40:49', 3, 2, 3000, 4000),
(10, '2017/April/10/10', '2017-04-10 12:59:47', 2, 5, 3000, 4000),
(2, '2017/April/10/2', '2017-04-10 12:40:59', 3, 22, 3000, 4000),
(3, '2017/April/10/3', '2017-04-10 12:41:01', 3, 22, 3000, 4000),
(4, '2017/April/10/4', '2017-04-10 12:41:05', 3, 22, 3000, 4000),
(5, '2017/April/10/5', '2017-04-10 12:42:58', 3, 2, 3000, 4000),
(6, '2017/April/10/6', '2017-04-10 12:43:06', 2, 1, 3000, 4000),
(7, '2017/April/10/7', '2017-04-10 12:45:21', 3, 2, 3000, 4000),
(8, '2017/April/10/8', '2017-04-10 12:45:31', 1, 1, 3000, 4000),
(9, '2017/April/10/9', '2017-04-10 12:45:41', 2, 1, 3000, 4000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(12) NOT NULL,
  `password` varchar(10) NOT NULL,
  `tipe` int(11) NOT NULL,
  `id_pegawai` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `password`, `tipe`, `id_pegawai`) VALUES
('admin', 'admin', 1, 1),
('operator', 'operator', 2, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fauna`
--
ALTER TABLE `fauna`
  ADD PRIMARY KEY (`id_fauna`),
  ADD KEY `id_fauna` (`id_fauna`),
  ADD KEY `id_tipefauna` (`id_tipefauna`);

--
-- Indexes for table `flora`
--
ALTER TABLE `flora`
  ADD PRIMARY KEY (`id_flora`),
  ADD KEY `id_flora` (`id_flora`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`id_jabatan`),
  ADD KEY `id_jabatan` (`id_jabatan`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD KEY `id_pegawai` (`id_pegawai`),
  ADD KEY `id_pegawai_2` (`id_pegawai`),
  ADD KEY `id_pegawai_3` (`id_pegawai`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id_tiket`),
  ADD UNIQUE KEY `id_tiket` (`id_tiket`),
  ADD KEY `id_tiket_2` (`id_tiket`),
  ADD KEY `id_tiket_3` (`id_tiket`);

--
-- Indexes for table `tipe`
--
ALTER TABLE `tipe`
  ADD PRIMARY KEY (`id_tipefauna`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD UNIQUE KEY `id_transaksi` (`id_transaksi`),
  ADD KEY `id_transaksi_2` (`id_transaksi`),
  ADD KEY `id_transaksi_3` (`id_transaksi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tipe`
--
ALTER TABLE `tipe`
  MODIFY `id_tipefauna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `fauna`
--
ALTER TABLE `fauna`
  ADD CONSTRAINT `fauna_ibfk_1` FOREIGN KEY (`id_tipefauna`) REFERENCES `tipe` (`id_tipefauna`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
