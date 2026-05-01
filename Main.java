import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de relatórios (Elementos)
        List<Relatorio> relatorios = new ArrayList<>();
        relatorios.add(new RelatorioVendas());
        relatorios.add(new RelatorioFinanceiro());

        // Escolha o formato (Visitor)
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