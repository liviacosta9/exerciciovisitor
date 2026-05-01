public class PDFVisitor implements RelatorioVisitor {
    @Override
    public void visit(RelatorioVendas v) {
        System.out.println("--- Exportando PDF: Vendas ---");
        System.out.println("Período: " + v.getPeriodo() + " | Total: R$ " + v.getTotalVendas());
    }

    @Override
    public void visit(RelatorioFinanceiro f) {
        System.out.println("--- Exportando PDF: Financeiro ---");
        System.out.println("Saldo: R$ " + f.getSaldo() + " | Gastos: R$ " + f.getDespesas());
    }
}