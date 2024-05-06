public class ContaBancaria {
    protected int number;
    protected String agency;
    protected String name;
    protected float balance;

    public ContaBancaria(int number, String agency, String name, float balance) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }
}