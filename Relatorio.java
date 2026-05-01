public interface Relatorio {
    // Este é o único método que os relatórios terão agora.
    // Em vez de gerar PDF, XML, etc, eles apenas "aceitam" um visitante.
    void accept(RelatorioVisitor visitor);
}