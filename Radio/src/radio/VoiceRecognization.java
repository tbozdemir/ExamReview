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

public class VoiceRecognization {
    public Radio r;
public VoiceRecognization(Radio r){
    this.r=r;
}
    
    public boolean recognize(DriverVoice voice){
        if(voice.equals(r.getVoice())){
        r.lowVolume();
        return true;
    }
    else{
    System.out.println("Driver not registered in Radio");
    return false;
}
}
}
    

