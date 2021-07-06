package Thread_test2;

public class Thread_attack extends Thread{
    public void run(){
        User user = new User();
        user.player = "정세영";
        user.max_hp = 100;
        user.hp = 100;

        Monster monster = new Monster();
        monster.boss = "Boss";
        monster.dmg = 30;
        monster.poison_dmg = 1;

        while(user.hp <= 100){
            try{
                if(user.hp == 0){
                    System.out.printf("%s이 죽었습니다.\n GAME OVER", user.player);
                    break;
                }else{
                    monster.poison_attack(user, monster.poison_dmg);
                }Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
