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
DROP TABLE observadores;
CREATE TABLE observadores (
    nick VARCHAR(255) NOT NULL PRIMARY KEY,       -- nick usuari 
    nombre VARCHAR(255) NOT NULL   
);
DROP TABLE COMENTARIOS;
CREATE TABLE COMENTARIOS (
	video_id INT NOT NULL,
    observador_nick VARCHAR(255) NOT NULL ,       -- nick usuari 
    comentario VARCHAR(255) NOT NULL ,
    PRIMARY KEY (observador_nick, video_id),  -- Clau primària
    FOREIGN KEY (observador_nick) REFERENCES observadores(nick) ON DELETE CASCADE,
    FOREIGN KEY (video_id) REFERENCES videos(id) ON DELETE CASCADE
);