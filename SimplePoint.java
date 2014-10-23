class SimplePoint {

private int x;
private int y;

public SimplePoint() {
  x = 0;
  y = 0;
}

public SimplePoint (int x, int y) {
  this.x = x;
  this.y = y;
}

public int move(int m, int n) {
  x = m;
  y = n;
}

public String toString () {
  String s = "x: " + x + " " + "y: " + y;
  return s;
}
}