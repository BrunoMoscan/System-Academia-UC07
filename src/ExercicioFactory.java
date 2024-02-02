public abstract class ExercicioFactory {
    public abstract Exercicio getExercicioResistencia();
    public abstract Exercicio getExercicioVelocidade();
    public Exercicio criarExercicio(String tipoExercicio) throws Exception {
        if (tipoExercicio.equals("resistencia")) {
            return getExercicioResistencia();
        } else if (tipoExercicio.equals("velocidade")) {
            return getExercicioVelocidade();
        } else {
            throw new Exception("Tipo de exercício desconhecido: " + tipoExercicio);
        }
    }
}
