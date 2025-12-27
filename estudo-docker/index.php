<html>
<head>
    <title>Exemplo PHP - Microsserviços</title>
</head>
<body>

<?php
// Configurações do Banco de Dados (Dica: Use variáveis de ambiente para o host)
$servername = "54.234.153.24";
$username = "root";
$password = "Senha123";
$database = "meubanco";

// Criar conexão
$link = new mysqli($servername, $username, $password, $database);

// Checar conexão
if (mysqli_connect_errno()) {
    error_log("Connect failed: " . mysqli_connect_error());
    exit("Erro técnico ao conectar ao banco de dados.");
}

$valor_rand1 = rand(1, 999);
$valor_rand2 = strtoupper(substr(bin2hex(random_bytes(4)), 1));
$host_name = gethostname(); 

$query = "INSERT INTO dados (AlunoID, Nome, Sobrenome, Endereco, Cidade, Host) 
          VALUES ('$valor_rand1' , '$valor_rand2', '$valor_rand2', '$valor_rand2', '$valor_rand2', '$host_name')";

if ($link->query($query) === TRUE) {
    echo "<h3>Novo registro criado com sucesso!</h3>";
    echo "<strong>Processado pelo Container/Host:</strong> " . $host_name;
} else {
    error_log("Error: " . $link->error);
    echo "Erro ao inserir registro.";
}

$link->close();
?>

</body>
</html>