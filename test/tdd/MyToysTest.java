/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static toys.MyToys.cf; //kể từ này về sau, tỏng class này, xài hàm cf() như C
//Éo cần MyToys. gọi tên hàm thôi, import static

/**
 *
 * @author ASUS
 */
public class MyToysTest {
    String expected;
    //mình muốn test gì thì ghi ở đây, là hàm thôi, giống như DBUtils chứ lệnh/ hàm kết nối CSDL
    //test các hàm gõ lệnh here, và quen trọng, trả ra màu sắc
    //mỗi tình huống gọi hàm, ta cần chuẩn bị sẵn data, kì vọng, gọi hàm
    //ví dụ tui muốn test 5!, chuẩn bị: 5, 120 (expected), gọi hàm cf(5) so sánh kết quả
    //vơi skif vọng
    //tình huống test với 1 bộ data cho sẵn xem kq trẻ về -> Test Case(Tình huống test)
    @Test //biên hàm này thành hàm main
    public void testSuccessfulUpper10Cases() {
        assertEquals(3_628_800, cf(10));
        assertEquals(39_916_800, cf(11));
    }

    
    @Test //biên hàm này thành hàm main
    public void testSuccessfulLowerCases() {
        assertEquals(10, cf(0));
        assertEquals(2, cf(2));
        assertEquals(6, cf(3));
        assertEquals(24, cf(4));
        assertEquals(720, cf(6));
    }
    //ngoại lệ/Exception không đc xem là 1 value để so sánh
    //không là value thì không thể dùng hàm assertEquals(yêu cầu có các value cụ thể)
    @Test(expected = IllegalArgumentException.class) //try catch đó em
    public void testExceptionPositiveCases() {
        cf(-5);
    }
    
    @Test(expected = IllegalArgumentException.class) //try catch đó em
    public void testExceptionNegativeCases() {
        cf(16);
    }
    //code viết ổn, không sai cú pháp luôn ra đc file .JAR

    //Ép ant, phải đảm bảo coede xanh thông đường, pass hết test, không Error về mặt
    //giá trị trả về  thì mới Clean and build
    //Jenkins, teamCity,...... là tool, công cụ sinh ra giúp ta những điều ta vừa làm - tay
    //nó tự động hóa giùm
    //bất kì ai push code lên Git server thì phải push kèm bộ data này
    //Jenkins phát hiện có sự thay đổi trên Git kéo code/pull về local
    //gọi ant/Maven comppile/test thử đóng gói nếu test màu xanh
    //nếu test bị đỏ, nó tự gửi mail đến thằng vừa push, chửi chỉ ra lỗi
    
}
