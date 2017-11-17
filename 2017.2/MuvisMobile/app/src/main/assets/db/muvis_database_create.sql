CREATE TABLE directors (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, gender TEXT NOT NULL, age INTEGER, nationality TEXT);
CREATE TABLE genres (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, description TEXT, icon TEXT);
CREATE TABLE actors (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, gender TEXT NOT NULL, age INTEGER, nationality TEXT);
CREATE TABLE movies (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, description TEXT, year INTEGER, genre_id INTEGER NOT NULL, director_id INTEGER NOT NULL);
CREATE TABLE movies_actors (movie_id INTEGER NOT NULL, actor_id INTEGER NOT NULL);
INSERT INTO genres (name, description, icon) VALUES ('Ação','Um filme de ação ou acção é um gênero de filme que geralmente envolve uma história de protagonistas do bem contra antagonistas do mal, que resolvem suas disputas com o uso de força física. Os filmes de ação têm como histórias o crime, os westerns e a guerra entre outros. Geralmente são superproduções, com high concept (conceito alto), abusando de efeitos especiais. A maioria dos filmes de ficção científica e policiais também são filmes de ação.','action.png');
INSERT INTO genres (name, description, icon) VALUES ('Aventura','O filme de aventura é um gênero cinematográfico que reflete um mundo heróico de combates e aventuras. Foi inventado na Itália, como meio de exaltação de seu passado histórico e, posteriormente, foi usada pela Rússia, para exaltar a Revolução Russa.','adventure.png');
INSERT INTO genres (name, description, icon) VALUES ('Comédia','A comédia é o uso de humor nas artes cênicas. Também pode significar um espetáculo que recorre intensivamente ao humor. De forma geral, “comédia” é o que é engraçado, que faz rir.','comedy.png');
INSERT INTO genres (name, description, icon) VALUES ('Crimes','Uma história de crime é sobre um crime que está sendo cometido ou foi cometido. Também pode ser um relato da vida de um criminoso. Muitas vezes, ele cai nos gêneros de ação ou aventura.','crime.png');
INSERT INTO genres (name, description, icon) VALUES ('Documentário','Um filme documentário é um filme não fatorístico destinado a documentar algum aspecto da realidade, principalmente para fins de instrução, educação ou manutenção de um registro histórico.','documentary.png');
INSERT INTO genres (name, description, icon) VALUES ('Drama','Dentro do cinema, da televisão e do rádio (mas não do teatro), o drama é um gênero de ficção narrativa (ou semi-ficção) destinado a ser mais grave do que o tom humorístico, focando no desenvolvimento aprofundado de personagens realistas que devem lidar com lutas emocionais realistas. Um drama é comumente considerado o oposto de uma comédia, mas também pode ser considerado separado de outras obras de algum gênero amplo, como uma fantasia.','drama.png');
INSERT INTO genres (name, description, icon) VALUES ('Fantasy','Uma história de fantasia é sobre forças mágicas ou sobrenaturais, ao invés de tecnologia, embora muitas vezes seja feita para incluir elementos de outros gêneros, como elementos de ficção científica, por exemplo computadores ou DNA, se acontecer numa era moderna ou futura','fantasy.png');
INSERT INTO genres (name, description, icon) VALUES ('Histórico','Uma história sobre uma pessoa ou evento real. Muitas vezes, eles estão escritos em um formato de livro de texto, que pode ou não se concentrar apenas nisso.','historical.png');
INSERT INTO genres (name, description, icon) VALUES ('Realismo Mágico','O realismo mágico, também chamado de realismo mágico, é obra literária onde os eventos mágicos fazem parte da vida comum. O leitor é forçado a aceitar que acontecimentos anormais como levitação, telequinesia e conversas com os mortos tenham lugar no mundo real. O escritor não inventou um mundo novo ou descreve com grande detalhe novas criaturas, como é usual na Fantasia; Pelo contrário, o autor se abstém de explicar os fantásticos eventos para evitar que se sentissem extraordinários.','magical_realism.png');
INSERT INTO genres (name, description, icon) VALUES ('Musical','Filme musical é um estilo de filme, no qual a narrativa se apoia sobre uma sequência de músicas coreografadas, utilizando música, canções e coreografia como narrativa predominante ou exclusivamente.','musical.png');
INSERT INTO genres (name, description, icon) VALUES ('Romance','O termo "romance" tem múltiplos significados; romances históricos como os de Walter Scott usariam o termo para significar "uma narrativa fictícia em prosa ou verso, cujo interesse gira em torno de incidentes maravilhosos e incomuns". Mas na maioria das vezes, um romance é entendido como "histórias de amor", histórias motivadas por emoções que se concentram principalmente na relação entre os personagens principais da história. Além do foco no relacionamento, a maior característica definidora do gênero romance é que um final feliz é sempre garantido','romance.png');
INSERT INTO genres (name, description, icon) VALUES ('Sátira','Muitas vezes, estritamente definido como um gênero ou forma literária, embora, na prática, também seja encontrado nas artes gráficas e artísticas. Na sátira, os vícios humanos ou individuais, loucuras, abusos ou deficiências são censurados por meio do ridículo, burro, burlesque, ironia ou outros métodos, idealmente com a intenção de melhorar. Embora a sátira costuma ser engraçada, o propósito da sátira não é principalmente o humor em si mesmo, como um ataque a algo do qual o autor desaprova fortemente, usando a arma da inteligência.','satire.png');
INSERT INTO genres (name, description, icon) VALUES ('Ficção Científica','A ficção científica é semelhante à fantasia, exceto as histórias desse gênero, usam a compreensão científica para explicar o universo em que ela ocorre. Ela geralmente inclui ou está centrada nos efeitos presumidos ou ramificações de computadores ou máquinas; viajar através do espaço, do tempo ou universos alternativos; formas de vida alienígenas; Engenharia genética; ou outras coisas assim. A ciência ou tecnologia utilizada pode ou não ser muito elaborada; histórias cujos elementos científicos são razoavelmente detalhados, bem pesquisados ​​e considerados relativamente plausíveis, dado o conhecimento e a tecnologia atuais são muitas vezes referidos como ficção científica dura.','scifi.png');
INSERT INTO genres (name, description, icon) VALUES ('Esporte','Um filme esportivo é um gênero de cinema que usa o esporte como tema de um filme. O filme esportivo é uma produção em que um esporte, evento esportivo, atleta (e seu esporte), ou seguidor do esporte (e o esporte que eles seguem) são proeminentes, e que dependem do esporte em grande medida para a motivação da sua trama ou resolução. Apesar disso, o esporte é, em última análise, raramente a preocupação central de tais filmes e esportes desempenha principalmente um papel alegórico.','sport.png');
INSERT INTO genres (name, description, icon) VALUES ('Terror/Horror','Uma história de horror é dita para assustar ou assustar deliberadamente o público, através de suspense, violência ou choque. H. P. Lovecraft distingue duas variedades primárias na "Introdução" ao Terror sobrenatural na literatura: 1) Fear físico ou "mundanely horrível" e 2) a verdadeira história de terror sobrenatural ou o "Conto estranho". A variedade sobrenatural é ocasionalmente chamada de "fantasia escura", uma vez que as leis da natureza devem ser violadas de alguma maneira, qualificando a história como "fantástica".','terror.png');
INSERT INTO genres (name, description, icon) VALUES ('Thriller','Thriller é uma história que geralmente é uma mistura de medo e emoção. Tem traços do gênero de suspense e muitas vezes dos gêneros de ação, aventura ou mistério, mas o nível de terror torna a ficção de horror limítrofe às vezes também. Geralmente tem um tema sombrio ou grave, que também o faz semelhante ao drama.','thriller.png');
INSERT INTO genres (name, description, icon) VALUES ('Faroeste','As histórias no gênero ocidental estão estabelecidas no oeste americano, entre o tempo da guerra civil e o início do século XX. A configuração de uma região selvagem ou não civilizada é especialmente importante para o gênero, e a configuração é muitas vezes descrita ricamente e em profundidade. Eles se concentram na aventura do (s) personagem (s) principal (es) e no contraste entre a civilização ou a sociedade e o deserto selvagem, muitas vezes com os personagens que trabalham para trazer a civilização para a região selvagem.','western.png');