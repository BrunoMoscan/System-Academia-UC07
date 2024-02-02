public class CrossfitFactory extends ExercicioFactory {
    public CrossfitFactory(String dificuldade) {
    }

    public Exercicio getExercicioResistencia() {
        return new CrossfitResistencia();
    }

    public Exercicio getExercicioVelocidade() {
        return new CrossfitVelocidade();
    }
}
