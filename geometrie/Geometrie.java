package fr.geometrie;

import java.util.Scanner;

public class Geometrie {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        double perimetre = triangle.calculerPerimetre();
        System.out.println("Périmètre : " + perimetre);
        boolean isocele = triangle.testerIsocele();
        if (isocele)
            System.out.println("Le triangle est isocèle");
        else
            System.out.println("Le triangle n'est pas isocèle");

    }
}

class Triangle{
    private Point p1, p2, p3;
    private double longueur1, longueur2, longueur3;

    public Triangle(){

        p1 = new Point();
        p2 = new Point();
        p3 = new Point();

        longueur1 = p1.calculerDistance(p2);
        longueur2 = p2.calculerDistance(p3);
        longueur3 = p3.calculerDistance(p1);

    }

    public double calculerPerimetre(){
        return longueur1 + longueur2 + longueur3;
    }

    public boolean testerIsocele(){
        if (longueur1 == longueur2 || longueur2 == longueur3 || longueur3 == longueur1)
            return true;
        else
            return false;
    }
}

class Point{
    private static Scanner scanner = new Scanner(System.in);
    private double x, y;

    public Point(){
        System.out.println("Construction d'un nouveau point");
        System.out.print("      Veuillez entrez x : ");
        x = scanner.nextDouble();
        System.out.print("      Veuillez entrez y : ");
        y = scanner.nextDouble();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculerDistance(Point p){
        double x1 = this.x;
        double y1 = this.y;

        double x2 = p.getX();
        double y2 = p.getY();

        double xdiff = x1 - x2;
        double ydiff = y1 - y2;

        double somme = xdiff * xdiff + ydiff * ydiff;
        double distance = Math.sqrt(somme);

        return distance;
    }
}
