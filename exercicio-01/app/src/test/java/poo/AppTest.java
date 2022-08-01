/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test()
    public void teste(){
        /**
         * testes da ferrari
         */
         Ferrari f1=new Ferrari();
        f1.acelerar(210);
        //max velocidade 200
        assertEquals(200, 200);
        //ligando farol neblina
        assertEquals(true, f1.ligarFarolNeblina());
        //abrindo capota a 200km/h
        assertEquals(false, f1.abrirCapota());
        //fechando capota a 200km/h
        assertEquals(false, f1.abrirCapota());
        f1.frear(180);
        //abrindo capota a 20km/h
        assertEquals(true, f1.abrirCapota());
        //fechando capota a 20km/h
        assertEquals(true, f1.abrirCapota()); 

        /**
         * testes da Pampa
         */
            Pampa p1=new Pampa();
            p1.acelerar(180);
            //max velocidade 140
            assertEquals(140, 140);
            //abrindo a caçamba em movimento
            assertEquals(false, p1.abrirCacamba());
            //ativando tração integral em movimento
            assertEquals(false, p1.ativarDesativarTracao());
            //freando a 0 o carro
            p1.frear(140);
            //abrindo a caçamba parado
            assertEquals(true, p1.abrirCacamba());
            //ativando tração integral parado
            assertEquals(true, p1.ativarDesativarTracao());

            /**
             * testes da Phanter
             */

             Panther ph1=new Panther();

             ph1.acelerar(180);
            //max velocidade 140
            assertEquals(140, 140);
            //tentando recolher aas rodas em movimento
            assertEquals(false, ph1.recolheRodas());
            //tentando abrir a capota em movimento
            assertEquals(false, ph1.abrirCapota());
             //tentando fechar a capota em movimento
             assertEquals(false, ph1.fecharCapota());
             //ativando traçção integral em movimento e rodas abertas
             assertEquals(false, ph1.ativarDesativarTracao()); 
            //zerando a velocidade
            ph1.frear(140);
            // recolher aas rodas parado
            assertEquals(true, ph1.recolheRodas());
            assertEquals(0, ph1.getLastro());
            //tentando abrir a capota parado
            assertEquals(true, ph1.abrirCapota());
            //tentando fechar a capota parado
            assertEquals(true, ph1.fecharCapota());
           
            //setando temperatura
            ph1.setTempRefri(90);
            assertEquals(90, 90);


    }
  
}