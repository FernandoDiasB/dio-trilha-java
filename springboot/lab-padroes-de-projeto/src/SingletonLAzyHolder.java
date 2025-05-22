public class SingletonLAzyHolder {



    private static class InstanceHolder{
    public static SingletonLAzyHolder instancia = new SingletonLAzyHolder();
    }

    private SingletonLAzyHolder() {
        super();
    }


    public static SingletonLAzyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}

