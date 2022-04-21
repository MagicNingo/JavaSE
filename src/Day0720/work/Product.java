package Day0720.work;

import java.util.Date;

public class Product {
        private Integer productID;
        private String  product_name;
        private double  income_price;
        private Integer providerID;
        private Integer quantity;
        private double  sales_price;
        private Integer categoryID;
        private Date    income_time;

    public Product() {
    }

    public Product(Integer productID, String product_name, double income_price,
                   Integer providerID, Integer quantity, double sales_price,
                   Integer categoryID, Date income_time) {
        this.productID = productID;
        this.product_name = product_name;
        this.income_price = income_price;
        this.providerID = providerID;
        this.quantity = quantity;
        this.sales_price = sales_price;
        this.categoryID = categoryID;
        this.income_time = income_time;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getIncome_price() {
        return income_price;
    }

    public void setIncome_price(double income_price) {
        this.income_price = income_price;
    }

    public Integer getProviderID() {
        return providerID;
    }

    public void setProviderID(Integer providerID) {
        this.providerID = providerID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getSales_price() {
        return sales_price;
    }

    public void setSales_price(double sales_price) {
        this.sales_price = sales_price;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Date getIncome_time() {
        return income_time;
    }

    public void setIncome_time(Date income_time) {
        this.income_time = income_time;
    }
}
