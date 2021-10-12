# U10-2 | NumberDelimiter

Beim Schreiben von besonders großen Zahlen ist es üblich, ein
Tausender-Trennzeichen zu benutzen, um die Ziffernfolge in Dreiergruppen zu unterteilen. Dieses Trennzeichen kann ein Leerzeichen, ein Komma oder
ein Punkt sein.

Eine Million würde zum Beispiel folgendermaßen geschrieben:

1,000,000

1.000.000

1 000 000

Um die Darstellung solcher Zahlen zu vereinfachen, sollen Sie nun eine
Klasse `CommaGenerator ` implementieren, welche ein bei der Objekterstellung
übergebenes Trennzeichen als Instanzvariable abspeichert, auf die bei
der Verarbeitung der Ziffernfolgen zugegriffen wird. Die erlaubten
Trennzeichen sollen die oben genutzten sein (Komma, Punkt, Leerzeichen).
Benutzen Sie hierzu folgenden Klassenrumpf:

    public class CommaGenerator{

        public static final int SEPARATOR_COMMA = 0;
        public static final int SEPARATOR_POINT = 1;
        public static final int SEPARATOR_SPACE = 2;
        
        private char separator;

        // Konstruktor und Methoden hier implementieren

    }

Achtung: Nutzen Sie bei Objekterzeugung die statischen Variablen (vgl.
Enumeration-Prinzip) der Klasse `CommaGenerator ` oder nutzen Sie den
Enum-Datentyp (vgl. Vorlesung) und übergeben Sie diese dem Konstruktor, z.B. so:

    CommaGenerator commaGenerator = new CommaGenerator(CommaGenerator.SEPARATOR_SPACE);

Im Konstruktor lesen Sie den übergebenen Wert und setzen das
Trennzeichen für das Objekt entsprechend des Parameters. Wird kein
gültiges Trennzeichen übergeben, soll das Komma verwendet werden. Ein
Objekt dieser Klasse soll nun also mit der Methode

`public String addSeparatorToNumericString(String digits)`

einen übergebenen Text aus Zahlen mit Trennzeichen an jeder dritten
Position von rechts zurückgeben.
