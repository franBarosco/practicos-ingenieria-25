public class StanadrdEvolution implements EvolutionStrategy{

    public boolean evolve(boolean isAlive, int liveNeighbors){
        if(isAlive){
            return liveNeighbors == 2 || liveNeighbors == 3; //survives
        }else{
            return liveNeighbors == 3; //born
        }
    }

    public void play(){
        
    }


}