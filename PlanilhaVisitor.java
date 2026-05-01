public class PlanilhaVisitor implements RelatorioVisitor {
    
    @Override
    public void visit(RelatorioVendas v) {
        System.out.println("Gerando CSV de Vendas: " + v.getPeriodo() + ";" + v.getTotalVendas());
    }

    @Override
    public void visit(RelatorioFinanceiro f) {
        System.out.println("Gerando CSV Financeiro: " + f.getSaldo() + ";" + f.getDespesas());
    }
}