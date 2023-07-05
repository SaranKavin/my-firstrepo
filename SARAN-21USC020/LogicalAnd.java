//Logical AND gate (Hard Code)

public class LogicalAnd 
{
    	public static void main(String[] args) 
    {
        String s1 = "true";
        String s2 = "true";
        boolean result = logicalAnd(s1, s2);
        System.out.println("Logical AND: " + result);
    }

    	public static boolean logicalAnd(String s1, String s2) 
    {
        boolean b1 = Boolean.parseBoolean(s1);
        boolean b2 = Boolean.parseBoolean(s2);
        return b1 && b2;
    }
}

