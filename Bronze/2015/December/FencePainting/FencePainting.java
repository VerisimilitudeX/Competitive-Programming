import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FencePainting {
  private static int a;
  private static int b;
  private static int c;
  private static int d;

  private static void getInput() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("paint.in"));

    String ab = br.readLine();
    a = Integer.parseInt(ab.substring(0, ab.indexOf(" ")));
    b = Integer.parseInt(ab.substring(ab.indexOf(" ") + 1));

    String cd = br.readLine();
    c = Integer.parseInt(cd.substring(0, cd.indexOf(" ")));
    d = Integer.parseInt(cd.substring(cd.indexOf(" ") + 1));

    br.close();
  }

  private static int getUnitsPainted() {
    int count = 0;
    for (int i = 0; i < 100; i++) {
      if ((i >= a && i < b) || (i >= c && i < d)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) throws IOException {
    FencePainting.getInput();
    FileWriter fw = new FileWriter(new File("paint.out"));
    fw.write(FencePainting.getUnitsPainted() + "\n");
    fw.close();
  }
}
