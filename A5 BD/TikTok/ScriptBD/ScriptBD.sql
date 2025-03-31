CREATE DATABASE IF NOT EXISTS VideosDB;
USE VideosDB; --Posicionar-se dins la base de dades VideosDB
DROP TABLE videos;
CREATE TABLE videos (
    Id INT AUTO_INCREMENT PRIMARY KEY,  -- ID autoincremental i clau primària
    usuari VARCHAR(255) NOT NULL,       -- Nom d'usuari del creador del vídeo
    titol VARCHAR(255) NOT NULL,        -- Títol del vídeo
    likes INT UNSIGNED DEFAULT 0 CHECK (likes >= 0),       -- Nombre de "M'agrada", sempre positiu o 0
    durada DOUBLE NOT NULL CHECK (durada > 0)  -- Duració del vídeo en segons (ha de ser positiva)
);