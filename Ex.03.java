/*
Ex03: Pegar a resolução do meu monitor e mostrar na tela
Professor: Gustavo Guanabara
Plataforma: EstudoNauta
Aluno: Otávio Shoity Segawa Goya
 */

import java.awt.*;


public class CursoJavaBasico {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resol = tk.getScreenSize();
        System.out.println("A Resolução do Meu monitor");
        System.out.println("Largura é " + resol.width);
        System.out.println("Altura é " + resol.height);

    }
}
