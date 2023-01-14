
class Cercle implements Enceinte {
    double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return Math.PI * 2 * rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }
    
}