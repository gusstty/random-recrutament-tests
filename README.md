# random-recrutament-tests
This is a test I've received when I was participating in some recruitment tests


Backend Test
Crie uma aplicação web que permita cadastrar e listar empresas.
Requisitos
1. Permitir cadastrar uma empresa com os campos (CNPJ, Nome, e-mail), um endereço
composto pelos campos (Logradouro,número,complemento,CEP, bairro e cidade) e uma
moeda de trabalho (USD – Dolár, EUR – Euro, ARS - Peso Argentino, GBP – Libra
Esterlina, BTC – Bitcoin).
2. Permitir exibir a listagem das empresas cadastradas.
3. Permitir exibir o detalhe de uma empresa cadastrada com a cotação atual ( max 20 minutos)
da moeda que a empresa trabalha.
Requisistos não funcionais
1. O usuário só entrará com o CNPJ durante o cadastro,os demais campos devem ser
preenchidos de maneira automática, quando possível, utilizando a API
(https://receitaws.com.br/). Será necessário um cadastro rápido para obter uma key.
2. O valor da cotação deve seguir os valores da API (http://docs.awesomeapi.com.br/api-demoedas).
3. A aplicação deve ser tolerante a falha de terceiros.
4. A aplicação poderá ser usada na integração com outras aplicações ou serviços.
5. A aplicação deverá “ecomizar” chamadas a API de terceiros a fim de evitar custos
desnecessários com banda de rede e custos de requisições com API’s.
Extras
1. Testes unitários.
2. Testes de integração.
3. Padronização e reúso de código
4. Filtros, Paginação, Validações.
Observações
1. Use a versão do do Java que preferir.
2. A utilização de frameworks está permitida.
3. A persistencia pode ser feita em H2, arquivo ou qualquer banco.
4. Descreva os detalhes da arquitetura, escolha de padrões e frameworks.
