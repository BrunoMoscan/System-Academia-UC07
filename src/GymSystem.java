import java.util.*;
public class GymSystem{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de treino:");
        System.out.println("1. Crossfit");
        System.out.println("2. Musculação");
        int tipoTreino = scanner.nextInt();
        String tipo = tipoTreino == 1 ? "crossfit" : "musculação";

        System.out.println("Escolha a dificuldade (resistência ou velocidade):");
        String dificuldade = scanner.next();

        ExercicioFactory exercicioFactory;
        if (tipo.equals("crossfit")) {
            exercicioFactory = new CrossfitFactory(dificuldade);
        } else {
            exercicioFactory = new MusculacaoFactory(dificuldade);
        }

        Exercicio exercicio = exercicioFactory.criarExercicio(dificuldade);
        exercicio.executar();

        scanner.close();
    }
}













