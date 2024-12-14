public class iPhone2007 implements ReproduzirMusica, AparelhoTelefonico, NavegarInternet {

    //Musica
    @Override
    public void tocar() {
       System.out.println("Tocando musica...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
        
    }
    @Override
    public void selecionar(String musica) {
        System.out.println("Trocando musica para " + musica);
    }

    //Telefone
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + ", Aguarde...");
        
    }
    @Override
    public void atender() {
        System.out.println("Ligação em andamento...");
        
    }
    @Override
    public void correio() {
        System.out.println("Mensagem nova no correio de voz...");  
    }

    //Web
    @Override
    public void aba() {
        System.out.println("Abrindo uma nova aba..."); 
        
    }
    @Override
    public void atualizar() {
        System.out.println("Atualizando pagina..."); 
        
    }
    @Override
    public void pagina(String url) {
        System.out.println("Entrando no site " + url); 
        
    }
}
