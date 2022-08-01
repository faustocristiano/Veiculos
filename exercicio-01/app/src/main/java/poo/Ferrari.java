package poo;


/**
 * classe concreta Ferrari implementa interface Conversivel,VeiculoTerrestre
 * Nessa classe que intancia o objeto que aciona o super contrutor da superclasse abstrata Veiculo, 
 * 
 */

public class Ferrari extends Veiculo implements Conversivel,VeiculoTerrestre{

    public Ferrari(){
        super();        
    }

     /**
    * Metodo ligarFarolNeblina, esta nessa classe, pois só pertence a Ferrari
    *@return boolean
    */
    public boolean ligarFarolNeblina(){
        return true;        
    }

    /**
     * metodo sobreescrito da interface Conversivel, pois somente a ferrari pode abrir, 
       ou fechar a capota em movimento
     * @return boolean
     */

    @Override
    public boolean abrirCapota() {
        if (super.getAcelerar()<=20){
            return true;
        }
        
        return false;
    }

     /**
     * metodo sobreescrito da interface Conversivel, pois somente a ferrari pode abrir, 
       ou fechar a capota em movimento
     * @return boolean
     */
    @Override
    public boolean fecharCapota(){
        if (super.getAcelerar()<=20){
            return true;
        }        
        
        return false;
    } 

     /**
     * metodo sobreescrito da interface VeiculoTerrestre, pois somente a ferrari pode chegar, 
       até 200km/h
     * @return void
     */

    @Override
    public void acelerar(int acelerar) {
        if(super.getAcelerar()+acelerar>=200){
            super.setAcelerar(200);
        }else{
            super.setAcelerar(super.getAcelerar()+acelerar);
        }
    }
         /**
    * sobreescrita do metodo frear da interface VeiculoTerrestre
    *@return void
    */
  
    @Override
    public void frear(int frear) {
        if(frear>=super.getAcelerar()){
            super.setAcelerar(0);
        }
        else{
            super.acelerar-=frear;
        }
        
    }

   
}
