package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 *
 * @author alejandro
 */
public class Aro {

    /**
     *Definida la constante MINIMO
     */
    public static final double MINIMO = 0.0;

    /**
     * Definida la constante MINIMO
     */
    public static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

   
    public Aro() {
    }

    /**
     *
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        radio=radio<LIMITERADIO?LIMITERADIO:radio;
        this.radio = radio; 
    }

    /**
     *
     * @return Diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     *
     * @return Circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     *
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        coordenadaX = coordenadaY + trasladarX;
        coordenadaY = coordenadaY + trasladarY;
    }
}
