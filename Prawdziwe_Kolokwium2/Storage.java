public class Storage <T>{
    private T object;

    public void store(T item){
        this.object=item;
    }

    public T retrieve(){
        return this.object;
    }
}
