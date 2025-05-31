<?php
require 'databaseConnection.php';
$db = connect($url, $username, $password);

$id = $_POST['id'];
$nome = $_POST['nome'];
$idade = $_POST['idade'];

$stmt = $db->prepare("UPDATE clientes SET nome = ?, idade = ? WHERE id = ?");
$stmt->execute([$nome, $idade, $id]);

header('Location: index.php');
