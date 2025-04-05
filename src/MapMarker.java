public class MapMarker {
    private int x, y;
    private MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }
    public void render() {
        System.out.println("Marker at (" + x + ", " + y + ") with style " + style);
    }
}