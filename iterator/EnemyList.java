package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnemyList {
    private List<Enemy> enemies = new ArrayList<>();

    public Iterator<Enemy> iterator(){
        return new EnemyIterator(enemies.size());
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    class EnemyIterator implements Iterator<Enemy>{
        private int index = 0;
        private int size = 0;

        public EnemyIterator(int size){
            this.size = size;
        }

        @Override
        public boolean hasNext(){
            return index < size;
        }

        @Override
        public Enemy next() {
            return enemies.get(index++);
        }
        
    }
}
