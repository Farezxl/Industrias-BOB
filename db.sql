-- Criacao do banco de dados (fares)
CREATE DB BOBINDUSTRIA
SELECT DB BOBINDUSTRIA

-- tabela de usuario (pedro)

-- tabela de produto (kenny)
CREATE TABLE IF EXISTS produtos(
    id_produto INT AUTO_INCREMENT PRIMARY KEY, 
    deacricao TEXT,
    preco varchar(255)
    nome varchar (100) NOT NULL,
    quantidade_estq INT NOT NULL DEFAULT 0,

);
--tabela de categoria (fares)
create table categorias (
    id_cate int PRIMARY KEY AUTO_INCREMENT,
    categ_name varchar(255)
);
-- tabela de carrinho(fares)
CREATE TABLE carrinho(
    id_carrinho PRIMARY KEY AUTO_INCREMENT,
    id_usuario
    id_produto int NOT NULL,
    FOREIGN KEY (id_produto) REFERENCES produtos(id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
);
-- tabela de pagemnto(fares)
    CREATE TABLE pagamentos (
        id_pagar INT PRIMARY KEY AUTO_INCREMENT,
        id_carrinho INT NOT NULL,
        metodo ENUM('cartao','boleto','pix') NOT NULL,
        data_pagamento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (id_carrinho) REFERENCES carrinho(id)
    );

-- tabela de login ADM(levi)
CREATE TABLE usuario_adm (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_adm VARCHAR(100) NOT NULL,
    email_adm VARCHAR(100) UNIQUE NOT NULL,
    senha_adm VARCHAR(255) NOT NULL,  
    perfil_adm ENUM('admin', 'usuario') DEFAULT 'admin',
    
);

-- tabela de inventario (arthur)
CREATE TABLE Inventario(
    id_inventario INT PRIMARY KEY AUTO_INCREMENT, 
    nome_produto VARCHAR(255) NOT NULL, 
    descricao TEXT
    quantidade INT NOT NULL,
    preco_unitario VARCHAR(255) NOT NULL,
    data_entrada DATE,
);

