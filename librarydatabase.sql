-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `author_no` int(5) NOT NULL,
  `First_name` varchar(50) DEFAULT NULL,
  `middle_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `Pen_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`author_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Ruskin','BJ','Bond','Ruskin Bond'),(2,'Joanne','JO','Rowling','J.K Rowling'),(3,'sda','ahs','sdag',''),(4,'sda','qwex','Rowling','Foxy'),(5,'asf','dfhdsf','jdsfdsf','sdfsa'),(6,'poiu','mlk','jhgv','mnm'),(20,'ram','teri','ganga','maili'),(56,'voldemert','herry','allen','SPF'),(78,'ramanujan','henry','ganga','sdgas');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `bill_id` int(4) NOT NULL,
  `Accesion_no` int(5) DEFAULT NULL,
  `unit_cost` int(5) DEFAULT NULL,
  `discount` int(2) DEFAULT NULL,
  `Seller` varchar(20) DEFAULT NULL,
  `total_cost` int(6) DEFAULT NULL,
  `Date_of_purchase` date DEFAULT NULL,
  PRIMARY KEY (`bill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (824,872,1200,20,'J.p dept',1000,'2014-02-14'),(932,981,2400,0,'J.p dept',2400,'2015-04-25');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `Accession_no` int(4) NOT NULL,
  `Name_book` varchar(70) DEFAULT NULL,
  `Author_no` int(5) DEFAULT NULL,
  `Co_Author` varchar(60) DEFAULT NULL,
  `Publisher_no` int(5) DEFAULT NULL,
  `publish_year` int(4) DEFAULT NULL,
  `Pages` int(5) DEFAULT NULL,
  `Genre_no` int(5) DEFAULT NULL,
  `Subject` varchar(20) DEFAULT NULL,
  `bill_id` int(4) DEFAULT NULL,
  `Number_unit` int(4) DEFAULT NULL,
  `remark` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`Accession_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (342,'Harry Potter And Goblet of Fire',2,NULL,321,2006,500,2,'fiction',932,3,'In Bad Shape'),(872,'Harry Potter And Deathly Hallows',2,NULL,321,2014,748,2,'fiction',375,3,'good quality'),(981,'Sea at Last',1,NULL,234,2002,432,1,'romantic',824,4,'good quality');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_issued`
--

DROP TABLE IF EXISTS `book_issued`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_issued` (
  `Accesion_number` int(4) NOT NULL,
  `Admission_no` int(6) NOT NULL,
  `issued_date` date DEFAULT NULL,
  `time_period` int(2) DEFAULT NULL,
  PRIMARY KEY (`Accesion_number`,`Admission_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_issued`
--

LOCK TABLES `book_issued` WRITE;
/*!40000 ALTER TABLE `book_issued` DISABLE KEYS */;
INSERT INTO `book_issued` VALUES (342,432,'2017-11-01',14),(342,564,'2017-10-28',14),(872,9318,'2014-04-21',7),(981,1233,'2015-05-22',14);
/*!40000 ALTER TABLE `book_issued` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_return`
--

DROP TABLE IF EXISTS `book_return`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_return` (
  `Accesion_number` int(4) NOT NULL,
  `Name_book` varchar(70) DEFAULT NULL,
  `Admiission_no` int(6) DEFAULT NULL,
  `return_date_` date DEFAULT NULL,
  PRIMARY KEY (`Accesion_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_return`
--

LOCK TABLES `book_return` WRITE;
/*!40000 ALTER TABLE `book_return` DISABLE KEYS */;
/*!40000 ALTER TABLE `book_return` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `Employee_Id` int(10) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `type` varchar(18) DEFAULT NULL,
  `Address` varchar(70) DEFAULT NULL,
  `mobile_no` varchar(12) DEFAULT NULL,
  `alternate_mobileno` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Employee_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (121,'Pranshu','pranshupranjal321@gmail.com','M','admin','13/1049 vasundhara','9811867601','8800955446'),(122,'ARCHIT','architbansal35@gmail.com','M','admin','voldrof apartment room 529 vasundhara','9818825446','9824562875'),(124,'Rajiv Kumar','contactrajivkumar@gmail.com','M','Librarian','4C-321 Vartalok ,Vasundhara Ghaziabad, Uttar Pradesh','9810096431','9910396284'),(235,'sagg','','F','--Please Select--','','',''),(523,'sdg','arye','F','Administrator','tydid','8787','789789');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genere`
--

DROP TABLE IF EXISTS `genere`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genere` (
  `genere_no` int(2) NOT NULL DEFAULT '0',
  `Genere` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`genere_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genere`
--

LOCK TABLES `genere` WRITE;
/*!40000 ALTER TABLE `genere` DISABLE KEYS */;
INSERT INTO `genere` VALUES (1,'Action and Adventure'),(2,'Arts & Film'),(3,'Biographies'),(4,'Business'),(5,'Thriller Co');
/*!40000 ALTER TABLE `genere` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_info`
--

DROP TABLE IF EXISTS `login_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_info` (
  `User_ID` varchar(10) DEFAULT NULL,
  `Punch_IN` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_info`
--

LOCK TABLES `login_info` WRITE;
/*!40000 ALTER TABLE `login_info` DISABLE KEYS */;
INSERT INTO `login_info` VALUES ('Pranshu01','2017-10-25 12:31:04'),('Pranshu01','2017-10-31 22:22:48'),('Pranshu01','2017-10-31 22:32:56'),('Pranshu01','2017-10-31 22:33:08'),('Pranshu01','2017-10-31 22:41:43'),('Pranshu01','2017-10-31 22:46:39'),('Pranshu01','2017-11-02 19:14:04'),('Pranshu01','2017-11-02 19:18:03'),('Pranshu01','2017-11-02 19:19:10'),('Pranshu01','2017-11-02 19:26:49'),('Pranshu01','2017-11-03 10:51:33');
/*!40000 ALTER TABLE `login_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publisher` (
  `Publisher_no` int(5) NOT NULL,
  `Publisher_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Publisher_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (234,'Scholastic'),(245,'Dreamwork co'),(321,'Penguin');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security`
--

DROP TABLE IF EXISTS `security`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `security` (
  `Employee_Id` int(10) NOT NULL,
  `User_Id` varchar(10) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `security_question` int(2) DEFAULT NULL,
  `security_answer` varchar(34) DEFAULT NULL,
  PRIMARY KEY (`Employee_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security`
--

LOCK TABLES `security` WRITE;
/*!40000 ALTER TABLE `security` DISABLE KEYS */;
INSERT INTO `security` VALUES (121,'Pranshu01','DELHI',1,'Maggi'),(122,'Archit02','Mumbai',2,'Poonam'),(523,'aeyr','poiuy',1,'DPSGV');
/*!40000 ALTER TABLE `security` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sques`
--

DROP TABLE IF EXISTS `sques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sques` (
  `sq_id` int(2) NOT NULL,
  `question` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`sq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sques`
--

LOCK TABLES `sques` WRITE;
/*!40000 ALTER TABLE `sques` DISABLE KEYS */;
INSERT INTO `sques` VALUES (1,'Which School did you attend in 6th Grade ?'),(2,'What is your maternal grandmothers first name ?'),(3,'Which color do you like most ?'),(4,'What is the name of your second best childhood friend ?');
/*!40000 ALTER TABLE `sques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `admission_no` int(7) NOT NULL,
  `Name` varchar(48) DEFAULT NULL,
  `class` int(2) DEFAULT NULL,
  `section` char(1) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `fathers_name` varchar(34) DEFAULT NULL,
  `mothers_name` varchar(49) DEFAULT NULL,
  `Address` varchar(70) DEFAULT NULL,
  `mobile_no` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`admission_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (432,'Siddhant',8,'B','M','Aditya','Sunita','13/28 vasundhara','9876567843'),(564,'Shivam',11,'C','M','Nimish','Rachita','15/98 Rajnagar','8897459076');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-06 13:22:34
