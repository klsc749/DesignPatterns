package iterator;

public class Enemy{
    private String name;
    private Position position;

    public Enemy(String name, int x, int y){
        this.name = name;
        position = new Position(x, y);
    }

    public void setPosition(int x, int y){
        position.setXAndY(x, y);
    }

    @Override
    public String toString(){
        return name + " is at " + position;
    }
    


    class Position{
        private int x;
        private int y;
        
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void setXAndY(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public int getX(){
            return x;
        }
        
        public int getY(){
            return y;
        }

        public void setX(int x){
            this.x = x;
        }

        public void setY(int y){
            this.y = y;
        }

        @Override
        public String toString(){
            return "x: " + x + " y: " + y;
        }
    }
}