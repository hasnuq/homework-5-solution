import java.util.*;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();
    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + "-" + color + "-" + labelStyle;
        styles.putIfAbsent(key, new MarkerStyle(icon, color, labelStyle));
        return styles.get(key);
    }
    public static int getStyleCount() {
        return styles.size();
    }
}