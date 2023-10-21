package template;

/**
 * Classe Abstrata usada como template
 * O metodo realizaConstrucao implementa o padrão criando
 * a ordem de execução dos passos abstratos.
 */

public abstract class ConstrucaoTemplate {
    /* Metodo final que 'cria' o objeto */
    public final void realizaConstrucao() {

        CriaAlicerce();
        CriaFundacao();
        LevantaParedes();
        AdicionaExtras();
        System.out.println("Construção Finalizada");
    }

    /* Metodos Abstratos que serão implementados pelas classes filhas */
    public abstract void CriaFundacao();

    public abstract void LevantaParedes();

    /*
     * Metodos padrões que podem ser alterados pelas implementações de acordo com o
     * necessario
     */

    public void CriaAlicerce() {
        System.out.println("Construindo fundação rasa");
    }

    public void AdicionaExtras() {
        System.out.println("Adicionando janelas.");
    }
}
