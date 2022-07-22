public class RodarAplicacao {

 public static void main(String[] args) {

  // Preparando Polimorfismo
  ClasseMae[] classes = new ClasseMae[] { new ClasseFilha1(), new ClasseFilha2(), new ClasseMae() };

  // Sobrescrita com Polimorfismo
  for (ClasseMae classe : classes) {
   classe.metodo1();
  }

  System.out.println("");

  // Sobrescrita com Polimorfismo
  for (ClasseMae classe : classes) {
   classe.metodo2();
  }

  System.out.println("");

  // Sobrescrita pura
  ClasseFilha2 classeFilha2 = new ClasseFilha2();
  classeFilha2.metodo2();
 }

}
