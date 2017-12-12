

public class Transitivity
{

  final static int SIZE = 4;

  static boolean isTransitive(boolean[][] function)
  {
    for (int i = 0; i < SIZE; i++)
    {
      for (int j = 0; j < SIZE; j++)
      {
        if (function[i][j])
        {
          for (int k = 0; k < SIZE; k++)
          {
            if (function[j][k] && !function[i][k])
            {
              System.out.println("("+i+", "+j+") && ("+j+", "+k+") && ! ("+i+", "+k+")");
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  public static void main(String[] args)
  {
    boolean[][] function = new boolean[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++)
    {
      function[i] = new boolean[SIZE];
    }
    function[0][0] = true; //(a,a)
    function[0][1] = true; //(a,b)
    function[1][0] = true; //(b,a)
    function[1][2] = true; //(b,c)
    function[2][1] = true; //(c,b)
    function[2][2] = true; //(c,c)
    function[2][3] = true; //(c,d)
    function[3][2] = true; //(d,c)
    function[3][3] = true; //(d,d)
    System.out.println(isTransitive(function));
  }
}
