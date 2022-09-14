USE master;
GO
DROP database IF EXISTS dbPrimeFaces;

-- Creacion de Base de Datos:
CREATE DATABASE dbPrimeFaces
GO

-- Uso de Base de datos:
USE dbPrimeFaces
GO


-- tables
-- Table: Persona
DROP TABLE IF EXISTS persona;
CREATE TABLE persona (
    IDPER int IDENTITY (1,1) NOT NULL,
    NOMPER varchar(50) NOT NULL,
	APEPER varchar(50)  NOT NULL,
    CELPER char(9)  NOT NULL,
    CONSTRAINT persona_pk PRIMARY KEY  (IDPER)
)
GO