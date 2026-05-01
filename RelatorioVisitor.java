public interface RelatorioVisitor {
    void visit(RelatorioVendas vendas);
    void visit(RelatorioFinanceiro financeiro);
}