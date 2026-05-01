public class XMLVisitor implements RelatorioVisitor {
    @Override
    public void visit(RelatorioVendas v) {
        System.out.println("<relatorio_vendas><periodo>" + v.getPeriodo() + "</periodo></relatorio_vendas>");
    }

    @Override
    public void visit(RelatorioFinanceiro f) {
        System.out.println("<financeiro><saldo>" + f.getSaldo() + "</saldo></financeiro>");
    }
}