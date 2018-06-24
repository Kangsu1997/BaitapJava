package cv_dt;

public class CV_DT {
    public static void main(String[] args){
        final double width = 7.5;
        final double height = 8.5;
        double cv = 2*(width+height);
        double dt = width*height;
        System.out.printf("Chu vi la 2*(%.1f+%.1f) = %.2f\n", width, height, cv);
        System.out.printf("Dien tich la (%.1f*%.1f) = %.2f\n", width, height,dt);
    }
}
