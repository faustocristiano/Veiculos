package poo;

/**
 * a classe abstrata ela não pode ser instanciada ela serve para ser herdada, então se tentar
    criar um objeto de uma classe abstrata não vai conseguir, ela só vai servir para herança.
 * 
 * @param acelerar inteeiro para incremetar velocidade
 * @param frear inteiro para decrementar velocidade
 * @param lastro esvaziar quando recolhe as rodas
 * @param rodas identificar rodas abertas anfibio*/




abstract class Veiculo {
    protected int acelerar;
    protected int frear;
    protected boolean rodas=false;
    protected int lastro;
    

    /**
     * metodo Super, instaciar o veiculo e as heranças
     */
    public Veiculo(){
       
    }          



    public int getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

    public int getFrear() {
        return frear;
    }

    public void setFrear(int frear) {
        this.frear =frear;
        
    }       

    public int getLastro() {
        return lastro;
    }

    public void setLastro(int lastro) {
        this.lastro = lastro;
    }    
   
     public boolean getRodas() {
        return rodas;
    }

    public void setRodas(boolean rodas) {
        this.rodas = rodas;
    }
    
}
