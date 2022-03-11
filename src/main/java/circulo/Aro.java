package circulo;

/**
 * Se define la clase aro para obtener el area, diámetro y circunferencia a
 * partir del radio y las coordenadas x e y
 *
 *
 * @author alejandro
 */
public class Aro {

    /**
     * Definida la constante MINIMO
     */
    public static final double MINIMO = 0.0;

    /**
     * Definida la constante LIMITERADIO
     */
    public static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Método Aro
     */
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
     * @return Obtenemos coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return Devuelve coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return Devuelve el radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        radio = radio < LIMITERADIO ? LIMITERADIO : radio;
        this.radio = radio;
    }

    /**
     *
     * @return Obtenemos Diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     *
     * @return Obtenemos Circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return Obtenemos Superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    /**
     *
     * @return Devolvemos un String añadiendo la coordenadaX, coordenadaY y el
     * radio
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
