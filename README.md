## Semin�rio JasperReport/iReport
Reposit�rio do semin�rio da Disciplina de Persist�ncia de Objetos ministrada pelo professor Fausto Veras Maranh�o Ayres

**Cen�rio**

Para a gera��o deste relat�rio, foi utilizada a mesma tem�tica do [projeto](https://github.com/neilprado/MusicStore-Java) da disciplina, uma loja de m�sicas digitais, por�m com o escopo reduzido a tr�s classes conforme mostra a figura abaixo:

![Diagrama de Classes](https://github.com/neilprado/SeminarioJasperReport/blob/master/DiagramaClasses.jpg)

**Pr� Requisitos**

*Eclipse*
*JasperSoft Studio*
*PostgreSQL*

**E agora o que eu fa�o?**
1. Clone este reposit�rio.
```sh
git clone https://github.com/neilprado/SeminarioJasperReport
```
2. Entre na pasta do projeto.
```sh
cd SeminarioJasperReport
```

3. Abra o Eclipse.

4. Importe o projeto.

5. Caso n�o tenha o JasperSoft Studio, acesse o menu na guia **Help**, selecione **Eclipse Marketplace**, instale-o e ap�s a instala��o, reinicie o eclipse.

6. No PgAdmin, crie um banco de dados chamado **musica**.

7. No Eclipse, execute **Cadastrar.java** localizado no package aplicacao.

8. Caso n�o haja, crie um package chamado **relatorio**.

9. Neste package, crie um novo Jasper Report atrav�s de: *New* -> *Other* -> *Jasper Report*.

10. Na nova janela, escolha um modelo, no arquivo pdf foi escolhido o *cherry landscape*.

11. D� um nome ao relatorio e clique **next** e depois **new**.

12. Escolha **Database JDBC Connection** e **next**.

13. Na se��o **JDBC Driver**, busque por *PostgreSQL*, na se��o **JDBC URL** substitua *database* por *musica*, em seguida informando o username e a senha do postgres.

14. Na janela que surgiu, fa�a a consulta sql desejada e clique em next.

15. Traga todas as colunas selecionadas � esquerda para a direita e clique em next.

16. Caso queira agrupar por alguma(s) coluna(s), escolha esta(s) coluna(s) e leve-as para a direita e clique em finish. 