abstract class Bharatvanshi{
  public void fighter(){
      System.out.println("Good fighter");
  }
  abstract void obedience();
  abstract void Kindness();
}


class Pandavas extends Bharatvanshi {
    public void Kindness(){
        System.out.println("Kindness 100%");
    }
    public void obedience(){
        System.out.println("obedience 100%");
    }
    
}
class Kaurvas extends Bharatvanshi {
    public void Kindness(){
        System.out.println("Kindness 0%");
    }
    public void obedience(){
        System.out.println("obedience 0%");
    }
    
}

class Arjun extends Pandavas{
}
class Bheem extends Pandavas{
    public void Kindness(){
        System.out.println("Kindness 50%");
    }
}
class Karn extends Kaurvas{
    public void Kindness(){
        System.out.println("Kindness 100%");
    }
    public void obedience(){
        System.out.println("obedience 100%");
    }
}
class Duryodhan extends Kaurvas{
    
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("karn is .........................");
        Karn a=new Karn();
        a.Kindness();
        a.obedience();
        a.fighter();
        System.out.println("Arjun is .........................");
        Arjun b=new Arjun();
        b.Kindness();
        b.obedience();
        b.fighter();
        System.out.println("Duryodhan is .....................");
        Duryodhan c=new Duryodhan();
        c.Kindness();
        c.obedience();
        c.fighter();
        System.out.println("Bheem is ...........................");
        Bheem d=new Bheem();
        d.Kindness();
        d.obedience();
        d.fighter();
        
      
		
	}
}
