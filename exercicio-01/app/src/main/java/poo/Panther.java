package poo;


/**
 * classe concreta Panther implementa interface VeiculoAnfibio,VeiculoMarinho,VeiculoTerrestre,Conversivel,TracaoIntegral
 * Nessa classe que intancia o objeto que aciona o super contrutor da superclasse abstrata Veiculo, 
 * onde estão as heranças e as interfaces
 */

public class Panther extends Veiculo implements VeiculoAnfibio,VeiculoMarinho,VeiculoTerrestre,Conversivel,TracaoIntegral {
    private int temperatura;


    public Panther(){
        super();
        
    }

    /**
    * metodo setTempRefr, esta nessa classe, pois só pertence a Pampa
    *@return void
    */
   
    public void setTempRefri(int temperatura){
        this.temperatura=temperatura;
    }


    /**
     * sobreescrita do metodoativarDesativarTraca, devido
        ao veiculo anfibio
     * @return
     */
    
    
     /**
    * sobreescrita do metodo abrirRodas da interface VeiculoAnfibio
    *@return boolean
    */
    @Override
    public boolean abrirRodas(){
        this.rodas=true;
        return true;
    }

    
     /**
    * sobreescrita do metodo recolheRodas da interface VeiculoAnfibio
    *@return boolean
    */
    @Override
    public boolean recolheRodas(){
        if(this.acelerar==0){            
            esvaziarLastro();
            return true;
        }
        return false;
    
    }
     /**
    * sobreescrita do metodo esvaziarLastro da interface VeiculoMarinho
    *@return void
    */
    @Override
    public void esvaziarLastro() {
       this.lastro=0;        
    }

    /**
    * sobreescrita do metodo abrirCapota da interface Conversivel
    *@return boolean
    */
    @Override
    public boolean abrirCapota() {
        if (this.acelerar==0){
            return true;
        }
        
        return false;
    }

    /**
    * sobreescrita do metodo fecharCapota da interface Conversivel
    *@return boolean
    */
    @Override
    public boolean fecharCapota(){
        if (this.acelerar==0){
            return true;
        }
        
        
        return false;
    }
     /**
    * sobreescrita do metodo acelerar da interface VeiculoTerrestre
    *limitado a 140km/h para veiculos 4x4, para Ferrari foi sobreescrito
     na propria classe concreta, limitando em 200km/h
    *@return void
    */
    @Override
    public void acelerar(int acelerar) {
        if(getAcelerar()+acelerar>=140){
            this.acelerar=140;
        }else{
            setAcelerar(acelerar);

        }
           
        
    }

    @Override
    public void frear(int frear) {
        if(frear>=this.acelerar){
            this.acelerar=0;
        }
        else{
            this.acelerar-=frear;
        }
        
    }
    @Override
    public boolean ativarDesativarTracao(){
        if(getAcelerar()==0&&getRodas()==true){
            return true;
        }
       
        return false;
    }
}
