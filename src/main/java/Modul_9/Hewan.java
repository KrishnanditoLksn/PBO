package Modul_9;

public abstract class Hewan {
    abstract  void suara();
}

class Bebek extends Hewan{
    @Override
    void suara() {
        System.out.println("kwek - kwek");
    }
}

class MainHewan{
    public static void main(String[] args) {
        Hewan kewan;
        kewan = new Anjing();
        kewan.suara();
        kewan = new Kucing();
        kewan.suara();
        kewan = new Bebek();
        kewan.suara();
    }
}

class Anjing extends Hewan{
    @Override
    void suara(){
        System.out.println("guk guok ");
    }
}

class Kucing extends  Hewan{
    @Override
    void suara(){
        System.out.println("meong meong ");
    }
}

