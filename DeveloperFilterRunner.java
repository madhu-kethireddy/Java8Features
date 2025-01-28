

public class DeveloperFilterRunner 
{

    public static void main(String[] ar)
    {
        Developers[] developers = {
            new Developers("madhu", Developers.Level.JUNIOR, 0, "Java", "Security", "Bash"),
            new Developers("sony", Developers.Level.LEAD, 5.2f, "Python", "DevOps", "DSA"),
            new Developers("geetha", Developers.Level.JUNIOR, 1.2f, "C++", "JavaScript", "React"),
            new Developers("suraj", Developers.Level.SENIOR, 6.7f, "Java", "OracleSQL", "Excel"),
            new Developers("lakshmi", Developers.Level.MIDDLE, 2.3f, "C", "MongoDB", "PowerBI"),
            new Developers("arjun", Developers.Level.MANAGER, 3.0f, "JavaScript", "SQl", "NodeJs")
        };
        
        DeveloperFilter devFilter = dev -> dev.getYearsOfExperience() > 2.0;
        for(Developers devs: developers){
           if(devFilter.isSuitable(devs)){
                System.out.println(devs.getName());
           }
        }
    }
    
}
