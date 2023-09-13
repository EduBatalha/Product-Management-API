package Data;

import java.util.UUID;

public class Product {
    private long id;
    private UUID hash;
    private String nome;
    private String descricao;
    private String ean13;
    private double preco;
    private double quantidade;
    private double estoque_min;
    private boolean lativo;

    // Getter para o campo 'id'
    public long getId() {
        return id;
    }

    // Setter para o campo 'id'
    public void setId(long id) {
        this.id = id;
    }

    // Getter para o campo 'hash'
    public UUID getHash() {
        return hash;
    }

    // Setter para o campo 'hash'
    public void setHash(UUID hash) {
        this.hash = hash;
    }

    // Getter para o campo 'name'
    public String getName() {
        return nome;
    }

    // Setter para o campo 'name'
    public void setName(String name) {
        this.nome = name;
    }

    // Getter para o campo 'description'
    public String getDescription() {
        return descricao;
    }

    // Setter para o campo 'description'
    public void setDescription(String description) {
        this.descricao = description;
    }

    // Getter para o campo 'ean13'
    public String getEan13() {
        return ean13;
    }

    // Setter para o campo 'ean13'
    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    // Getter para o campo 'price'
    public double getPrice() {
        return preco;
    }

    // Setter para o campo 'price'
    public void setPrice(double price) {
        this.preco = price;
    }

    // Getter para o campo 'quantity'
    public double getQuantity() {
        return quantidade;
    }

    // Setter para o campo 'quantity'
    public void setQuantity(double quantity) {
        this.quantidade = quantity;
    }

    // Getter para o campo 'minStock'
    public double getMinStock() {
        return estoque_min;
    }

    // Setter para o campo 'minStock'
    public void setMinStock(double minStock) {
        this.estoque_min = minStock;
    }

    // Getter para o campo 'l_ativo'
    public boolean isLativo() {
        return lativo;
    }

    // Setter para o campo 'l_ativo'
    public void setLativo(boolean l_ativo) {
        this.lativo = l_ativo;
    }

}
