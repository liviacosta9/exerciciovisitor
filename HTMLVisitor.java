public class HTMLVisitor implements RelatorioVisitor {
    @Override
    public void visit(RelatorioVendas v) {
        System.out.println("<html><body><h1>Vendas: " + v.getPeriodo() + "</h1></body></html>");
    }

    @Override
    public void visit(RelatorioFinanceiro f) {
        System.out.println("<html><body><h1>Saldo: " + f.getSaldo() + "</h1></body></html>");
    }
}