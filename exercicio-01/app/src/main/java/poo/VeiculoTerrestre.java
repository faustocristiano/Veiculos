package poo;

/**
 * Interface VeiculoTerrestre
 * Interface contem especificações para outras classe.
 * É um manual de implementação para outras classe
 * A classe que implementar a interface, é obrigada a implementar , todods os metodos da interface
 * Na interface, só contem as assinaturas dos metodos, a resposabilidade pela implementação é da classe que herda
 */

public interface VeiculoTerrestre {
    

    public void frear(int frear); 
    public void acelerar(int acelerar);    
    
}
