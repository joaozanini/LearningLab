<?php
require 'databaseConnection.php';
$db = connect($url, $username, $password);

$id = $_GET['id'];

$stmt = $db->prepare("DELETE FROM clientes WHERE id = ?");
$stmt->execute([$id]);

header('Location: index.php');
