CREATE DATABASE  IF NOT EXISTS `hunger_index_worldwide` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hunger_index_worldwide`;
-- MySQL dump 10.13  Distrib 8.0.26, for macos11 (x86_64)
--
-- Host: localhost    Database: hunger_index_worldwide
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `entity1`
--

DROP TABLE IF EXISTS `entity1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entity1` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity1`
--

LOCK TABLES `entity1` WRITE;
/*!40000 ALTER TABLE `entity1` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_body_fat_percentage`
--

DROP TABLE IF EXISTS `world_body_fat_percentage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_body_fat_percentage` (
  `body_fate_percentage` float NOT NULL,
  `country` varchar(30) NOT NULL,
  `continent` varchar(30) NOT NULL,
  PRIMARY KEY (`body_fate_percentage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_body_fat_percentage`
--

LOCK TABLES `world_body_fat_percentage` WRITE;
/*!40000 ALTER TABLE `world_body_fat_percentage` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_body_fat_percentage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_death_rate`
--

DROP TABLE IF EXISTS `world_death_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_death_rate` (
  `death_rate` float NOT NULL,
  `country` varchar(30) NOT NULL,
  `continent` varchar(30) NOT NULL,
  PRIMARY KEY (`death_rate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_death_rate`
--

LOCK TABLES `world_death_rate` WRITE;
/*!40000 ALTER TABLE `world_death_rate` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_death_rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_happiness_index`
--

DROP TABLE IF EXISTS `world_happiness_index`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_happiness_index` (
  `happiness_index` float NOT NULL,
  `country` varchar(30) NOT NULL,
  `continent` varchar(30) NOT NULL,
  PRIMARY KEY (`happiness_index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_happiness_index`
--

LOCK TABLES `world_happiness_index` WRITE;
/*!40000 ALTER TABLE `world_happiness_index` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_happiness_index` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_hunger_statistics`
--

DROP TABLE IF EXISTS `world_hunger_statistics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_hunger_statistics` (
  `user_id` int NOT NULL,
  `avg_income` int NOT NULL,
  `vaccination_rate` float NOT NULL,
  `death_rate` float NOT NULL,
  `happiness_index` float NOT NULL,
  `unemplyment_rate` float NOT NULL,
  `body_fate_percentage` float NOT NULL,
  `date_added` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_hunger_statistics`
--

LOCK TABLES `world_hunger_statistics` WRITE;
/*!40000 ALTER TABLE `world_hunger_statistics` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_hunger_statistics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_income_index`
--

DROP TABLE IF EXISTS `world_income_index`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_income_index` (
  `avg_income` int NOT NULL,
  `country` varchar(30) NOT NULL,
  `continent` varchar(30) NOT NULL,
  PRIMARY KEY (`avg_income`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_income_index`
--

LOCK TABLES `world_income_index` WRITE;
/*!40000 ALTER TABLE `world_income_index` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_income_index` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_unemployment_rate`
--

DROP TABLE IF EXISTS `world_unemployment_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_unemployment_rate` (
  `unemployment_rate` float NOT NULL,
  `country` varchar(30) NOT NULL,
  `continent` varchar(30) NOT NULL,
  PRIMARY KEY (`unemployment_rate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_unemployment_rate`
--

LOCK TABLES `world_unemployment_rate` WRITE;
/*!40000 ALTER TABLE `world_unemployment_rate` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_unemployment_rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `world_vaccination_rate`
--

DROP TABLE IF EXISTS `world_vaccination_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `world_vaccination_rate` (
  `vaccination_rate` float NOT NULL,
  `country` varchar(30) NOT NULL,
  `continent` varchar(30) NOT NULL,
  PRIMARY KEY (`vaccination_rate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `world_vaccination_rate`
--

LOCK TABLES `world_vaccination_rate` WRITE;
/*!40000 ALTER TABLE `world_vaccination_rate` DISABLE KEYS */;
/*!40000 ALTER TABLE `world_vaccination_rate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-07 21:42:40
