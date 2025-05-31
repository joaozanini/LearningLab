<?php
$config = parse_ini_file('ApplicationProprierties.ini');
$url = $config['url'];
$username = $config['user'];
$password = $config['password'];

function connect($url, $username, $password) {
    try {
        return new PDO($url, $username, $password);
    } catch (PDOException $e) {
        die("Erro na conexão: " . $e->getMessage());
    }
}