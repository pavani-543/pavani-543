class GenericClass<X>{
 X name;
 public void setName(X name){
   this.name=name;
   }
   public X getName(){
   return name;
   }
  public String genericMethod(GenericClass<String>x){
  x.setName("hayansh");
  return x.name;
  }
 }
  public class TypeInferenceEx1{
    public static void main(String args[]){
    GenericClass<String> gene=new GenericClass<String>();
   gene.setName(gene.getName());
   
   //java7 version
    GenericClass<String>gene1=new GenericClass<>();
    gene1.setName("pavani");
    System.out.println(gene1.getName());
    
    //java8 version
    System.out.println(gene1.genericMethod(new GenericClass<>()));
    }
   }