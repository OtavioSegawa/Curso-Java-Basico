/*
Ex01: Fazer aparecer a data Atual
Professor: Gustavo Guanabara
Plataforma: EstudoNauta
Aluno: Otávio Shoity Segawa Goya
 */
import java.util.Date;
public class CursoJavaBasico {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("-------------------------------");
        System.out.println("A Data de Hoje é");
        System.out.println(data.toString());
        System.out.println("-------------------------------");
    }
}