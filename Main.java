import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Relatorio> relatorios = new ArrayList<>();
        relatorios.add(new RelatorioVendas());
        relatorios.add(new RelatorioFinanceiro());

        RelatorioVisitor exportadorPdf = new PDFVisitor();
        RelatorioVisitor exportadorXml = new XMLVisitor();
        
        System.out.println("Executando exportação para PDF:");
        for (Relatorio r : relatorios) {
            r.accept(exportadorPdf);
        }

        System.out.println("\nExecutando exportação para XML:");
        for (Relatorio r : relatorios) {
            r.accept(exportadorXml);
        }
    }
}