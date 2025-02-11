package Exo;
public class Abstraction {
    public abstract class Forme{
        
        public abstract double calculerAire();
    }

    public class Cercle extends Forme{
        private double rayon;
    
        public Cercle(double rayon){
            this.rayon = rayon;
        }
    
        public double calculerAire(){
            return Math.PI * rayon * rayon;
        }
    }


}
