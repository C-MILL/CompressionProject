# **Java Bildkompression**


## Inhaltsverzeichniss

1. [Einleitung](#einleitung)
2. [Zielsetzung](#zielsetzung)
3. [Randbedingung](#randbedingung)
4. [Build-Anleitung](#build-anleitung)
5. [User Stories](#user-stories)
6. [Releaseplan](#releaseplan)
7. [Sprint 1](#sprint-1)
    + [Taskliste](#taskliste)
    + [Anreicherung der User Stories](#anreicherung-der-user-stories)
    + [Klassen- und Sequenzdiagramm](#klassen--und-sequenzdiagramm)
    + [Dokumentation wichtiger Code Snipplets](#dokumentation-wichtiger-code-snipplets)
    + [Testfälle](#testfälle)
8. [Bedienungsanleitung](#bedienungsanleitung)


## Einleitung

Das vorliegende Programm dient der Komprimierung von Bildern. Wir haben dieses Programm geschrieben, weil wir den Komprimierungsprozess vereinfachen wollen. Vor allem ältere Personen, die sich nicht mit komplizierten Computerprogrammen auskennen, haben öfters Probleme mit dem Komprimieren von Bildern.
Um das Komprimieren von Bildern für diese Zielgruppe zu vereinfachen, haben wir ein intuitives Programm erstellt. Die Komprimierung von Bildern bringt einen erheblichen Gewinn an Speicherplatz mit sich, da die Dateigröße der Bilder massiv reduziert wird. Im Hinblick auf Versendungen per E-Mail bringt die Komprimierung von Bildern auch erhebliche Vorteile.
Die Programmiersprache Java wurde ausgewählt, weil sie sowohl mit Windows, Mac als auch Linux kompatibel ist.


## Zielsetzung

Das Ziel unseres Projekts ist es, die Komprimierung von Bildern zu vereinfachen. Die Applikation soll speziell für Leute sein, die gerne Fotografieren, sich aber nicht mit der Bildkomprimierung auskennen und ihre Bilder trotzdem möglichst platzsparend ablegen möchten.


## Randbedingung

Das Programm soll in Java innerhalb der Eclipse Programmierumgebung geschrieben werden. Durch eine Strukturierung in verschiedene Klassen und Methoden soll ein klarer Aufbau erzielt werden. Das Programm soll mittels der Projektverwaltung Maven erstellt werden. Für die Versionsverwaltung und die nahtlose Zusammenarbeit der Gruppe wird die Software Git verwendet. Durch eine entsprechende Konfiguration sind Eclipse, Maven und Git direkt miteinander verbunden. 


## Build-Anleitung

1. Laden Sie die Datei .jar auf ihren Computer runter.
2. Vergewissern Sie sich, dass Sie eine Java Runtime Environment auf Ihrem Computer installiert haben.
3. Klicken Sie (Doppelklick) auf ebenjene, um die Datei auszuführen.


## User Stories

Nr. | UserStory | Aufwand-schätzung (Story Points) | Priorität | Akzptanzkriterium
----|-----------|----------------------------------|-----------|------------------
1 | Der Kunde soll die Applikation zur Komprimierung von Bildern intuitiv bedienen können, damit er Zeit spart beim Komprimieren von Dateien. | 7 | 1 | Es sollen nicht mehr als drei Buttons auf einer Seite verwendet werden. Die Buttons sollen beschriftet sein, um eine intuitive 
2 | Der Kunde soll die Aktionen über eine intuitiv verständliche Benutzeroberfläche eingeben können, damit er vorher keinen Kurs belegen muss. | 5 | 1 | Buttons müssen unmissverständlich beschriftet sein.
3 | Die Bilddateien sollen direkt auf den Desktop gespeichert werden, damit der Benutzer keinen Dateipfad eingeben muss. | 2 | 1 | Der Speichervorgang wird vom Programm übernommen, ohne dass der Benutzer etwas eingeben muss.
4 | Während der potentiellen Wartezeit des Komprimiervorgangs soll der Kunde über die Aktion (also, dass das Programm komprimiert) informiert werden, damit er weiss, was das Programm macht. | 5 | 2 | Sobald eine Wartezeit entsteht, weil das Programm Daten verarbeitet, wird das mit einer «Progress Bar» angezeigt.
5 | Der Kunde soll eine Meldung auf dem Bildschirm erhalten, sobald der Komprimiervorgang abgeschlossen ist, damit der Kunde eine Bestätigung hat, dass seine Bilder komprimiert wurden. | 1 | 3 | Die Meldung soll kurz formuliert sein, aber klar vermitteln, dass der Komprimierungsvorgang abgeschlossen ist.
6 | Der Kunde soll die Komprimierungsgröße frei wählen können, um so mehrere Abstufungen der Komprimierung zu haben. | 1 | 1 | Es müssen 3 verschiedene Komprimierungsstufen zur Auswahl stehen, die der Kunde über einen Button anwählen kann.
7 | Der Kunde soll die Komprimierungsgröße frei wählen können, um so mehrere Abstufungen der Komprimierung zu haben. | 3 | 4 | Es müssen 3 verschiedene Komprimierungsstufen zur Auswahl stehen, die der Kunde über einen Button anwählen kann.
8 | Die Applikation soll eine Sprachauswahl beinhalten, damit sie für deutschsprachige sowie englischsprachige Benutzer einfach zu verstehen ist. | 5 | 4 | Auf dem Startfenster der Applikation soll der Kunde über einen Button die Sprache Deutsch oder Englisch auswählen können.

## Releaseplan

User Story | Release 1 | Release 2 | Release 3
-----------|-----------|-----------|----------
1 | X | |
2 | X | |
3 | | X |
4 | | X |
5 | | | X
6 | | | X
7 | | | X
8 | | | X


#### Kommentar zum Releaseplan

Der 3. Release kam nicht zu Stande, da wir für die beiden ersten Sprints mehr Zeit als erwartet benötigten. Vor allem die Komprimierung selbst und die Progress Bar erwiesen sich als zeitintensiver als erwartet. So werden die geplanten Storys zu unseren Zielen, die wir in einem darauffolgenden Projekt weiter ausbauen wollen.


## Sprint 1


#### Taskliste

Nr. | Task | User Story | Zeit Schätzung in h
----|------|------------|--------------------
1 | Bilder einlesen | 1 | 2
2 | Alle Bilder zum Komprimieren in Arraylist auflisten | 1 | 0,5
3 | Komprimierung der Bilddatei | 1 | 6
4 | Drag and Drop Bereich erstellen (2.Scene) | 2 | 1,5
5 | 2 Buttons und Label erstellen (2.Scene) | 2 | 0,5
6 | Zählerfunktion erstellen (2.Scene) | 2 | 1
7 | Start-Button (1.Scene)  | 2 | 1


#### Anreicherung der User Stories

#### Klassen- und Sequenzdiagramm

###### Klassendiagramm

![](https://github.com/atorha/CompressionProject/blob/master/Images/Class_Diagramm.JPG)

###### Sequenzdiagramm

#### Dokumentation wichtiger Code Snipplets

###### JUnit Test - Komprimierung

![](https://github.com/atorha/CompressionProject/blob/master/Images/Code_Snipplet_JUnit.jpg)

Das Code Snippet (oberhalb) zeigt einen Teil des Codes aus dem JUnit-Test, um zu testen, ob die Bilddateien komprimiert wurden. Der Test unterscheidet kleine (small) Bilder und grosse (big) Bilder, dabei ist die Pixelanzahl entscheidend, ob das Bild klein oder gross ist. Wenn das Bild weniger als 1080 Pixel (1080 Pixel = full HD Auflösung) hat, ist es klein und wird nicht komprimiert. Die Idee dahinter ist, dass die Bilder nicht zu stark komprimiert werden und dann irgendwann eine schlechte Qualität bekommen. Für den Test haben wir ein kleines und ein grosses Bild genommen und dieses mit unserem Programm komprimiert und dann über den Dateipfad in den Test eingelesen.  Beim ersten Test wird geprüft, ob das kleine Bild nicht komprimiert wird, weil es ja zu klein zum Komprimieren ist. Beim zweiten Test wird geprüft, ob das Bild komprimiert wird. Diese Tests werden mit Hilfe von «assertEquals» gemacht. Dabei wird geprüft, ob das erwartete Ergebnis mit dem Programmoutput übereinstimmt.


###### Neuer Ordner für komprimierte Bilder

![](https://github.com/atorha/CompressionProject/blob/master/Images/Code_Snipplet_New_Folder.JPG)

Die Klasse createFolder() erstellt einen neuen Ordner auf dem Desktop des Benutzers. Dazu wird das Home-Verzeichnis des Benutzers bestimmt und der Pfad für den Desktop mit der Funktion File.separator definiert. Danach wird diesem Pfad der Ordnername «Compressed Images Datum» hinzugefügt. Das aktuelle Datum wird am Anfang der Methode bestimmt. Als letztes wird eine Datei mit dem neuen Pfad erstellt und mit dem Befehl mkdirs() der Ordner im Ziel des Pfades hergestellt. Der Pfad des neuen Ordners wird von der Methode für weitere Zwecke übergeben. 


###### Bild komprimieren und neuer Bildname

![](https://github.com/atorha/CompressionProject/blob/master/Images/Code_Snipplet_Compress_1.jpg)

Das obige Code-Snippet aus der Klasse «compress.java» zeigt, wie der Pfad des hinzugefügten Bildes, sowie der Ordner, der für die Komprimierung neu angelegt wird, der Methode «compress()» als Konstruktor hinzugefügt wird. Aus dem Pfad des hinzugefügten Bildes wird der Name des Bildes ausgelesen. Es wird daraufhin ein neuer Dateiname für das zu komprimierende Bild nach dem Format [«alter Dateiname» + «_compr»] generiert. 

![](https://github.com/atorha/CompressionProject/blob/master/Images/Code_Snipplet_Compress_2.jpg)

Dieses Code-Snippet zeigt, wie das eingelesene Bild komprimiert und danach im neu generierten Ordner mit dem neu generierten Dateinamen abgespeichert wird. Es wird dabei zuerst die Höhe und Breite des Bildes ausgelesen. Falls die Höhe des Bildes unterhalb der doppelten Full-HD Auflösung liegt, wird das Bild nicht komprimiert, da die Bildqualität ansonsten nicht auf einem akzeptablen Niveau wäre. Wenn die Bildhöhe grösser als 2160 Pixel ist, wird das Bild im weiteren Verlauf komprimiert. Dabei wird die Bildhöhe halbiert und das Bild entsprechend skaliert. Das komprimierte Bild besitzt damit immer eine Auflösung, die mindestens der Full-HD Auflösung entspricht. Danach wird das komprimierte Bild generiert. Das neue Bild wird danach als «jpeg» Datei im neu generierten Ordner auf dem Desktop unter dem neuen Bildnamen abgelegt. Es existieren weitere Konstruktoren, die erweiterte Funktionalitäten beim nächsten Release bieten werden. So soll für professionellere Anwender die Möglichkeit geschaffen werden, das Bild nach einer genauen Eingabe der Pixel oder nach der maximal erwünschten Dateigrösse zu komprimieren. 

#### Testfälle


## Bedienungsanleitung

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_1.jpg)

Das Programm ermöglicht das Komprimieren von Bildern. Beim Komprimieren wird die Bildgröße halbiert. Dies ist nützlich, wenn beispielsweise mehrere Bilder per Email versandt werden sollen.
Um das Programm zu starten, drücken Sie auf den Button «Loslegen».

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_2.jpg)
![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_6.JPG)

Durch das drücken des «Loslegen» Buttons öffnet sich ein neues Fenster. Ziehen Sie mit Hilfe von Drag-and-Drop alle Bilder, die Sie komprimieren wollen, in das Feld in der Mitte des Fensters. (Drag-and-Drop: Bilder auswählen und mit der Maus ins Fenster ziehen) Falls Sie das gleiche Bild mehrmals in das Fenster ziehen, erscheint eine Fehlermeldung. In der Fehlermeldung werden Sie gefragt, ob Sie das Bild tatsächlich ein zweites Mal hinzufügen und komprimieren wollen.

![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_3.jpg)

Nachdem die ersten Bilder in das Fenster gezogen worden sind, wird angezeigt wie viele Bilder zum komprimieren vorliegen. Falls noch weitere Bilder komprimiert werden sollen, kann man diese weiterhin in das Fenster ziehen. Sobald Sie alle Ihre Bilder in das Fenster gezogen haben, können sie auf den «OK» Button drücken, um den Komprimierprozess zu starten. Durch den «Cancel» Button können Sie das Programm beenden, ohne dass die Bilder komprimiert werden.
![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_4.jpg) ![](https://github.com/atorha/CompressionProject/blob/master/Images/bedienungsanleitung_5.jpg)

Wenn Sie auf «OK» gedrückt haben, werden die Bilder komprimiert. Dabei wird Ihnen anhand eines Ladebalkens angezeigt, wie weit das Programm mit dem komprimieren ist.
Die komprimierten Bilder werden nach dem Komprimieren in einem neuen Ordner auf dem Desktop gespeichert. Der neue Ordner ist folgendermaßen benannt «Compressed Images YYYY.MM.DD». Die komprimierten Bilder haben den ursprünglichen Dateinamen übernommen, jedoch wird das Kürzel «_compr» angehängt, damit erkannt werden kann, dass es sich dabei um die komprimierten Bilder handelt.


ArrayList<String> links = new ArrayList<String>();
	public Main main;

	public void setMain(Main main) {
		this.main=main;
