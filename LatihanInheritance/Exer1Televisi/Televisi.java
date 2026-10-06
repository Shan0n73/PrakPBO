package LatihanInheritance.Exer1Televisi;

public class Televisi {

    public String merk;
    public int jumlahChannel;
    int channelAktif;

    public Televisi() {
        this.channelAktif = 1;
    }

    public void pindahChannel(int newChannel) {
        this.channelAktif = newChannel;
    }

    public void switchChannel(int newChannel) {
        pindahChannel(newChannel);
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public int getActiveChannel() {
        return getChannelAktif();
    }
}
