package programmingelements.Level1;

public class EarthVolume {
    public static void Earthvolume(){
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
    public static void main(String[] args) {
        Earthvolume();
    }
}
