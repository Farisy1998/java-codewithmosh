package Inheritance;

public class UIControl {
    private boolean isEnabled;

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        // System.out.println("UIControl");
    }

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean getState(){
        return isEnabled;
    }
}
