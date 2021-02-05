public class ArrayEx4 {
    public static void main(String[] args){
        char[] abc = {'A','B','C','D'};
        char[] num = {'1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(num, 0, result, 0, num.length);
        // num[0]에서 result[0]으로 num.lenth개의 데이터를 복사
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);
        // abc의 0부터 복사해서 num의 6번째 위치 부터 3개의 값을 순서대로 붙여넣음
        System.out.println(num);
    }
    
}
