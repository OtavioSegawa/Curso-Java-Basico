/*
Ex02: Fazer aparecer o Idioma do Sistema Operacional
Professor: Gustavo Guanabara
Plataforma: EstudoNauta
Aluno: Otávio Shoity Segawa Goya
 */
import java.util.Locale;
public class CursoJavaBasico {
    public static void main(String[] args) {
       Locale idioma = Locale.getDefault();
        System.out.print("O Idioma do meu Sistema é ");
        System.out.print(idioma.getLanguage());
        System.out.print("-");
        System.out.print(idioma.getDisplayCountry());
    }
}
