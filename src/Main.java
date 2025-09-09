public class Main {
    public static void main(String[] args) {

        int pontuacao = 0;

        Questao q1 = new Questao();
        q1.pergunta = "1. Qual das seguintes opções declara corretamente uma variável para armazenar um número inteiro em Java?";
        q1.opcaoA = "A) integer x = 10;";
        q1.opcaoB = "B) int x = 10;";
        q1.opcaoC = "C) num x = 10;";
        q1.opcaoD = "D) x = 10;";
        q1.opcaoE = "E) String x = 10;";
        q1.correta = "B";
        q1.escrevaQuestao();
        if (q1.isCorreta(q1.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q2 = new Questao();
        q2.pergunta = "2. Qual é a principal função de um programa Java, que serve como ponto de entrada para a execução?";
        q2.opcaoA = "A) start()";
        q2.opcaoB = "B) execute()";
        q2.opcaoC = "C) run()";
        q2.opcaoD = "D) main(String[] args)";
        q2.opcaoE = "E) program()";
        q2.correta = "D";
        q2.escrevaQuestao();
        if (q2.isCorreta(q2.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q3 = new Questao();
        q3.pergunta = "3. Qual dos seguintes operadores é usado para verificar se dois valores são IGUAIS em Java?";
        q3.opcaoA = "A) =";
        q3.opcaoB = "B) ==";
        q3.opcaoC = "C) !=";
        q3.opcaoD = "D) equals()";
        q3.opcaoE = "E) <>";
        q3.correta = "B";
        q3.escrevaQuestao();
        if (q3.isCorreta(q3.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q4 = new Questao();
        q4.pergunta = "4. O que a palavra-chave 'new' faz em Java?";
        q4.opcaoA = "A) Declara uma nova variável.";
        q4.opcaoB = "B) Inicia um laço de repetição.";
        q4.opcaoC = "C) Aloca memória e cria uma instância (objeto) de uma classe.";
        q4.opcaoD = "D) Define um novo método.";
        q4.opcaoE = "E) Importa uma nova biblioteca.";
        q4.correta = "C";
        q4.escrevaQuestao();
        if (q4.isCorreta(q4.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q5 = new Questao();
        q5.pergunta = "5. Qual é o propósito da palavra-chave 'void' na declaração de um método em Java?";
        q5.opcaoA = "A) Indica que o método não pode ser sobrescrito.";
        q5.opcaoB = "B) Indica que o método não retorna nenhum valor.";
        q5.opcaoC = "C) Indica que o método só pode ser acessado de dentro da própria classe.";
        q5.opcaoD = "D) Indica que o método pode aceitar um número variável de argumentos.";
        q5.opcaoE = "E) Indica que o método está vazio e não contém código.";
        q5.correta = "B";
        q5.escrevaQuestao();
        if (q5.isCorreta(q5.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q6 = new Questao();
        q6.pergunta = "6. O que é a JVM (Java Virtual Machine)?";
        q6.opcaoA = "A) Um compilador que traduz código Java para código de máquina.";
        q6.opcaoB = "B) Um ambiente que permite que um programa Java seja executado em qualquer dispositivo ou sistema operacional.";
        q6.opcaoC = "C) Um conjunto de ferramentas para desenvolver, depurar e monitorar aplicações Java.";
        q6.opcaoD = "D) Uma biblioteca padrão com as principais classes usadas em Java, como String e System.";
        q6.opcaoE = "E) Um editor de código-fonte específico para a linguagem Java.";
        q6.correta = "B";
        q6.escrevaQuestao();
        if (q6.isCorreta(q6.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q7 = new Questao();
        q7.pergunta = "7. Como se declara um array de X strings em Java?";
        q7.opcaoA = "A) String[] arr = new String(X);";
        q7.opcaoB = "B) String arr[x];";
        q7.opcaoC = "C) Array<String> arr = new Array(X);";
        q7.opcaoD = "D) String[x] arr;";
        q7.opcaoE = "E) String[] arr = new String[X];";
        q7.correta = "E";
        q7.escrevaQuestao();
        if (q7.isCorreta(q7.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q8 = new Questao();
        q8.pergunta = "8. Qual modificador de acesso torna um método ou variável acessível apenas dentro da sua própria classe?";
        q8.opcaoA = "A) public";
        q8.opcaoB = "B) protected";
        q8.opcaoC = "C) private";
        q8.opcaoD = "D) default (package-private)";
        q8.opcaoE = "E) static";
        q8.correta = "C";
        q8.escrevaQuestao();
        if (q8.isCorreta(q8.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q9 = new Questao();
        q9.pergunta = "9. O que o seguinte código Java imprimirá no console? \n int a = 5; \n double b = 2.0; \n System.out.println(a / b);";
        q9.opcaoA = "A) 2";
        q9.opcaoB = "B) 2.0";
        q9.opcaoC = "C) 2.5";
        q9.opcaoD = "D) Erro de compilação";
        q9.opcaoE = "E) 3";
        q9.correta = "C";
        q9.escrevaQuestao();
        if (q9.isCorreta(q9.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q10 = new Questao();
        q10.pergunta = "10. Qual das seguintes afirmações sobre 'String' em Java é verdadeira?";
        q10.opcaoA = "A) Strings são tipos de dados primitivos.";
        q10.opcaoB = "B) O valor de um objeto String pode ser alterado após a sua criação.";
        q10.opcaoC = "C) Strings devem ser comparadas usando o operador '=='.";
        q10.opcaoD = "D) Strings são imutáveis.";
        q10.opcaoE = "E) A classe String precisa ser importada do pacote java.util.";
        q10.correta = "D";
        q10.escrevaQuestao();
        if (q10.isCorreta(q10.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q11 = new Questao();
        q11.pergunta = "11. Qual tipo de dado primitivo em Java é usado para armazenar valores lógicos de verdadeiro ou falso?";
        q11.opcaoA = "A) int";
        q11.opcaoB = "B) char";
        q11.opcaoC = "C) string";
        q11.opcaoD = "D) float";
        q11.opcaoE = "E) boolean";
        q11.correta = "E";
        q11.escrevaQuestao();
        if (q11.isCorreta(q11.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q12 = new Questao();
        q12.pergunta = "12. Qual é a saída do código abaixo?\n\nfor (int i = 0; i < 3; i++) {\n    System.out.print(i + \" \");\n}";
        q12.opcaoA = "A) 0 1 2 3";
        q12.opcaoB = "B) 1 2 3";
        q12.opcaoC = "C) 0 1 2";
        q12.opcaoD = "D) 1 2";
        q12.opcaoE = "E) Erro de compilação";
        q12.correta = "C";
        q12.escrevaQuestao();
        if (q12.isCorreta(q12.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q13 = new Questao();
        q13.pergunta = "13. O que é um construtor em uma classe Java?";
        q13.opcaoA = "A) Um método usado para destruir um objeto.";
        q13.opcaoB = "B) Um método especial para inicializar um objeto recém-criado.";
        q13.opcaoC = "C) Uma variável que armazena o endereço de memória de um objeto.";
        q13.opcaoD = "D) O primeiro método a ser executado em qualquer programa, chamado 'main'.";
        q13.opcaoE = "E) Um método que sempre retorna um valor do tipo 'boolean'.";
        q13.correta = "B";
        q13.escrevaQuestao();
        if (q13.isCorreta(q13.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q14 = new Questao();
        q14.pergunta = "14. O que a palavra-chave 'extends' indica?";
        q14.opcaoA = "A) Que uma classe implementa uma interface.";
        q14.opcaoB = "B) Que uma classe pertence a um pacote.";
        q14.opcaoC = "C) Que uma classe herda de outra classe.";
        q14.opcaoD = "D) Que um método sobrescreve outro método.";
        q14.opcaoE = "E) Que um laço deve ser estendido.";
        q14.correta = "C";
        q14.escrevaQuestao();
        if (q14.isCorreta(q14.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Questao q15 = new Questao();
        q15.pergunta = "15. O que a palavra-chave 'null' representa em Java?";
        q15.opcaoA = "A) Uma string vazia ( \"\" ).";
        q15.opcaoB = "B) O valor numérico zero.";
        q15.opcaoC = "C) Um erro que finaliza o programa.";
        q15.opcaoD = "D) Uma referência de objeto que não aponta para nenhum objeto na memória.";
        q15.opcaoE = "E) Uma variável que ainda não foi declarada.";
        q15.correta = "D";
        q15.escrevaQuestao();
        if (q15.isCorreta(q15.leiaResposta())) {
            pontuacao++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("-----------------------------------------");
        System.out.println("Fim do Quiz! Sua pontuação final foi: " + pontuacao + " de 15.");
        System.out.println("-----------------------------------------");
    }
}