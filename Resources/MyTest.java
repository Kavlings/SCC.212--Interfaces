import java.util.*;


public class MyTest implements CollectionTest {

    int size;
    int halfpoint;
    int hphalfpoint;
    Person person;
    

   public MyTest() {

    }
    
        
    //Create a Linkedlist 
        

    //Create a HashMap
         

         
@Override
public void setSize(int size) {
    this.size = size;
}

@Override
public void runTest(CollectionTest.CollectionType type, CollectionTest.TestType test, int iterations) {
    //ArrayList
    for (int i = 0 ; i <iterations; i++) {

        switch (type) {
            case LINKED_LIST:
                runLinkedListTest(test);
                break;

            case ARRAY_LIST:
                runArrayListTest(test);
                break;

            case HASH_MAP:
                runHashMapTest(test);
                break;
        
            default:
            System.out.println("Unsupported Collection Type");
                
        }
         
         
        // linkedlist.add(person);
        // //Search text - arraylist
    }
    // //Index test - linked list
    //  for (int i = 0 ; i <size; i++) {
    //     Person person = new Person("Jeff" + i, i);
    //      halfpoint = linkedlist.size()/2;
    //     linkedlist.get(halfpoint);
    // }

    // //Search test - linked list
    // for (int i = 0 ; i <size; i++) {
    //     if (person.equals(linkedlist.get(halfpoint))) {
    //             person.getName();
    //             person.getAge();
    //         }
    // //Index Test - Hashmap
     


    // //Search Text Hashmap
    // for (int key : hashmap.keySet()) {  
        
    // }
    // }
    }

    public void runArrayListTest(TestType test){
      //Create an ArrayList to store Person Objects
        ArrayList<Person> arraylist = new ArrayList<Person>();
        ArrayList<Person> arraylist2 = new ArrayList<Person>();
        
        for (int j = 0; j < size; j++){
                Person person2 = new Person("Jeff" + j, j);
                 arraylist2.add(person2);
                }

        switch (test) {

            case ADD:
            for (int i = 0; i < size; i++){
                Person person = new Person("Jeff" + i, i);
                 arraylist.add(person);
            };
                break;
            case INDEX:
                int halfpoint = (arraylist2.size()/2);
                arraylist.indexOf(arraylist2.get(halfpoint)
                );

            break;
            case SEARCH:
                String targetname = ("Jeff" + (size / 2));
                for (Person p : arraylist2) {
                    if (p.getName().equals(targetname)) {
                        p.getName();
                        p.getAge();                
                    }
                };
            default:
         
            }


        
            
        }

    
    public void runLinkedListTest(TestType test){
      //Create an ArrayList to store Person Objects
        LinkedList<Person> linkedlist = new LinkedList<Person>();
        LinkedList<Person> linkedlist2 = new LinkedList<Person>();
        
        for (int j = 0; j < size; j++){
                Person person2 = new Person("Jeff" + j, j);
                 linkedlist2.add(person2);
                }

        switch (test) {

            case ADD:
            for (int i = 0; i < size; i++){
                Person person = new Person("Jeff" + i, i);
                 linkedlist.add(person);
            };
                break;
            case INDEX:
                int halfpoint = (linkedlist2.size()/2);
                linkedlist.indexOf(linkedlist2.get(halfpoint)
                );
            
            break;
            case SEARCH:
                String targetname = ("Jeff" + (size / 2));
                for (Person p : linkedlist2) {
                    if (p.getName().equals(targetname)) {
                        p.getName();
                        p.getAge();                
                    }
                };
            default:
         
            }


        
            
        }

    public void runHashMapTest(TestType test){

      //Create an Hashmap to store Person Objects
        HashMap<Integer , Person> hashmap = new HashMap<Integer, Person>();
        HashMap<Integer , Person> addtesthashmap = new HashMap<Integer, Person>();

        for (int j = 0; j < size; j++){
              Person person = new Person("Jeff" + j, j);
                hashmap.put(j, person);    
                }
        Integer hphalfpoint = hashmap.size()/2;
        Person MiddleIndex = null;  
        

        switch (test) {

            case ADD:
            for (int i = 0; i < size; i++){
                Person person = new Person("Jeff" + i, i);
                addtesthashmap.put(i, person);   
            };
                break;
            case INDEX:
            
            for (Integer key : hashmap.keySet()) { 
                if (key.equals(hphalfpoint))
                {MiddleIndex = hashmap.get(key);}
                break;
            };

            case SEARCH:
            String Targetname = null;

            for (Integer key : hashmap.keySet()) { 
                if (key.equals(hphalfpoint)){
                    MiddleIndex = hashmap.get(key);
                    Targetname = MiddleIndex.getName();
                }
                
                };

            for (Integer key : hashmap.keySet()) {
                Person value = hashmap.get(key);
                if (value.getName().equals(Targetname)){
                int result = value.hashCode();
                break;
                }    
                }

            default:
            break;
            }    
        
        }
        
        

             

         
            }


        
            
        
    


 




