package hello.itemservice.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter @Setter
@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price; //Integer로 하는 이유 : price값이 없을 경우도 고려 (null허용)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
