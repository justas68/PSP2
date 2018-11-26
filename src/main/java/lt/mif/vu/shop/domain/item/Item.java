package lt.mif.vu.shop.model.item;

import java.util.UUID;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lt.mif.vu.shop.model.AuditModel;
import lt.mif.vu.shop.model.seller.Seller;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public abstract class Item extends AuditModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private double price;
    private String name;
    private String description;
    private int deliveryTime;
    private int count;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="seller_ID")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Seller seller;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliverytime) {
        this.deliveryTime = deliverytime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
