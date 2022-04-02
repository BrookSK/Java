
public class Reaj {
    public void imprimirCont(Double aumento, Double reajuste, Double salario){
        aumento = salario*15/100;
        reajuste = salario+aumento;

        System.out.println("o valor do salario com reajuste é: "+reajuste);
    }
}
