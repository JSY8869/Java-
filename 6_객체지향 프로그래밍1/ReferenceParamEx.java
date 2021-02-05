class Data {
     int x;
    void println(){
        System.out.println(x);
    }
}

class ReferenceParamEx {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;
        d.println();

        change(d); // d 객체를 전달
        d.println();
    }
    static void change(Data d){ // 참조형 매개변수를 통해 객체 d의 주소값을 받음
        d.x = 1000;
        d.println();
    }
}