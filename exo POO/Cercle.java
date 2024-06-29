public class Cercle {

    private Point centre;
    private float r;

    Cercle(Point centre, float r) {
        this.centre = centre;
        this.r = r;
    }

    public double getPerimetre() {
        return Math.PI * r * 2;
    }

    public double getSurface() {
        return r * r * Math.PI;
    }

    public boolean appartient(Point p) {
        double distance = Math.pow((centre.x - p.x) * (centre.x - p.x) + (centre.y - p.y) * (centre.y - p.y), 2);
        if (distance <= this.r) {
            return true;
        } else {
            return false;
        }
    }

    // Méthode pour vérifier si un point appartient au cercle
//    public boolean appartient(Point p) {
//        double dx = p.getX() - centre.getX();
//        double dy = p.getY() - centre.getY();
//        double distanceCarre = dx * dx + dy * dy;
//        double rayonCarre = rayon * rayon;
//
//        return distanceCarre <= rayonCarre;
//    }


    public void AfficherCercle() {
        System.out.println("CERCLE(" + centre.x + "," + centre.y + "," + r + ")");
    }

    public static void main(String[] args) {

        Point p1 = new Point(10, 12);
        Cercle c = new Cercle(p1, 20);

        c.AfficherCercle();
        System.out.println("Voici le périmetre du cercle :" + c.getPerimetre());
        System.out.println("Voici la surface du cercle :" + c.getSurface());
        Point p2 = new Point(12, 23);
        p2.AffichePoint();
        System.out.println(c.appartient(p2));
    }
}