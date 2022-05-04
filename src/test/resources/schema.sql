CREATE DATABASE  IF NOT EXISTS `schoolsystem`
USE `schoolsystem`;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `idcourse` int NOT NULL AUTO_INCREMENT,
  `name` varchar(500) DEFAULT NULL,
  `comments` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`idcourse`)
)


--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `idstudent` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idstudent`)
)

--
-- Table structure for table `student_course`
--

DROP TABLE IF EXISTS `student_course`;

CREATE TABLE `student_course` (
  `idstudent_course` int NOT NULL AUTO_INCREMENT,
  `student_idstudent` int NOT NULL,
  `course_idcourse` int NOT NULL,
  PRIMARY KEY (`idstudent_course`,`student_idstudent`,`course_idcourse`),
  KEY `fk_student_course_student_idx` (`student_idstudent`),
  KEY `fk_student_course_course1_idx` (`course_idcourse`),
  CONSTRAINT `fk_student_course_course1` FOREIGN KEY (`course_idcourse`) REFERENCES `course` (`idcourse`),
  CONSTRAINT `fk_student_course_student` FOREIGN KEY (`student_idstudent`) REFERENCES `student` (`idstudent`)
)

