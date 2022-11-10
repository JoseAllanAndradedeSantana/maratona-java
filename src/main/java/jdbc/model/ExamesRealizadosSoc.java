package jdbc.model;

import java.time.LocalDate;

public class ExamesRealizadosSoc {
    private Long id;
    private LocalDate dtExame;
    private ExameSoc exameSoc;
    private FuncionarioSoc funcionarioSoc;

    public void relatorio(ExamesRealizadosSoc er){
        System.out.println("==== Funcionario ====");
        System.out.println("Cod: "+er.getFuncionarioSoc().getId());
        System.out.println("Nome: " + er.getFuncionarioSoc().getNome());
        System.out.println("==== Exame ====");
        System.out.println("Cod: "+er.getExameSoc().getId());
        System.out.println("Nome: "+er.getExameSoc().getNome());
        System.out.println("Data: "+er.getDtExame());
    }

    public ExamesRealizadosSoc() {
    }

    public ExamesRealizadosSoc(Long id, LocalDate dtExame, ExameSoc exameSoc, FuncionarioSoc funcionarioSoc) {
        this.id = id;
        this.dtExame = dtExame;
        this.exameSoc = exameSoc;
        this.funcionarioSoc = funcionarioSoc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDtExame() {
        return dtExame;
    }

    public void setDtExame(LocalDate dtExame) {
        this.dtExame = dtExame;
    }

    public ExameSoc getExameSoc() {
        return exameSoc;
    }

    public void setExameSoc(ExameSoc exameSoc) {
        this.exameSoc = exameSoc;
    }

    public FuncionarioSoc getFuncionarioSoc() {
        return funcionarioSoc;
    }

    public void setFuncionarioSoc(FuncionarioSoc funcionarioSoc) {
        this.funcionarioSoc = funcionarioSoc;
    }

    @Override
    public String toString() {
        return "ExamesRealizadosSoc{" +
                "id=" + id +
                ", dtExame=" + dtExame +
                ", exameSoc=" + exameSoc +
                ", funcionarioSoc=" + funcionarioSoc +
                '}';
    }
}
