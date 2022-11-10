package jdbc.test;

import jdbc.model.ExameSoc;
import jdbc.model.ExamesRealizadosSoc;
import jdbc.model.FuncionarioSoc;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ExameSoc exame = new ExameSoc(1L, "Urina");
        FuncionarioSoc func = new FuncionarioSoc(1L, "Allan");
        ExamesRealizadosSoc er = new ExamesRealizadosSoc();
        ExamesRealizadosSoc er2 = new ExamesRealizadosSoc();
        List<ExamesRealizadosSoc> erList = new ArrayList<>();
        er.setId(1L);
        er.setExameSoc(exame);
        er.setFuncionarioSoc(func);
        er.setDtExame(LocalDate.now());
        er2.setId(2L);
        er2.setExameSoc(exame);
        er2.setFuncionarioSoc(func);
        er2.setDtExame(LocalDate.now());
        erList.add(er);
        erList.add(er2);
        for (ExamesRealizadosSoc e:erList){
            System.out.println(e);
        }
        er.relatorio(er);
    }
}
