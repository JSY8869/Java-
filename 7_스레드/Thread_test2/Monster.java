package Thread_test2;

public class Monster {
    String boss;
    int dmg;
    int poison_dmg;
    User user = new User();
    
    void attack(User user, int dmg){
        System.out.printf("%s가 %s를 공격합니다. \n", boss, user.player);
        user.hp = user.hp-dmg;
        user.status();
    }
    void poison_attack(User user, int poison_dmg){
        System.out.printf("%s가 %s에게 중독피해를 줍니다. \n", boss, user.player);
        user.hp = user.hp-poison_dmg;
        user.status();
    }
    void status(){
        System.out.println("몬스터 이름: " + boss);
        System.out.println("몬스터 기본 데미지: " + dmg);
        System.out.println("몬스터 중독 데미지: " + poison_dmg);
    }
}