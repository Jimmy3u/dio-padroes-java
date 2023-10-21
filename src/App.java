import template.CabanaMadeira;
import template.ConstrucaoTemplate;
import template.Edificio;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Contruindo edificio com 5 andares:");
        ConstrucaoTemplate predio = new Edificio(5);
        predio.realizaConstrucao();

        System.out.println("---------------------");

        System.out.println("Contruindo edificio :");
        ConstrucaoTemplate predio2 = new Edificio();
        predio2.realizaConstrucao();

        System.out.println("---------------------");

        System.out.println("Contruindo cabana de madeira :");
        ConstrucaoTemplate cabana = new CabanaMadeira();
        cabana.realizaConstrucao();

    }
}
