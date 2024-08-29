//Object class
public class Employee {
    private String nama;
    private double salary;


    /*Constructor Employee*/
    public Employee() { 
        salary = 0;
        nama = "";
    }

    /*Constructor Parameter */
     public Employee(String nama, double salary) {
            this.nama = nama;
            this.salary = salary;
        }

        //Getter
        public String getnama(){
            return nama;
        }
        public Double getSalary(){
            return salary;
        }

        //Setter
        public void setnama(String nama){
            this.nama = nama;
        }
        public void setsalary(Double salary){
            this.salary = salary;
        }

        //method
        public void print() {
            System.out.println("nama :"+nama);
            System.out.println("salary:" +salary);
        }
    







    


    
        
    


    }
    

