package jade;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {

    protected Camera camera;
    private boolean isRunning = false;
    protected List<GameObject> gameObjects = new ArrayList<>();

    public Scene(){

    }

    public void start(){
        for(GameObject go: gameObjects ){
            go.start();
        }
    }

    public void addGameObjectToScene(GameObject go){
        if(!isRunning){
            gameObjects.add(go);
        }
        else {
            gameObjects.add(go);
            go.start();
        }
    }

    public void init(){

    }

    public abstract void update(float dt);


}
