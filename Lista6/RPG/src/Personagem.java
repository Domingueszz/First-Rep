import java.util.Random;
import java.util.Scanner;

class Personagem {
    private String nome;
    private int vida;
    private Random random = new Random();

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void ataque(Personagem adversario) {
        int ataque = 20 + random.nextInt(11); // Valor entre 20 e 30
        int defesaAdversario = 10 + random.nextInt(6);  // Valor entre 10 e 15
        int dano = ataque - defesaAdversario;
        if (dano < 0) {
            dano = 0;
        }
        adversario.vida -= dano;
        System.out.println(this.nome + " atacou " + adversario.nome + " com força " + ataque + " e causou " + dano + " de dano. Vida restante de " + adversario.nome + ": " + adversario.vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}



