public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        java.util.Scanner scanner = new java.util.Scanner(System.in);

       System.out.print("Por favor, digite o número da conta: ");
        var numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        var agencia = scanner.nextLine();

        System.out.print("Por favor, informe seu nome completo: ");
        var nomeCliente = scanner.nextLine();

        double saldo = 237.48;

        //final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero +" e seu saldo R$" + saldo+ " já está disponível para saque.");


        scanner.close();
    }
}
