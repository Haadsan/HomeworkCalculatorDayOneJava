//Create a water bottle class with a volume property.

public class WaterBottle {

    private int volume;


    public WaterBottle(int volume){
        this.volume = volume;
    }
    //The volume should start at 100.
    public int getVolume(){
        return this.volume;
    }
    //Add a drink function that takes 10 from the volume each time it is called.
    public void drink(){
        this.volume -= 10;
    }

    //Create an empty function that brings the volume down to 0.

    public void empty(){
        this.volume = 0;
    }
    // Create a fill function that fills the volume back to 100.
    public void fill(){
        this.volume = 100;
    }















}
