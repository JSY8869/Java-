package Thread_test2;

public class User {
    String player;
    int max_hp;
    int hp;
    void status(){
        if(0 < hp) {
            System.out.printf("플레이어 이름: %s \n", player);
            System.out.printf("%s의 체력: %d/%d \n\n", player, hp, max_hp);
        }
    }
}
