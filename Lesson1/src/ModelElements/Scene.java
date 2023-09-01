package ModelElements;

import ModelElements.AdditionalElements.Type;

public class Scene {
    public int id;
    public PoligonalModel models;
    public Flash flashes;

    public Scene(PoligonalModel models, Flash flashes, Camera cameras) {
        this.models = models;
        this.flashes = flashes;
    }

    public Type method1(Type n){
        return n;
    }
    public Type method2(Type a, Type b){
        return null;
    }
}
