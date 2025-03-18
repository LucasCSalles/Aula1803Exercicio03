package exercicio04;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public  Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagemAumentoGeral){
        salario = salario +(salario * porcentagemAumentoGeral);
    }
    public void aumentarSalario(String cargo, double percentAumentoCargo){
    if(this.cargo.equalsIgnoreCase(cargo)){
        salario = salario + (salario * (percentAumentoCargo/100));
    }
    }

    public void promocao(String novoCargo){

        cargo = novoCargo;
    }


}
