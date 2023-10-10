package Interface.InterfaceSegrigationPrinciple;

// interface in java will support multiple inheritance
public interface UIWidget extends Dragable, Resizeable {
    void render();
}

// Note: implement interface segrigation principle when a
// interface have a mixed capability