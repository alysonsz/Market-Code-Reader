# MarketCodeReader
## Sobre o projeto
Software de um caixa de mercado, tem a função de realizar a leitura do
código de barras de um produto e o mesmo, se existir, será adicionado na lista de
compras, cada produto possui uma categoria especial de irá delimitar como os
produtos devem ser embalados de acordo com os parâmetros específicos de cada
categoria, para finalizar a compra o usuário deve informar seus dados para esses
estarem presentes na nota da compra assim como os cuidados específicos que
cada produto tem ou deve ter por parte do empacotador do mercado.
## Ferramentas e depêndencias de build
- Linguagem Java
- As bibliotecas JavaFX
- A biblioteca SQLite
- A ferramenta de build Maven
- Biblioteca de testes JUnit

# Como executar o projeto(imagens, texto e vídeo)

## Extra, link do vídeo tutorial:
https://drive.google.com/drive/folders/1rTcuIUmP6Gx_guCwvRim3QN_rGMHhL9c?usp=share_link
# Pré-Requisitos
## 1º) Necessário ter o java jdk 17.0.1 ou superior instalado na máquina
### Caso esteja usando Windows, é necessário entrar no site da Oracle e baixar a versão:
```bash
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
```
### Se for Linux, basta usar o comando para instalar a versão 17:
```bash
sudo apt install openjdk-17-jdk-headless
```
## 2ª) Necessário ter o Maven instalado, é um gerenciador de pacotes java. Link para documentação:
```bash
https://maven.apache.org/install.html
```
## 3ª) Verificar se o Maven e Java estão instalados
### Verificar se o Java está instalado:
```bash
java --version
```
### Verificar se o Maven está instalado:
```bash
mvn --version
```
![image](https://user-images.githubusercontent.com/58920070/200893806-a93cf56e-10f7-4cef-ab30-9731fef4d139.png)
# Executar projeto via arquivo .jar
## 1º) Abrir a pasta principal/raiz no terminal
```bash
cd C:\Projeto_POO 
```
## 2º) Realizar o comando para executar o .jar
```bash
java -jar laucher.jar
```
![image](https://user-images.githubusercontent.com/58920070/201536374-0ea24e7a-874a-4aa0-accd-36f7c36fd5d4.png)

# Executar projeto via linha de comando
## 1ª) Abrir na pasta do projeto no terminal:
```bash
cd C:\Projeto_POO 
```
![image](https://user-images.githubusercontent.com/58920070/200817281-e229f0c7-81a8-4957-abbe-b16ee4f3a19b.png)
![image](https://user-images.githubusercontent.com/58920070/200817386-b8c29b78-6840-4ece-ae7c-57ac0d0745d3.png)
## 2ª) Rodando o projeto:
### Para executar o projeto, segue o comando. OBS: é necessário estar na pasta do projeto:
```bash
mvn clean javafx:run
```
![image](https://user-images.githubusercontent.com/58920070/200894533-4686ae88-3021-42c8-8696-4aa7dbb5c19b.png)
# Executar testes via linha de comando
## 1º) Para realizar os testes segue o comando
```bash
mvn test
```
![image](https://user-images.githubusercontent.com/58920070/201537033-acefbcf1-4fbb-438d-96da-e17b570959e2.png)
![image](https://user-images.githubusercontent.com/58920070/201536922-6bd1cf50-ca1a-457c-a736-bd9e0a40f2f4.png)
# Documentação das funcionalidades do projeto
## 1º) Nele é possível passar números de 1 até 20, que são códigos para produtos: 
- arroz -> 1
- feijao -> 2
- cuzcuz -> 3
- carne -> 4
- frango -> 5
- cebola(unidade) -> 6
- banana(duzia) -> 7
- leite condensado -> 8
- molho de tomate -> 9
- refrigerante(1L) -> 10
- cerveja(lata) -> 11
- achocolatado -> 12
- iogurte -> 13
- pizza pronta(familia) -> 14
- lasanha de microondas -> 15
- frango desfiado -> 16
- salgado -> 17
- cenoura -> 18
- macarrão -> 19
- abóbora -> 20

![image](https://user-images.githubusercontent.com/58920070/200896464-c6c71d1b-6a5b-4679-b213-40442b285c15.png)

## 2º) Ao clicar em imprimir nota, o cliente é enviado para outra tela, na qual ele passsa o nome da nota e seu CPF/CNPJ

![image](https://user-images.githubusercontent.com/58920070/200897368-ef36d343-2d5c-4db7-b077-74ab63562c66.png)

## 3º) E ao clicar em imprimir, uma nota é gerada como segue na imagem a seguir. Ao clicar em voltar, o cliente retorna a págiina inicial, onde ele pode fazer uma nova compra
![image](https://user-images.githubusercontent.com/58920070/200897623-ffc9dbd7-7b58-47c9-84a8-dbbc3d1a343e.png)

## Extra, link do vídeo tutorial:
https://drive.google.com/drive/folders/1rTcuIUmP6Gx_guCwvRim3QN_rGMHhL9c?usp=share_link
