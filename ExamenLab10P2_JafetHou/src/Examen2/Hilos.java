
package Examen2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class Hilos extends Thread{
    
    private JProgressBar barra1;
    private JProgressBar barra2;
    private JLabel timer = new JLabel();
    private int velocidadjug1, velocidadjug2, segundos, minutos; 
    private boolean avanzar;
    private boolean ganar;

    public Hilos(JProgressBar barra1, JProgressBar barra2, JLabel timer) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.timer = timer;
    }

    public Hilos(JProgressBar barra1, JProgressBar barra2, int velocidadjug1, int velocidadjug2, JLabel timer) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.velocidadjug1 = velocidadjug1;
        this.velocidadjug2 = velocidadjug2;
        this.timer = timer;
        
    }
    

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public int getVelocidadjug1() {
        return velocidadjug1;
    }

    public void setVelocidadjug1(int velocidadjug1) {
        this.velocidadjug1 = velocidadjug1;
    }

    public int getVelocidadjug2() {
        return velocidadjug2;
    }

    public void setVelocidadjug2(int velocidadjug2) {
        this.velocidadjug2 = velocidadjug2;
    }    

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isGanar() {
        return ganar;
    }

    public void setGanar(boolean ganar) {
        this.ganar = ganar;
    }
    
    @Override
    public void run(){
        
        while(avanzar){
            while(segundos != 60){

                if(barra1.getValue()== barra1.getMaximum() || barra2.getValue()== barra2.getMaximum()){
                    avanzar=false;
                    ganar = true;
                }else{
                    segundos++;
                    timer.setText(minutos+ ": "+ segundos);
                    
                    barra1.setValue(barra1.getValue()+velocidadjug1/10);
                    barra2.setValue(barra1.getValue()+velocidadjug2/10);


                }    

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException ex) {

                }
                break;
            }
        }
        if(barra1.getValue()>barra2.getValue()){
            JOptionPane.showMessageDialog(null, "Gano Jugador 1 en "+ segundos+" segundos");
        }else if(barra2.getValue()>barra1.getValue()){
            JOptionPane.showMessageDialog(null, "Gano Jugador 2 en "+ segundos+" segundos");
        }else{
            JOptionPane.showMessageDialog(null, "Empate en "+ segundos+" segundos");
        }
        segundos = 0;
    }    
    
    
}
