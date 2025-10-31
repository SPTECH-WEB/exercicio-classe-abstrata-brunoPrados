package school.sptech;

public class Retangulo extends Figura{
    private Double base, altura;

    @Override
    public Double calcularArea(){
        return base * altura;
    }
    @Override
    public String toString(){
        return "A figura tem 4 angulos retos.";
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
