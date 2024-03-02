import CIE.Internals;
import SEE.External;

public class FinalMarks 
{
    public static void main(String[] args) 
    {
        System.out.println("BHOOMIKA HEGDE \n1BM22CS342 ");
        int[] internalMarks = {45,46,47,43,49};
        int[] externalMarks = {45,47,49,50,42};



        Internals student1Internal = new Internals("1BM22AI030", "Bhoomika Hegde", 6, internalMarks);
        External student1External = new External("1BM22AI030", "Bhoomika Hegde", 6, externalMarks);

        System.out.println("Final marks for " + student1Internal.name + ":");
        for (int i = 0; i < 5; i++) 
        {
            int finalMark = student1Internal.internalMarks[i] + student1External.externalMarks[i];
            System.out.println("Course " + (i + 1) + ": " + finalMark);
        }
    }
}
