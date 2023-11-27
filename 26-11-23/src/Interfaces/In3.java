package Interfaces;

public class In3 implements In2{  // interface cant be extend .. it have to implements

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void b() {
        System.out.println("Muri kha");
    }
    
}
