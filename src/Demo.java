import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        String[] icons = {"hospital", "restaurant", "gas"};
        String[] colors = {"red", "blue", "green"};
        String[] styles = {"bold", "italic"};

        Random rand = new Random();
        int markerCount = 10000;

        for (int i = 0; i < markerCount; i++) {
            String icon = icons[rand.nextInt(icons.length)];
            String color = colors[rand.nextInt(colors.length)];
            String labelStyle = styles[rand.nextInt(styles.length)];

            MarkerStyle markerStyle = MarkerStyleFactory.getStyle(icon, color, labelStyle);
            MapMarker marker = new MapMarker(rand.nextInt(1000), rand.nextInt(1000), markerStyle);
        }

        System.out.println("Total markers: " + markerCount);
        System.out.println("Unique marker styles: " + MarkerStyleFactory.getStyleCount());
    }
}
