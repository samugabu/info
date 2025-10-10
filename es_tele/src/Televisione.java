public class Televisione {
    private int canali;
    private int canale_att;
    private boolean acceso;
    private int vol_att;
    private int max_vol = 100;

    public Televisione(){
        canali = 999;
        acceso = false;
        vol_att = 0;
    }

    public int getVol_att() {
        return vol_att;
    }

    public int getCanale_att() {
        return canale_att;
    }

    public boolean setVol_att(int vol_att) {
        if(acceso) {
            if (vol_att > 0 && vol_att < 100){
                this.vol_att = vol_att;
            }
            return true;
        } else return false;
    }

    public boolean canaleSuccessivo(){
        if(acceso){
            canale_att++;
            if(canale_att == 999){
                canale_att = 1;
            }
            return true;
        } else return false;
    }

    public boolean canalePrecedente(){
        if(acceso){
            canale_att--;
            if(canale_att == 1){
                canale_att = 999;
            }
            return true;
        } else return false;
    }

    public boolean selezionaCanale(int dec){
        if((dec < 0 || dec > 999) || !acceso){
            return false;
        } else return true;
    }

    @Override
    public String toString(){
        return "Il televisore è: " + acceso + ", sul canale: " + canale_att + "con volume: " + vol_att;
    }
}
