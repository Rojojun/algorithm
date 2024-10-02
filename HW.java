import java.util.List;
import java.util.logging.Logger;

public class HW {
    public boolean validateOrder(Order order) {
        if (order.isSizeEmpty()) {
            return false;
        }

        if (order.getTotalPrice()) {
            return order.hasCustomerInfo();
        }

        return true;
    }

    class Order {
        private final List<Item> items;
        private final String customer;

        Logger logger = Logger.getLogger("Order");

        private Order(List<Item> items, String customer) {
            this.items = items;
            this.customer = customer;
        }

        boolean isSizeEmpty() {
            if(items.isEmpty()) {
                logger.info("주문 항목이 없습니다.");
                return true;
            }
            return false;
        }

        public boolean hasCustomerInfo() {
            if (customer == null || customer.isEmpty()) {
                logger.info("사용자 정보가 없습니다.");
                return false;
            }
            return true;
        }

        public boolean getTotalPrice() {
            int totalPrice = items.stream()
                    .mapToInt(Item::getPrice)
                    .sum();
            if (totalPrice > 0) {
                return true;
            }

            logger.info("올바르지 않은 총 가격입니다.");
            return false;
        }
    }

    public class Item {
        private final int price;

        private Item(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }
}
