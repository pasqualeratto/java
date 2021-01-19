public class GiochiElettronici extends Giocattoli{
  private float DurataDellaBatteria,DimensioneDisplayPollici;
  
  
  public GiochiElettronici(String codice,String nome,float prezzo,float DurataDellaBatteria,float DimensioneDisplayPollici){
    super(codice,nome,prezzo);
    this.DurataDellaBatteria=DurataDellaBatteria;
    this.DimensioneDisplayPollici=DimensioneDisplayPollici;
    
  }
    public void setDurata(float durata){this.DurataDellaBatteria=durata;}
    public void setDimensione(float dimensione){this.DimensioneDisplayPollici=dimensione;}
    public float getDurata(){return this.DurataDellaBatteria;}
    public float getDimensione(){return this.DimensioneDisplayPollici;}
}

