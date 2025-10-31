package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo() {
    }

    @Override
    public Double calcularArea(){
        return Math.PI * (raio * raio);
    }
    @Override
    public String toString(){
        return "A figura é a representação do conjunto dos pontos num plano numa dada distância de um dado ponto, o centro.";
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
