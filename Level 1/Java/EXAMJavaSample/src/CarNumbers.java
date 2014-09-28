import java.util.Scanner;


public class CarNumbers {
	public static void main(String[] args) {	
		
		Scanner in = new Scanner(System.in);
		int CA = 40;
        int input = in.nextInt();
        int[] letters = { 10, 20, 30, 50, 80, 110, 130, 160, 200, 240 };
        int count = 0;
        for(int a = 0;a<10;a++)
        {
            for (int b = 0; b < 10; b++)
            {
                for (int c = 0; c < 10; c++)
                {
                    for (int d = 0; d < 10; d++)
                    {
                        for (int e = 0; e < 10; e++)
                        {
                            for (int f = 0; f < 10; f++)
                            {
                                int tempresult = CA + a + b + c + d + letters[e] + letters[f];
                                if(tempresult==input)
                                {
                                    if(a==b)
                                    {
                                        if(b==c && c==d)
                                        {
                                            count++;
                                        }
                                        else if(b==c && c!=d)
                                        {
                                            count++;
                                        }
                                        else if(c!=a && c==d)
                                        {
                                            count++;
                                        }
                                    }
                                    else if(a!=b && b==c && c==d)
                                    {
                                        count++;
                                    }
                                    else if(a==c && b==d && b!=a)
                                    {
                                        count++;
                                    }
                                    else if(a==d && b==c && a!=c)
                                    {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
	}

}
