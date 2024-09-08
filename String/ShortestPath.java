
public class ShortestPath {

    public static float getShortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            int direc = str.charAt(i);
            // west
            if (direc == 'W') {
                x--;
            }
            // north
            else if (direc == 'N') {
                y++;
            }
            // east
            else if (direc == 'E') {
                x++;
            }
            // south
            else {
                y--;
            }

        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}
