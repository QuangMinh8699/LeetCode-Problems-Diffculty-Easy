package RomanToInteger;

// import java.util.HashMap;
// import java.util.Map;

class Solution {
    // public int romanToInt(String s) {

    // Sử dụng hash map để gán giá trị cho các kí tự
    // Map<Character, Integer> map = new HashMap<Character, Integer>();
    // map.put('I', 1);
    // map.put('V', 5);
    // map.put('X', 10);
    // map.put('L', 50);
    // map.put('C', 100);
    // map.put('D', 500);
    // map.put('M', 1000);

    // Khai báo biến lưu trữ kết quả cuối cùng
    // int total = 0;
    // for (int i = 0; i < s.length(); i++) {

    // Ta có cách tính số la mã là "Giá trị kí tự sau trừ đi giá trị kí tự trước"
    // Hay đơn giản là "ab = b - a"
    // Vậy từ đó suy ra "ab = a + b - 2a"
    // Áp dụng vào bài toán trên ta sẽ có:

    // Đầu tiên bỏ qua kí tự thứ nhất, để kí tự thứ nhất được cộng vào biến total
    // Bắt đầu vị trí thứ 2, Nếu kí tự sau có giá trị lớn hơn giá trị kí tự trước
    // => total = a + b - 2a
    // => total = total + "giá trị kí tự trước" - (2 * "giá trị kí tự sau")
    // if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
    // total += map.get(s.charAt(i)) - (2 * map.get(s.charAt(i - 1)));
    // } else {
    // total += map.get(s.charAt(i));
    // }
    // }
    // return total;
    // }

    public int romanToInt(String s) {

        // Khởi tạo 3 biến
        // answer để lưu kết quả cuối cùng
        // number để lưu giá trị của kí tự hiện tại
        // prev để lưu giá của kí tự trước đó
        int answer = 0, number = 0, prev = 0;

        // Vì cách tính số la mã là nếu kí tự sau lớn hơn kí tự trước thì
        // "answer = b - a"
        // => sẽ dùng vòng lặp từ cuối đi lên
        for (int j = s.length() - 1; j >= 0; j--) {

            // Dựa theo kí tự để xác nhận giá trị hiện tại
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }

            if (number < prev) {
                // Nếu giá trị hiện tại nhỏ hơn giá trị trước
                // Thì answer sẽ trừ đi giá trị hiện tại
                // VD: a = 1, b = 5 => ab = 5 - 1 = 4
                answer -= number;
            } else {
                // Nếu giá trị hiện tại lớn hơn hoặc bằng giá trị trước
                // Thì giá trị hiện tại sẽ được cộng vào answer
                answer += number;
            }

            // Cập nhật giá trị mới cho prev để sử dụng cho các lần lặp sau
            prev = number;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman = "IV";
        solution.romanToInt(roman);
    }
}