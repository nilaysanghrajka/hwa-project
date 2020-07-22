CREATE DATABASE IF NOT EXISTS HOS;

CREATE TABLE HOS.Customer (
  `Cus_ID` INT,
  `Cus_FirstName` VARCHAR (40),
  `Cus_LastName` VARCHAR (40),
  PRIMARY KEY (`Cus_ID`)
);

CREATE TABLE HOS.Party (
  `Party_ID` INT,
  `Party_Type` INT,
  `Duration_Mins` INT,
  PRIMARY KEY (`Party_ID`)
);

CREATE TABLE HOS.Employee (
  `Emp_ID` INT,
  `Emp_FirstName` VARCHAR (40),
  `Emp_LastName` VARCHAR (40),
  `Emp_Age` INT,
  PRIMARY KEY (`Emp_ID`)
);

CREATE TABLE HOS.Booking(
  `Book_ID` INT,
  `Cus_ID` INT,
  `Emp_ID` INT,
  `Party_ID` INT,
  `Date` DATE,
  PRIMARY KEY (`Book_ID`),
  KEY `FK` (`Cus_ID`, `Emp_ID`, `Party_ID`)
);
