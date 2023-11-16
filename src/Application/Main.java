package Application;

import Entities.Administracao;
import Entities.Aerospace;
import Entities.MotorPower;
import Entities.VeiculoInteligente;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Instanciando administracao

        Administracao adm = new Administracao();


        VeiculoInteligente aerospaceOne = new Aerospace(35.0, true);
        VeiculoInteligente aerospaceTwo = new Aerospace(40.0, false);

        VeiculoInteligente motorPowerOne = new MotorPower(60.0, true);
        VeiculoInteligente motorPowerTwo = new MotorPower(55.0, false);

        adm.adicionarVeiculo(aerospaceOne);
        adm.adicionarVeiculo(aerospaceTwo);
        adm.adicionarVeiculo(motorPowerOne);
        adm.adicionarVeiculo(motorPowerTwo);

        System.out.println("===========================");
        System.out.println("Antes do controle de velocidade: ");
        System.out.println("Aerospace One: " + aerospaceOne);
        System.out.println("Aerospace Two: " + aerospaceTwo);
        System.out.println("Motor Power One: " + motorPowerOne);
        System.out.println("Motor Power Two: " + motorPowerTwo);
        System.out.println("===========================");
        System.out.println("Dando partida em todos os veiculos...");
        aerospaceOne.partida();
        aerospaceTwo.partida();
        motorPowerOne.partida();
        motorPowerTwo.partida();
        System.out.println("===========================");
        System.out.println("Após controle de velocidade:");
        aerospaceOne.controlarVelocidade(true);
        aerospaceTwo.controlarVelocidade(false);
        motorPowerOne.controlarVelocidade(true);
        motorPowerTwo.controlarVelocidade(false);
        System.out.println("Aerospace One: " + aerospaceOne);
        System.out.println("Aerospace Two: " + aerospaceTwo);
        System.out.println("Motor Power One: " + motorPowerOne);
        System.out.println("Motor Power Two: " + motorPowerTwo);
        System.out.println("===========================");
        System.out.println("Abastecendo todos os veiculos");





    }
}