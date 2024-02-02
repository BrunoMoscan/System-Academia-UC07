public class MusculacaoFactory extends ExercicioFactory {
    public MusculacaoFactory(String dificuldade) {
    }

    public Exercicio getExercicioResistencia() {
        return new MusculacaoResistencia();
    }

    public Exercicio getExercicioVelocidade() {
        return new MusculacaoVelocidade();
    }
}
