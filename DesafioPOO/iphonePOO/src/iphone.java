import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class iphone implements aparelhoTelefonico, reprodutorMusical,navegadorDeInternet {
        public String modelo;
        public int capacidadeArmazenamento;
        public int estadoBateria;
        public boolean reproduzindo;
        public List<String> playlist;
        private final boolean emChamada;
        private final boolean chamadaPerdida;
        public String paginaAtual;
        public iphone(String modelo, int capacidadeArmazenamento){
            this.modelo = modelo;
            this.capacidadeArmazenamento = capacidadeArmazenamento;
            this.estadoBateria = 100;
            this.reproduzindo = false;
            this.emChamada = true;
            this.chamadaPerdida = false;
            this.playlist = new ArrayList<>();
        }

        public void ligar(String numero) {
          if(!emChamada){
              System.out.println("Ligar para: " + numero);
          }else{
              System.out.println("ligacao em andamento com: " + numero);
          }
        }

        public void atender(String numero) {
            if(!emChamada) {
                System.out.println("Atender " + numero);
            }
        }

        public void iniciarCorreioVoz(String numero) {
            if(chamadaPerdida) {
                System.out.println("Voce tem uma chamada nao atendida, deseja reproduzir o recado? (1-sim|2-nao)");
                Scanner scanner = new Scanner(System.in);
                int atenderChamada = scanner.nextInt();
                if(atenderChamada == 1){
                    System.out.println("Reproduzindo mensagem de ligacao não atendida...");
                }
            }
        }

        public void exibirPagina(String url) {
            System.out.println("Exibindo: " + url);
        }

        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando: " + url);
        }

        public void atualizarPagina(String url) {
            System.out.println("Atualizando: " + url);
        }

        public void fecharPagina(String url) {
            System.out.println("Fechando: " + url);
        }

        public void tocar() {
            if(reproduzindo) {
                System.out.println("Tocando musica");
            }
        }
        public void selecionarMusica() {
            if(!reproduzindo) {
                System.out.println("Deseja reproduzir as suas playlists? (1-sim|2-nao)");
                Scanner scanner = new Scanner(System.in);
                int selecionarMusica = scanner.nextInt();
                if (selecionarMusica == 1) {
                    playlist.add("Pagode");
                    playlist.add("Hip-Hop");
                    playlist.add("Funk");
                    if (!reproduzindo) {
                        System.out.println("Selecionando musica: " + playlist.getLast());
                        System.out.println("Musica selecionada, iniciando reprodução...");
                        reproduzindo = true;
                        tocar();
                    }
                } else {
                    System.out.println("Fechando reprodutor musical.");
                }
            }
        }

        public void pausar() {
            if (reproduzindo) {
                System.out.println("Deseja pausar a musica? (1-sim|2-nao)");
                Scanner scanner = new Scanner(System.in);
                int pausar = scanner.nextInt();
                if(pausar == 1) {
                    System.out.println("Pausando musica");
                }else{
                    tocar();
                }
            }
        }
    }
