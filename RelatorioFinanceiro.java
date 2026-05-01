public class RelatorioFinanceiro implements Relatorio {
    private double saldo = 15000.0;
    private double despesas = 5000.0;

    @Override
    public void accept(RelatorioVisitor visitor) {
        visitor.visit(this);
    }

    public double getSaldo() { return saldo; }
    public double getDespesas() { return despesas; }
}