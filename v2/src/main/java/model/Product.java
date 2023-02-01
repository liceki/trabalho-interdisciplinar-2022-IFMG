package model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product", schema = "espaco_mix")
@NamedQueries({
        @NamedQuery(name = "GET_ALL_PRODUCTS",
                query = "SELECT p FROM Product p"),
        @NamedQuery(name = "FIND_PRODUCTS_WITH_FILTERS",
                query = "SELECT p FROM Product p " + ""
                        /*"WHERE (upper(s.corporateName) like upper(concat('%', :corporateName, '%')) OR :corporateName = '') " +
                        "AND (upper(s.cnpj) like upper(concat('%', :cnpj, '%')) OR :cnpj = '') " +
                        "AND (upper(s.email) like upper(concat('%', :email, '%')) OR :email = '') "*/)
})
public  class Product {
    public static final String[] CATEGORIES = {"FEMALE CLOTHES", "MALE CLOTHES", "ACCESSORIES", "COSMETICS"};
    
    public static final String[] SUB_CATEGORIES_CLOTHES = {"JEANS", "T-SHIRT", "DRESS", "CROPPED"};
    
    public static final String[] SIZES_CLOTHES = {"PP", "P", "M", "G", "GG"};
    
    @Id
    @Column(name = "product_id", nullable = false)
    @GeneratedValue(generator = "increment")
    private int id;

    @Column(name = "name", length = 450)
    private String name;

    @Column(name = "selling_price")
    private BigDecimal sellingPrice;

    @Column(name = "cost_price")
    private BigDecimal costPrice;

    @Column(name = "profit")
    private BigDecimal profit;

    @Column(name = "available_in_stock")
    private Boolean availableInStock;

    @Column(name = "image", length = 2048)
    private String image;
    
    @Column(name = "category", length = 2048)
    private String category;

    @Column(name = "sub_category", length = 2048)
    private String subCategory;
    
    @Column(name = "size", length = 2048)
    private String size;
    
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;


    public Product() {
    }

    public Product(String name, BigDecimal sellingPrice, BigDecimal costPrice, 
            Boolean availableInStock, String category, String subCategory, String size, Supplier supplier) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.costPrice = costPrice;
        this.profit = sellingPrice.subtract(costPrice);
        this.availableInStock = availableInStock;
        this.category = category;
        this.subCategory = subCategory;
        this.size = size;
        this.supplier = supplier;
    }

    

    

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public Boolean isAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(Boolean availableInStock) {
        this.availableInStock = availableInStock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    public void updateProduct(Product product){
        this.name = product.getName();
        this.sellingPrice = product.getSellingPrice();
        this.costPrice = product.getCostPrice();
        this.profit = product.getProfit();
        this.availableInStock = product.isAvailableInStock();
        this.image = product.getImage();
        this.supplier = product.getSupplier();
        this.invoice = product.getInvoice();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", costPrice=" + costPrice +
                ", profit=" + profit +
                ", inStock=" + availableInStock +
                ", image='" + image + '\'' +
                ", supplier=" + supplier +
                ", invoice=" + invoice +
                '}';
    }

    public String toStringFromInvoice(){
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", costPrice=" + costPrice +
                ", profit=" + profit +
                ", inStock=" + availableInStock +
                ", image='" + image + '\'' +
                ", supplier=" + supplier.toStringFromProduct() +
                '}';
    }
}
