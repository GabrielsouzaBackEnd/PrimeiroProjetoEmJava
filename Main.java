public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean inculuidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + anoDeLancamento;

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}