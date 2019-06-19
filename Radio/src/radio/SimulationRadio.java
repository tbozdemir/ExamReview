/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author tarik
 */
public class SimulationRadio {
    public static void main(String[]args){
        Radio self=new Radio();
        self.setIsOn(true);
        System.out.println("Is the radio on "+self.isOn());
        self.setVolume(Radio.Max_volume);
        System.out.println("Adjusted to Max volume "+self.getVolume());
        DriverVoice tarik=new DriverVoice();
        self.setVoice(tarik);//This is the way link the driver registered to radio
        tarik.setKeyword("Low Volume");
        VoiceRecognization voice=new VoiceRecognization(self);
        if(voice.recognize(tarik)){
            System.out.println("Volume reduced "+self.getVolume());

        }
    }
    
}
