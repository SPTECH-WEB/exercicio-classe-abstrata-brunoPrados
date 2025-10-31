package school.sptech;

public class Triangulo extends Figura{
    private Double base, altura;

    @Override
    public Double calcularArea(){
        return (base * altura)/2;
    }
    @Override
    public String toString(){
        return "A figura tem 3 lados, onde a soma dos angulos internos é igual a 180 graus.";
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
