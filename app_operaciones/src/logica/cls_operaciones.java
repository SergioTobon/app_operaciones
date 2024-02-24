package logica;

import javax.swing.JOptionPane;

public class cls_operaciones {

    private float numero1Flt;
    private float numero2Flt;
    private int operacionesInt;
    private float resultadoFlt;


    public cls_operaciones(float numero1Flt, float numero2Flt, int operacionesInt) {
        this.numero1Flt = numero1Flt;
        this.numero2Flt = numero2Flt;
        this.operacionesInt = operacionesInt;
        switch (operacionesInt) {
            case 0:
            this.resultadoFlt = numero1Flt + numero2Flt;
            break;
            case 1:
            this.resultadoFlt = numero1Flt - numero2Flt;
            break;
            case 2:
            this.resultadoFlt = numero1Flt * numero2Flt;
            break;
            case 3:
            if (numero1Flt == 0) {
                JOptionPane.showMessageDialog(null, "Operacion no es posible");
            }else{
                this.resultadoFlt = numero1Flt / numero2Flt;
            }
            break;

            default:
                break;
        }
    }


    public float getResultadoFlt() {
        return resultadoFlt;
    }


    public void setResultadoFlt(float resultadoFlt) {
        this.resultadoFlt = resultadoFlt;
    }


    public float getNumero1Flt() {
        return numero1Flt;
    }


    public float getNumero2Flt() {
        return numero2Flt;
    }


    public int getOperacionesInt() {
        return operacionesInt;
    }


    
    

}
