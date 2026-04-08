DROP DATABASE IF EXISTS BancodeDados_SistemaBiblioteca;
CREATE DATABASE BancodeDados_SistemaBiblioteca;

USE BancodeDados_SistemaBiblioteca;

CREATE TABLE IF NOT EXISTS livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    ano INT,
    quantidade INT
);