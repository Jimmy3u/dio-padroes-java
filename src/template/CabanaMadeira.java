package template;

/*
 * Objeto de uma cabana de madeira, extendendo o template de construção
 */
public class CabanaMadeira extends ConstrucaoTemplate {
    @Override
    public void CriaFundacao() {
        System.out.println("Posicionando vigas de madeira.");
    }

    @Override
    public void LevantaParedes() {
        System.out.println("Levantando paredes de madeira.");
    }
}
