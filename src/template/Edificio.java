package template;

/**
 * Objeto de um predio, pode receber uma int em seu construtor para definir
 * quantidade de andares (Padrão = 1)
 */
public class Edificio extends ConstrucaoTemplate {
    int andares = 1;

    public Edificio() {
    }

    public Edificio(int a) {
        this.andares = a;
    }

    @Override
    public void CriaFundacao() {
        System.out.println("Construindo fundação");
    }

    @Override
    public void LevantaParedes() {
        for (int i = 1; i <= andares; i++) {
            System.out.println("Levantando paredes do " + i + " andar.");
        }
    }

    @Override
    public void CriaAlicerce() {
        if (andares > 1)
            System.out.println("Criando alicerce fundo.");
        else
            super.CriaAlicerce();
    }

    @Override
    public void AdicionaExtras() {
        super.AdicionaExtras();
        System.out.println("Realizando instalação eletrica.");
    }
}
