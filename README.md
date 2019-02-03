## Seminário JasperReport/iReport
Repositório do seminário da Disciplina de Persistência de Objetos ministrada pelo professor Fausto Veras Maranhão Ayres

**Cenário**

Para a geração deste relatório, foi utilizada a mesma temática do [projeto](https://github.com/neilprado/MusicStore-Java) da disciplina, uma loja de músicas digitais, porém com o escopo reduzido a três classes conforme mostra a figura abaixo:

![Diagrama de Classes](https://github.com/neilprado/SeminarioJasperReport/blob/master/DiagramaClasses.jpg)

**Pré Requisitos**

*Eclipse*
*JasperSoft Studio*
*PostgreSQL*

**E agora o que eu faço?**
1. Clone este repositório.
```sh
git clone https://github.com/neilprado/SeminarioJasperReport
```
2. Entre na pasta do projeto.
```sh
cd SeminarioJasperReport
```

3. Abra o Eclipse.

4. Importe o projeto.

5. Caso não tenha o JasperSoft Studio, acesse o menu na guia **Help**, selecione **Eclipse Marketplace**, instale-o e após a instalação, reinicie o eclipse.

6. No PgAdmin, crie um banco de dados chamado **musica**.

7. No Eclipse, execute **Cadastrar.java** localizado no package aplicacao.

8. Caso não haja, crie um package chamado **relatorio**.

9. Neste package, crie um novo Jasper Report através de: *New* -> *Other* -> *Jasper Report*.

10. Na nova janela, escolha um modelo, no arquivo pdf foi escolhido o *cherry landscape*.

11. Dê um nome ao relatorio e clique **next** e depois **new**.

12. Escolha **Database JDBC Connection** e **next**.

13. Na seção **JDBC Driver**, busque por *PostgreSQL*, na seção **JDBC URL** substitua *database* por *musica*, em seguida informando o username e a senha do postgres.

14. Na janela que surgiu, faça a consulta sql desejada e clique em next.

15. Traga todas as colunas selecionadas à esquerda para a direita e clique em next.

16. Caso queira agrupar por alguma(s) coluna(s), escolha esta(s) coluna(s) e leve-as para a direita e clique em finish. 