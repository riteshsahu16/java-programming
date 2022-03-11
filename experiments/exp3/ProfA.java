package experiments.exp3;

/**
 * ProfA
 */
public class ProfA implements Iteacher {

    @Override
    public void Teach() {
        System.out.println("Teach method implemented");        
    }

    @Override // override keyword optional here.
    public void Introduce() {
        System.out.println("Introduce method implementeds");
    }

    
}