/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys;

/**
 *
 * @author ASUS
 */
public class MyToys {
    //chứa các hàm đồ chơi phụ kiện dùng cho mọi nơi static
    //hàm tính giai thừa n! = 1.2.3....n, cf compute Factorial
    //nhanh, để long 15 ! vượt nữa tràn đấy, kiểm tra lại sau
    
    public static long cf(int n) {
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("n must between 0...15");
        if(n == 0)
            return 1;
        long product = 1;
        for (int i = 0; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
