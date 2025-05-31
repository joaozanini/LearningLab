<?php
require 'databaseConnection.php';
$db = connect($url, $username, $password);

$nome = $_POST['nome'];
$idade = $_POST['idade'];

$stmt = $db->prepare("INSERT INTO clientes (nome, idade) VALUES (?, ?)");
$stmt->execute([$nome, $idade]);

header('Location: index.php');
