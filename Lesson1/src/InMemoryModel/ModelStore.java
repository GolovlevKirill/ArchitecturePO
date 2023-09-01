package InMemoryModel;
import ModelElements.*;

public class ModelStore implements IModelChanger {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver ChangeObserver;

    public ModelStore(IModelChangeObserver changeObserver) {
        this.ChangeObserver = changeObserver;
        this.models = new PoligonalModel(new Poligon());
        this.cameras = new Camera();
        this.flashes = new Flash();
        this.scenes = new Scene(this.models, this.flashes, this.cameras);

    }

    public Scene getScenes(int n) {
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
