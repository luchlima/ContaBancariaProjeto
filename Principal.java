public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "Lucas";
        contaBancaria.setNumeroConta(366);
        contaBancaria.setSaldo(1500);

        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Número da Conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        contaBancaria.setSaldo(3000);
        System.out.println("Novo saldo: " + contaBancaria.getSaldo());
    }
}
