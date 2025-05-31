<?php
require 'databaseConnection.php';
$db = connect($url, $username, $password);

$id = $_GET['id'];
$stmt = $db->prepare("SELECT * FROM clientes WHERE id = ?");
$stmt->execute([$id]);
$cliente = $stmt->fetch(PDO::FETCH_ASSOC);
?>

<h2>Editar Cliente</h2>
<form action="update.php" method="post">
    <input type="hidden" name="id" value="<?= $cliente['id'] ?>">
    Nome: <input type="text" name="nome" value="<?= $cliente['nome'] ?>" required><br>
    Idade: <input type="number" name="idade" value="<?= $cliente['idade'] ?>" required><br>
    <button type="submit">Atualizar</button>
</form>
<a href="index.php">Voltar</a>
