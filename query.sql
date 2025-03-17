--[RF001] Login de ADM
SELECT * FROM usuario_adm
WHERE email_adm = 'exemplo@gmail.com' AND senha_adm = MD5('123');

--[RF002] Login de usuario
SELECT * FROM usuario 
WHERE email_user = 'exemplo@gmail.com' AND senha_user = MD5('123');

--[RF003] Pesquisar Produtos
SELECT * FROM produtos
WHERE nome LIKE '%nome_pesquisado%';

--[RF004] Pesquisar Categoria
SELECT * FROM categorias
WHERE categ_name LIKE '%nome_pesquisado%';


--[RF005] Pagamentos

SELECT * FROM pagamentos 
JOIN carrinho c ON p.id_carrinho = c.id
ORDER BY p.data_pagamento DESC;


