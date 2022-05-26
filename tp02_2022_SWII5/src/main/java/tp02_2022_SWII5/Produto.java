package tp02_2022_SWII5;
// Desenvolvido por 
// 
// Halisson de Oliveira Sousa CB3012051
// Marcel Crudelli            CB301181X
public class Produto {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(int unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtdPrevistoMes() {
        return qtdPrevistoMes;
    }

    public void setQtdPrevistoMes(double qtdPrevistoMes) {
        this.qtdPrevistoMes = qtdPrevistoMes;
    }

    public double getPrecoMaxComprado() {
        return precoMaxComprado;
    }

    public void setPrecoMaxComprado(double precoMaxComprado) {
        this.precoMaxComprado = precoMaxComprado;
    }

    private String nome;
    private int unidadeCompra;
    private String descricao;
    private double qtdPrevistoMes;
    private double precoMaxComprado;
}
