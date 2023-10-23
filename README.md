# Lampadina
 Prima parte
Scrivere la classe Lampadina i cui oggetti rappresentano delle lampadine elettriche. Una lampadina può essere accesa, spenta o rotta, e mette a disposizione due sole operazioni: stato() che restituisce una stringa che indica lo stato corrente della lampadina e click() che ne cambia lo stato da accesa a spenta o da spenta a accesa o la rompe. Una lampadina si rompe dopo un certo numero di click definito dal fabbricante. La classe deve contenere:

• Una o più variabili d’istanza che descrivano opportunamente lo stato della lampadina
• Un opportuno costruttore
• I metodi previsti

Per testare la classe, scrivere la classe TestLampadina che crea un oggetto della classe Lampadina che ammetta un numero massimo di click deciso dall’utente e poi, tramite un menù, permetta all’utente la possibilità di invocare una delle due funzionalità (visualizzando l’esito dell’operazione, nel caso di stato()) o di terminare l’esecuzione.

Modificare la classe Lampadina dell’esercizio 2 in modo che tutte le lampadine condividano l’informazione sulla presenza di corrente elettrica nell’impianto. Lo stato di una lampadina quando non c’è corrente può essere solo spento o rotto. Per testare la classe, riscrivere TestLampadina dell’esercizio 2 in modo che offra all’utente anche la possibilità di staccare o riattivare le corrente.

Seconda parte
Scrivere la classe Interruttore i cui oggetti rappresentano degli interruttori. Ogni interruttore è collegato a una lampadina (oggetto della classe Lampadina) e ne regola l’accensione e spegnimento. La classe deve contenere tutte le variabili d’istanza i costruttori e i metodi ritenuti opportuni. Per testare la classe, scrivere una classe TestInterruttore che crea due interruttori (oggetti della classe Interruttore) entrambi collegati alla stessa lampadina (uno stesso oggetto della classe Lampadina) e poi, in maniera iterativa, permetta all’utente di agire su uno dei due interruttori (visualizzando l’esito dell’operazione) o di terminare l’esecuzione.
