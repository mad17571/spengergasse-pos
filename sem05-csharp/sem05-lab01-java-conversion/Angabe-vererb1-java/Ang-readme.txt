

   H�ufig wird in der Schule folgendes OO Vererbungsbeispiel verwendet.
   anbei Code in Java als Muster

   Bauen Sie den Java-Code auf Csharp um
   und testen Sie ihn mittels der �bungs-main
   Es geht am schnellsten die java Files auf cs Files umzubenennen
   Sie dann mittels drag and drop (fallen lassen �ber dem Projektnamen)
        (oder Add existing Items) in eine Consolenprojekt zu stellen
   
   - Namespace statt package
   - die in der Standard Program.cs vorhandenen usings  
       samt Namespace anstelle des package in die Files zu kopieren   
   - Syntax Vererbung und Konstruktoren,  base statt super
   - Properties statt get/set Methoden 
   - toString korrekt umstellen (siehe Object mittels Object-Browser)
   - �berschriebene Methode ploymorph �berschreiben
   - Console.WriteLine   statt System.out.println

         Employee
             |
        +----+-----------+
        |                |
   WageEmployee         Manager
        |
        |
    SalesPerson

    
       Angestellte
           |
      +----+-----------+
      |                |
  Gehaltsemp�nger    Manager
      |
      |
   Verk�ufer





folgender Code sollte nach der Umstellung in der Main laufen k�nnen
   Sie sollen nat�rlich nur eine main im Projekt haben
           
            Employee emp2 = new Employee();
            WageEmployee wemp2 = new WageEmployee("Fred");
            SalesPerson semp2 = new SalesPerson("Wilma");
            Manager man2 = new Manager("Boss");

            Console.WriteLine(emp2);

            Console.WriteLine(emp2.Name + " verdient " + emp2.ComputePay());
            wemp2.Wage = 224;
            wemp2.Hours = 24;
            Console.WriteLine(wemp2.Name + " verdient " + wemp2.ComputePay());
            semp2.Salesmade = (1234);
            semp2.Commission = (0.3);
            semp2.Wage = (224);
            semp2.Hours = (24);
            Console.WriteLine(semp2.Name + " verdient " + semp2.ComputePay());
            man2.Weeklysalary =((float)2500.5);
            Console.WriteLine(man2.Name + " verdient " + man2.ComputePay());
            Console.WriteLine(man2.Name + " verdient immer noch " + ((Employee)man2).ComputePay());            
            
            Console.ReadKey();

   







