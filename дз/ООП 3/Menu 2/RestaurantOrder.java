public class RestaurantOrder {
    private String orderId;
    private int tableNumber;
    private MenuItem [] orderItems = new MenuItem[25];
    private String orderStatus;
    private static int totalOrders = 0;
    private static final int MAX_TABLE_NUMBER = 50;

    public void addItem(MenuItem item){
        for (int i = 0; i < orderItems.length; i++){
            orderItems[i] = item;
            System.out.println(item + "Добавлено в заказ");
        }
    }

    public void removeItem(String itemId){
        for(int i = 0; i < orderItems.length; i++){
            if(orderItems[i].equals(itemId)){
                orderItems[i] = null;
                System.out.println(itemId + "удалено из спика блюд");
            }
            System.out.println("Данное блюдо не найдено");
        }
    }
    public void calculateTotal(){
        double suma = 0;
        for(int i = 0; i < orderItems.length; i++){
            suma += orderItems[i].getPrice();
        }
        System.out.println("Сумма заказа: " + suma);
    }

    public void getOrderDetails(){
        System.out.println("Детали заказа");
        System.out.println("Номер заказа: " + orderId);
        System.out.println("Стол: " + tableNumber);
        System.out.println("Статус: " + orderStatus);
        System.out.println("Количество блюд: " + totalOrders);
    }
    public void updateStatus(String newStatus){
        this.orderStatus = newStatus;
    }

    public void estimatePreparationTime(){
        double suma = 0;
        for(int i = 0; i < orderItems.length; i++){
            suma += orderItems[i].getCookingTime();
        }
        System.out.println("Время ожидание заказа: " + suma);
    }

    public void getItemsByType(String type){
        for(int i = 0; i < orderItems.length; i++){
            if (orderItems[i].equals(type)){
                System.out.println("Получите свое " + orderItems[i]);
            }
            System.out.println("Такого не нашлось");
        }
    }

}

