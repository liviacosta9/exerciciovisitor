public class RelatorioVendas implements Relatorio {
    private String periodo = "Janeiro/2026";
    private double totalVendas = 50000.0;

    @Override
    public void accept(RelatorioVisitor visitor) {
        visitor.visit(this);
    }

    public String getPeriodo() { return periodo; }
    public double getTotalVendas() { return totalVendas; }
}