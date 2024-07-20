public class Words {
    private String[] data;

    public Words() {
        this.data = new String[26];        
    }

    public int getWordCount() {
        return this.data.length;
    }

    public String getWord(int index) {
        return data[index];
    }

    public void initData() {
        data[0] = "awkward";
        data[1] = "bagpipes";
        data[2] = "bandwagon";
        data[3] = "beekeeper";
        data[4] = "bookworm";
        data[5] = "buzzwords";
        data[6] = "croquet";
        data[7] = "espionage";
        data[8] = "fluffiness";
        data[9] = "gnostic";
        data[10] = "haphazardly";
        data[11] = "jawbreaker";
        data[12] = "kilobytes";
        data[13] = "megahertz";
        data[14] = "mnemonic";
        data[15] = "oxymoronic";
        data[16] = "pneumonia";
        data[17] = "rickshaw";
        data[18] = "stronghold";
        data[19] = "thumbscrew";
        data[20] = "twelfths";
        data[21] = "voyeuristic";
        data[22] = "wristwatch";
        data[23] = "xylophone";
        data[24] = "yachtsman";
        data[25] = "zigzagging";
    }
}
