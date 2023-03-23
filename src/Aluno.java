public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private int sexo;

    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada");
    }
    public  int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void  setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso='" + curso + '\'' + '}';
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getSexo() {
        return sexo;
    }
}
