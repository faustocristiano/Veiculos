package poo;

/**
 * classe concreta Pampa implementa interface TracaoIntegral,VeiculoTerrestre
 * Nessa classe que intancia o objeto que aciona o super contrutor da superclasse abstrata Veiculo, 
 * 
 */

public class Pampa extends Veiculo implements TracaoIntegral,VeiculoTerrestre{


    public Pampa(){
        super();
        
        
    }

    /**
    * Metodo abrirCacamba, esta nessa classe, pois só pertence a Pampa
    *@return boolean
    */
    public boolean abrirCacamba(){
        if (super.getAcelerar()==0){
            return true;
        }
        
        return false;
    }      
     /**
    * sobreescrita do metodo ativarDesativarTracao da interface TracaoIntegral
    *@return boolean
    */
    @Override
    public boolean ativarDesativarTracao(){
        if(this.acelerar==0){
            return true;
        }
       
        return false;
    }
   
    @Override
    public void acelerar(int acelerar) {
        if(getAcelerar()+acelerar>=140){
            this.acelerar=140;
        }else{
            setAcelerar(acelerar);

        }
           
        
    }
     /**
    * sobreescrita do metodo frear da interface VeiculoTerrestre
    *@return void
    */
    @Override
    public void frear(int frear) {
        if(frear>=this.acelerar){
            this.acelerar=0;
        }
        else{
            this.acelerar-=frear;
        }
        
    }
}
