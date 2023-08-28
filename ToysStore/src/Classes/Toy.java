package Classes;

public class Toy {
    private int id;
    private String name;
    private int count;
    private int weight; //  частота выпадения игрушки (вес)

    public Toy (int id, String name, int count, int weight){
        this.id=id;
        this.name=name;
        this.count=count;
        this.weight=weight;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getCount(){
        return count;
    }

    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCount(int count){
        this.count=count;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    @Override
    public String toString(){
        return "[id=" +id + ", name=" +name+ ", count= " +count+ ", weight= " + weight + " ]";
    }

}
