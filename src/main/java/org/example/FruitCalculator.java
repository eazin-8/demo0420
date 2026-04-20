package org.example;

public class FruitCalculator {

    public static int ZERO = 0;

    /**
     * 计算购买苹果和草莓的总价
     * @param appleWeight 苹果斤数
     * @param strawberryWeight 草莓斤数
     * @param mangoWeight 芒果斤数
     * @return 商品总价
     */
    public static double calculateTotalPrice(int appleWeight, int strawberryWeight, int mangoWeight, boolean promotion, boolean manjian) {

        final double APPLE_PRICE = 8; // 草莓单价
        final double STRAWBERRY_PRICE = 13; // 苹果单价
        final double MANGO_PRICE = 20; // 芒果单价

        final double ONE_HUNDRED = 100;
        final double TEN = 10;

        // 苹果总价
        double appleTotal = appleWeight * APPLE_PRICE;

        // 草莓总价
        double strawberryTotal = strawberryWeight * STRAWBERRY_PRICE;
        if (promotion) {
            strawberryTotal *= 0.8;
        }

        // 芒果总价
        double mangoTotal = mangoWeight * MANGO_PRICE;

        // 计算总价
        double total = appleTotal + strawberryTotal;
        if (mangoWeight > ZERO) {
            total += mangoTotal;
        }

        // 满减
        if (manjian && total >= ONE_HUNDRED) {
            total -= TEN;
        }

        return total;
    }

    public static void main(String[] args) {

        int apple = 2;
        int strawberry = 3;
        int mango = 1;

        // 是否促销 指的是草莓8折
//        boolean promotion = true;
        boolean promotion = false;

        // 满100减10
//        boolean manjian = true;
        boolean manjian = false;

        // 调用函数计算总价
        double totalPrice = calculateTotalPrice(apple, strawberry, mango, promotion, manjian);

        // 输出结果
        if (mango <= ZERO) {
            System.out.println("购买" + apple + "斤苹果和" + strawberry + "斤草莓，总价为：" + totalPrice + "元");
        } else {
            System.out.println("购买" + apple + "斤苹果和" + strawberry + "斤草莓和" + mango + "斤芒果，总价为：" + totalPrice + "元");
        }

    }
}