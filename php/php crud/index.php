<?php
require 'databaseConnection.php';
$db = connect($url, $username, $password);
$clientes = $db->query("SELECT * FROM clientes")->fetchAll(PDO::FETCH_ASSOC);
?>

<h2>Clientes</h2>
<a href="create.php">+ Novo Cliente</a>
<ul>
    <?php foreach ($clientes as $cliente): ?>
        <li>
            <?= $cliente['nome'] ?> (<?= $cliente['idade'] ?> anos)
            <a href="edit.php?id=<?= $cliente['id'] ?>">Editar</a>
            <a href="delete.php?id=<?= $cliente['id'] ?>" onclick="return confirm('Tem certeza?')">Excluir</a>
        </li>
    <?php endforeach; ?>
</ul>
