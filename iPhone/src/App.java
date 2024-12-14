public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("iPhone 2007");
        iPhone2007 iPhone = new iPhone2007();

        System.out.println("Apple Music");
        iPhone.selecionar("Bring me to life");
        iPhone.pausar();
        iPhone.tocar();

        System.out.println("\n");
        System.out.println("Safary");
        iPhone.pagina("https://github.com/Endrigogustavo/POO-Dio");
        iPhone.atualizar();
        iPhone.aba();

        System.out.println("\n");
        System.out.println("Telefone");
        iPhone.ligar("(11) 91111-1111");
        iPhone.atender();
        iPhone.correio();
    }
}
