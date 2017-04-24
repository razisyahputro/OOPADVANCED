-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 23 Apr 2016 pada 15.48
-- Versi Server: 10.0.17-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `soal_1 kelompok`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `user_id` int(15) NOT NULL,
  `name` varchar(30) NOT NULL,
  `birth_date` date NOT NULL,
  `gender` enum('Male','Female','','') NOT NULL,
  `religion` enum('Moslem','Protestan','Katholic','Buddha','Hindu','konghucu') NOT NULL,
  `address` varchar(40) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`user_id`, `name`, `birth_date`, `gender`, `religion`, `address`, `password`) VALUES
(2, 'Aldi Azmy', '1996-07-06', 'Male', 'Moslem', 'Jl. Mawar No 9', '123456789');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `serial` bigint(12) NOT NULL,
  `body_num` varchar(17) NOT NULL,
  `engine_num` varchar(13) NOT NULL,
  `type` varchar(17) DEFAULT NULL,
  `merk` varchar(20) DEFAULT NULL,
  `cylinder_vol` mediumint(4) NOT NULL,
  `color` varchar(20) NOT NULL,
  `fuel` varchar(20) NOT NULL,
  `steering` enum('Power Steering','Standard Steering','','') NOT NULL,
  `capacity` enum('5','6','7','8','9','10') NOT NULL,
  `p_date` date NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`serial`, `body_num`, `engine_num`, `type`, `merk`, `cylinder_vol`, `color`, `fuel`, `steering`, `capacity`, `p_date`, `price`) VALUES
(111111111111, 'F5ASSS698A2Q63S5A', 'SQ7W8A4SA7SWS', 'SZK-SS5S-4S6A', 'Suzuki Swift', 3250, 'Silver', 'Pertamax', 'Power Steering', '8', '2016-04-04', 135250000),
(222222222222, 'SA582A3S6A9A3S5SD', '4A5S8W6A3S5A2', 'TYT-APH8-45A6', 'Toyota Alphard', 3745, 'Gold', 'Premium', 'Power Steering', '10', '2016-02-08', 985750000),
(333333333333, 'WQ5A6SA3S6A3Q6A3S', 'SWJ45A6S3A20S', 'HND-CR78-A4S5', 'Honda CR-V', 3250, 'White', 'Pertamax', 'Power Steering', '9', '2014-05-24', 274560000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `motor`
--

CREATE TABLE `motor` (
  `serial` bigint(12) NOT NULL,
  `body_num` varchar(17) NOT NULL,
  `engine_num` varchar(13) NOT NULL,
  `type` varchar(17) DEFAULT NULL,
  `merk` varchar(20) DEFAULT NULL,
  `cylinder_vol` mediumint(3) NOT NULL,
  `color` varchar(20) NOT NULL,
  `fuel` varchar(20) NOT NULL,
  `engine_type` enum('2-Stroke','4-Stroke','','') NOT NULL,
  `clutch` enum('Manual','Automatic','','') NOT NULL,
  `p_date` date NOT NULL,
  `price` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `motor`
--

INSERT INTO `motor` (`serial`, `body_num`, `engine_num`, `type`, `merk`, `cylinder_vol`, `color`, `fuel`, `engine_type`, `clutch`, `p_date`, `price`) VALUES
(120120120120, 'MSD85A5225A223DSF', 'WE87AS5225A23', 'YMH-M875-87', 'Yamaha Mio', 125, 'Green', 'Fuel', '2-Stroke', 'Manual', '2014-12-25', 17458200),
(123456789012, 'HZ89ASX245AW6S85A', 'SD8756AQSX23A', 'DCT-878MS-656A', 'Ducati Monster', 175, 'White', 'Fuel', '4-Stroke', 'Manual', '2016-02-15', 75000000),
(187569314251, '85ASS21235AAWS5DX', '12AQS36A53S0A', 'YMH-N485-TYK', 'Yamaha N Max', 125, 'Black', 'Fuel', '2-Stroke', 'Automatic', '2016-04-03', 27500000),
(248632469453, '4AW53A6S2DDS5AS6A', 'HD56A3S2WFVC2', 'HND-SCD45-9842', 'Honda Scoopy', 125, 'Yellow', 'Fuel', '2-Stroke', 'Automatic', '2016-04-22', 15780000),
(457869312501, 'HMA896JKH12335SDT', 'HAJ54ENKK55W8', 'HND-Z8566-52SS', 'Honda Blade', 150, 'White', 'Fuel', '2-Stroke', 'Automatic', '2014-02-16', 17500000),
(847896352452, '111HMA5S6S6A3X6AW', 'KKKE56A3C2F5G', 'KWS-5S6A-D14A', 'Kawasaki Ninja', 175, 'Blue', 'Fuel', '4-Stroke', 'Manual', '2016-04-22', 27562000),
(878514236598, 'HGHH87985214SAS85', '8S511DSWWS89S', 'SZK-4445A-DDFS', 'Suzuki Spin', 100, 'Grey', 'Fuel', '2-Stroke', 'Manual', '2016-03-06', 16525000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `user_id` (`user_id`),
  ADD KEY `gender` (`gender`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`serial`),
  ADD UNIQUE KEY `serial` (`serial`);

--
-- Indexes for table `motor`
--
ALTER TABLE `motor`
  ADD PRIMARY KEY (`serial`),
  ADD UNIQUE KEY `serial` (`serial`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `user_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `mobil`
--
ALTER TABLE `mobil`
  MODIFY `serial` bigint(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2147483647;
--
-- AUTO_INCREMENT for table `motor`
--
ALTER TABLE `motor`
  MODIFY `serial` bigint(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2147483647;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
