package review;

public class AudioSignal {
	Integer[] audio;
	public AudioSignal(){
		
	}
	
	public AudioSignal(Integer[] audio) {
		this.audio = audio;
	}
	
	public Integer[] filter() {
		int aLen = this.audio.length, minim = 0, maxim = 65536;
		for(int i = 0; i < aLen; i++) {
			if(this.audio[i] < minim || this.audio[i]>maxim) {
				this.audio[i] = 0;
			}
		}
		int k = 0;
		for(int i = 0; i < aLen; i++) {
            if (this.audio[i] != 0) {
                int temp = this.audio[k];
                this.audio[k] = this.audio[i];
                this.audio[i] = temp;
                k++;
            }
        }
		return this.audio;
	}
}
