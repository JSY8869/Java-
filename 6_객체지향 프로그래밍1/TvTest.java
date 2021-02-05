class Tv{
    String color; // null
    boolean power; // false
    int channel; // 0

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

class TvTest{
    public static void main(String[] args){
        Tv t1; // Tv클래스 타입의 참조변수 t를 선언, 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로 참조변수로 아무것도 할 수 없다.
        t1 = new Tv(); // 연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 이 때, 멤버변수는 각 자료형에 해당하는 기본값으로 초기화된다.
        Tv t2 = new Tv(); // 이런 형식으로도 가능
        t2 = t1; // t1의 주소를 t2에 저장 -> t1의 값이 바뀌면 t2도 바뀜
        t1.channel = 7;
        t1.channelUp();
        System.out.println(t2.channel);
    }
}