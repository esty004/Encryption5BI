class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    System.out.println("Inserisci il testo da cifrare: ");
    Matrice matrice= new Matrice("prova");
    matrice.stampa();
    Vigenere elemento = new Vigenere(3, 5, 7, 8, matrice);
    Thread t1 = new Thread(elemento);
    t1.start();
    
  }
}