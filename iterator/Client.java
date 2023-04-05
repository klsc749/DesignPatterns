package iterator;

import iterator.EnemyList.EnemyIterator;

public class Client {
    public static void main(String[] args) {
        EnemyList enemyList = new EnemyList();
        enemyList.addEnemy(new Enemy("Enemy 1", 10, 10));
        enemyList.addEnemy(new Enemy("Enemy 2", 20, 20));
        enemyList.addEnemy(new Enemy("Enemy 3", 30, 30));
        EnemyIterator enemyIterator = (EnemyIterator) enemyList.iterator();
        while(enemyIterator.hasNext()){
            System.out.println(enemyIterator.next());
        }
    }
}
