class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(Car c){                 // 복사 사용 예시
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door){            // this 사용 예시
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car(c1);
        System.out.println("c1입니다 " + c1.color + c1.gearType + c1.door);
        System.out.println("c2입니다 " + c2.color + c2.gearType + c2.door);
        System.out.println("c3입니다 " + c3.color + c3.gearType + c3.door);
    }
}
