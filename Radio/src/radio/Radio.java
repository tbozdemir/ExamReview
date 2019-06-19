/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author tarik bozdemir
 */
public class Radio {

    /**
     * @param args the command line arguments
     */
    private int Volume;
	private int Channel;
	private DriverVoice Voice;
        public static final int Max_volume=10;
        private boolean on;
        
        
        
        
        
         public int getVolume() {
        return Volume;
    }

    /**
     * @param Volume the Volume to set
     */
    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    /**
     * @return the Channel
     */
    public int getChannel() {
        return Channel;
    }

    /**
     * @param Channel the Channel to set
     */
    public void setChannel(int Channel) {
        this.Channel = Channel;
    }

        
	

    public DriverVoice getVoice() {
        return Voice;
    }

    /**
     * @param Voice the Voice to set
     */
    public void setVoice(DriverVoice Voice) {
        this.Voice = Voice;
    }

    /**
     * @return the isOn
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param isOn the isOn to set
     */
    public void setIsOn(boolean on) {
        this.on = true;
    }

    public void lowVolume(){
        if(Voice.getKeyword().equals(DriverVoice.Command)){
            Volume=Max_volume/2;
            System.out.println("Lowering volume. . . ");
        }
        else{
          System.out.println("Driver keyword not matched");
          
        }
    }

   
}
