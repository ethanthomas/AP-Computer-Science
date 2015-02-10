/**
 * Created by user on 2/5/15.
 */
public class Volume {


    public static void main(String[] args) {

        Volume volume = new Volume();
        System.out.println(volume.cubeVolume(30.5));
        System.out.println(volume.regularDodecahedronVolume(23.2));
        System.out.println(volume.sphereVolume(2.8));

    }

    public double cubeVolume(double length) {
        return Math.pow(length, 3);
    }

    double sphereVolume(double radius) {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    double rightCircularCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 3) * height;
    }

    double rightCircularConeVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    double rightSquarePyramidVolume(double baseLength, double height) {
        return Math.pow(baseLength, 2) * height / 3;
    }

    double regularIcosahedronVolume(double edgeLength) {
        return 5 * (3 + Math.sqrt(5)) * Math.pow(edgeLength, 3) / 12;
    }

    double truncatedIcosahedronVolume(double edgeLength) {
        return 125 + 43 * Math.sqrt(5) * Math.pow(edgeLength, 3) / 4;
    }

    double octohedronVolume(double length) {
        return (Math.sqrt(2) / 3) * Math.pow(length, 3);
    }

    double rhombicosidodecahedronVolume(double a) {
        return (60 + 29 * Math.sqrt(5)) / 3 * Math.pow(a, 2);
    }

    double regularDodecahedronVolume(double edgeLength) {
        return (15 + 7 * Math.sqrt(5)) * Math.pow(edgeLength, 3) / 4;
    }

    double tetrahedronVolume(double length) {
        return Math.pow(length, 3) / (6 * Math.sqrt(2));
    }

    double houseVolume(double edgeLength) {
        double heightOfTri = Math.sqrt(edgeLength / 2);
        return cubeVolume(edgeLength) + rightSquarePyramidVolume(edgeLength, heightOfTri);
    }

    double speakerVolume(double edgeLength) {
        return cubeVolume(edgeLength)
                - rightCircularConeVolume(edgeLength / 2, edgeLength / 2);
    }
}

