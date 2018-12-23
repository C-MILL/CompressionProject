# **Java Bildkompression**


## Inhaltsverzeichniss

1. [Einleitung](#einleitung)
2. [Zielsetzung](#zielsetzung)
3. [Randbedingung](#randbedingung)
4. [Build-Anleitung](#build-anleitung)
5. [User Stories](#user-stories)
6. [Releaseplan](#releaseplan)
7. [Sprint 1](#sprint-1)
    + 7.1. [Taskliste](#taskliste)
    + 7.2. [Anreicherung der User Stories](#anreicherung-der-user-stories)
    + 7.3. [Dokumentation wichtiger Code Snipplets](#dokumentation-wichtiger-code-snipplets)
    + 7.4. [Testfälle](#testfälle)
8. [Sprint 2](#sprint-1)
    + 8.1. [Taskliste](#taskliste)
    + 8.2. [Anreicherung der User Stories](#anreicherung-der-user-stories)
    + 8.3. [Klassen- und Sequenzdiagramm](#klassen--und-sequenzdiagramm)
    + 8.4. [Dokumentation wichtiger Code Snipplets](#dokumentation-wichtiger-code-snipplets)
    + 8.5. [Testfälle](#testfälle)
9. [Bedienungsanleitung](#bedienungsanleitung)
10. [Fazit](#fazit)


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
1 | Der Kunde soll die Applikation zur Komprimierung von Bildern intuitiv bedienen können, damit er Zeit spart beim Komprimieren von Dateien. | 5 | 1 | Es sollen nicht mehr als drei Buttons auf einer Seite verwendet werden. Die Buttons sollen beschriftet sein, um eine intuitive 
2 | Der Kunde soll alle Fotos einfach in ein Fenster ziehen können und das Programm soll dabei automatisch erkennen welche Fotos behandet werden können und welche nicht. Der Nutzer soll dabei über fehler benachrichtigt werden. DAbei soll ihm angezeigt werden was nicht gut ist und mit welcher Datei etwas nicht stimmt. | 13 | 1 | Dateien Können üer Drag and Drop fenster ausgewählt werden und das Programm muss automatisch erkennen welche Dateien fehlerhaft sind.
3 | Der nutzer soll kleinere Dateien mit immer noch akzeptabler Qualität erhalten, ohne sich selber Gedanken zur Bildgrösse zu machen. | 8 | 1 | Die Komprimierten Dateien müssen kleiner sein als die Originale.
4 | Die Bilddateien sollen direkt auf den Desktop gespeichert werden, damit der Benutzer keinen Dateipfad eingeben muss. | 8 | 1 | Der Speichervorgang wird vom Programm übernommen, ohne dass der Benutzer etwas eingeben muss.
5 | Während der potentiellen Wartezeit des Komprimiervorgangs soll der Kunde über die Aktion (also, dass das Programm komprimiert) informiert werden, damit er weiss, was das Programm macht. | 8 | 2 | Sobald eine Wartezeit entsteht, weil das Programm Daten verarbeitet, wird das mit einer «Progress Bar» angezeigt.
6 | Der Kunde soll eine Meldung auf dem Bildschirm erhalten, sobald der Komprimiervorgang abgeschlossen ist, damit der Kunde eine Bestätigung hat, dass seine Bilder komprimiert wurden. | 5 | 3 | Die Meldung soll kurz formuliert sein, aber klar vermitteln, dass der Komprimierungsvorgang abgeschlossen ist.
7 | Der Kunde soll die Komprimierungsgröße frei wählen können, um so mehrere Abstufungen der Komprimierung zu haben. | 3 | 4 | Es müssen 3 verschiedene Komprimierungsstufen zur Auswahl stehen, die der Kunde über einen Button anwählen kann.
8 | Die Applikation soll eine Sprachauswahl beinhalten, damit sie für deutschsprachige sowie englischsprachige Benutzer einfach zu verstehen ist. | 5 | 4 | Auf dem Startfenster der Applikation soll der Kunde über einen Button die Sprache Deutsch oder Englisch auswählen können.

## Backlog
Story 1 | Grundgerüst erstellen für eine Übersichtliche Oberfläche  | Zeitschätzung
----|------|--------------------
1.1 | Ordnerstruktur erstellen mit Maven. | 15min
1.2 | Grundstruktur des Programmes schreiben, main-JavaFx klasse erstellen. | 15min
1.3 | Willkommen Fenster mit Scene Builder gestalten. | 15min
1.4 | Die Controller Klasse für das Willkommenfenster erstellen. | 30min
1.5 | Im Controller einen WeiterButton erstellen der die nächste Scene startet. | 15min

Story 2 | Schritte um das DragAndDrop Fenster zu realisieren  | Zeitschätzung
----|------|--------------------
2.1 | Ein DragANdDrop Fenster gestalten mit SceneBuilder. | 30min
2.2 | Der DragAndDropController erstellen der alle Drops in ein Array schreibt. | 60min
2.3 | Mit SceneBuilder ein Fenster erstellen welches für die Fehlermeldungen individuell genutzt werden kann. und welches man über einfache handles ändern und anpassen kann. | 30min 
2.4 | Eine Controller Klasse für die Fehlermeldungen schreiben. Darin soll man über eine Methode die Nachricht des fehlers ändern können. Die Klasse soll einen boolean zurückgeben.
2.5 | Im DragAndDropController die Links auf nichtunterstützte Formate untersuchen und diese ausfiltern. Falls es nicht unterstützte Dateien gibt, soll der Nutzer informiert werden über das Fehlerfenster. | 60min
2.6 | Im DragAndDropController die Links auf doppelgänger Untersuchen und diese aussortieren. Falls es Doppelgänger gibt soll der Nutzer über das Fehlerfenster darauf aufmerksam gemacht werden und entscheiden können ob er die Datei trotzdem hinzufügen will oder nicht.| 4 | 60min
2.7 | Im DragAndDropController die verbleibenden Links in eine ArrayList stecken. | 15min
2.8 | Im DragAndDropController den Button so einrichten dass er die Links in die Main-Klasse speichert und die nächste Scene startet. | 30min 

Story 3 | Tasks um die Komprimierung realisieren | Zeitschätzung
----|------|--------------------
3.1 | Eine Klasse erstellen an die ein Link eines Fotos sowie der Link des Desktop-Ornders weitergegeben werden kann für die komprimierung. Darin soll eine Methode gerufen werden die über den Link das Foto ladet, die Auflösung anpasst und das Bild komprimiert sowie in den erstellten Ordner auf dem Desktop abspeichert. | 6-Stunden 
3.2 | JUnit Klasse machen um zu testen ob das Bild tatsächlich kleiner geworden ist. | 2Stunden
3.3 | JUnit Klasse machen um zu testen ob die Auflösung richtig angepasst wird. | 2Stunden 

Story 4 | Tasks um die Abspeicherung auf dem Desktop zu realisieren | Zeitschätzung
----|------|--------------------
4.1 | Eine Weitere Klasse erstellen die auf dem Desktop einen Ordner erstellt in dem die komprimierten Dateien abgelegt werden können. Die Klasse soll eine Methode haben die den Ordner erstellt und den Link des Ordners zurückgibt. | 4-Stunden

Story 5 | Tasks für die Fortschrittanzeige  | Zeitschätzung
----|------|--------------------
5.1 | Mit Scene Builder ein Fenster erstellen der den Fortschritt der Komprimierung anzeigt. Dafür soll es einen Ladebalken geben und ein schriftliche Information die anzeigt wie viele Fotos bereits komprimiert worden sind. | 30min
5.2 | Controllerklasse für die Fortschrittseite erstellen. Sie soll sich automatisch aktualisieren sobald ein Bild komprimiert wurde. | 30min

Story 6 | Taks für das Ende des Programmes | Zeitschätzung
----|------|--------------------
6.1 | Einen Button machen auf der Progressseite der "Fertig" heisst und den man erst Drücken kann wenn alle Fotos komprimiert wurden. | 30min

Story 7 | Taks für frei wählbare Komprimeirungsgrösse | Zeitschätzung
----|------|--------------------
7.1 | Ein Fenster mit SceneBuilder erstellen, wobei 3 Buttons mit den ver. Komprimierungsstufen vorhanden sind. | 30min
7.2 | Komprimierfunktionen hinter den Buttons erstellen (analog zur Komprimierung von vorher). | 2-Stunden
7.3 | Einen Button mit SceneBuilder erstellen, damit zum DragANdDrop Fensert kommmt, um dann die Bilder rein zu ziehen. | 30min
7.4 | Controllerklasse für das Fenster mit den ver. Komprimierungsgrössen erstellen. | 30min
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


## Sprints
### Sprint-Conditions
Wir haben unsere Sprint's auf jeweils **fünf Stunden** festegelegg. Die Sprints werden von jedem Mitglied **individuell** durchgeführt. Das **Sprint Planning Meeting** wird somit anfangs woche, das **Daily Scrum Meeting** in der Wochenmitte und der **Sprint Review** am Freitag durchgeführt. Dies macht insofern Sinn da teilweise dependencies bestehen zwischen den verschiedenen Klasen und die Mitglieder auch nich alle zur selben Zeit frei haben für die Sprints. Wir schätzen unser Team kann jeweils 20 Story-Points behandeln pro Sprint. Dies ergibt 5 Storypoints pro Teammitglied. Da wir die Aufgaben gerne indiviudell machen würden, ist es unser Ziel die Stories in möglichst kleine Packete zu verpacken damit der Aufwand möglichst klein und im Zeitraum eines Sprints zu erledigen ist. 

### Sprint 1
#### Sprint 1 Planning Meeting
Da wir pro Sprint 20 Punkte verarbeiten können was zwanzig Stunden entspricht. Für den ersten Sprint haben wir uns aber etwas weniger eingeteilt um zu sehen wie die Zeit aufgeht. Wir erwarten dass die Zeiten zwar stimmen, dass aber zwischen den wirklichen arbeitszeiten noch viele Stunden verloren gehen werden mit absprechen sowie Merge problemen. Deshalb beeinhaltet der erste Sprint einen Workload von etwas weniger wie 17 Stunden.

Tasknummer| Taksbezeichnung | Zeitschätzung
----|------|--------------------
1.1 | Ordnerstruktur erstellen mit Maven. | 20min
1.2 | Grundstruktur des Programmes schreiben, main-JavaFx klasse erstellen. | 20min
1.3 | Willkommen Fenster mit Scene Builder gestalten. | 20min
1.4 | Die Controller Klasse für das Willkommenfenster erstellen. | 40min
1.5 | Im Controller einen WeiterButton erstellen der die nächste Scene startet. | 40min
2.1 | Ein DragANdDrop Fenster gestalten mit SceneBuilder. | 40min
2.2 | Der DragAndDropController erstellen der alle Drops in ein Array schreibt. | 80min
2.7 | Im DragAndDropController die verbleibenden Links in eine ArrayList stecken. | 20min
2.8 | Im DragAndDropController den Button so einrichten dass er die Links in die Main-Klasse speichert und die nächste Scene startet. | 40min 
3.1 | Eine Weitere Klasse erstellen die auf dem Desktop einen Ordner erstellt in dem die komprimierten Dateien abgelegt werden können. Die Klasse soll eine Methode haben die den Ordner erstellt und den Link des Ordners zurückgibt. | 4Stunden
4.1 | Eine Klasse erstellen an die ein Link eines Fotos sowie der Link des Desktop-Ornders weitergegeben werden kann für die komprimierung. Darin soll eine Methode gerufen werden die über den Link das Foto ladet, die Auflösung anpasst und das Bild komprimiert sowie in den erstellten Ordner auf dem Desktop abspeichert. | 6Stunden
6.1 | Einen Button machen auf der Progressseite der "Fertig" heisst und den man erste Drücken kann wenn alle Fotos komprimiert wurden. | 40min
7.1 | Einen Button machen auf der Progressseite der "Fertig" heisst und den man erste Drücken kann wenn alle Fotos komprimiert wurden. | 40min
 |         | Total: 16h 40min

#### Sprint 1 Review
Wir konnten im ersten Sprint tatsächlich alle Tasks erfüllen. Man muss aber  sagen dass die geschätzten Zeiten IMMER überschritten wurde und jedes Teammitglied überstunden machen musste. Somit ist die ToDo Liste des ersten Sprints nun eine Done Liste. 

### Sprint 2
#### Updated Backlog
Story 2 | Schritte um das DragAndDrop Fenster zu realisieren  | Zeitschätzung
----|------|--------------------
2.3 | Mit SceneBuilder ein Fenster erstellen welches für die Fehlermeldungen individuell genutzt werden kann. und welches man über einfache handles ändern und anpassen kann. | 30min 
2.4 | Eine Controller Klasse für die Fehlermeldungen schreiben. Darin soll man über eine Methode die Nachricht des fehlers ändern können. Die Klasse soll einen boolean zurückgeben.
2.5 | Im DragAndDropController die Links auf nichtunterstützte Formate untersuchen und diese ausfiltern. Falls es nicht unterstützte Dateien gibt, soll der Nutzer informiert werden über das Fehlerfenster. | 60min
2.6 | Im DragAndDropController die Links auf doppelgänger Untersuchen und diese aussortieren. Falls es Doppelgänger gibt soll der Nutzer über das Fehlerfenster darauf aufmerksam gemacht werden und entscheiden können ob er die Datei trotzdem hinzufügen will oder nicht.| 4 | 60min 

Story 3 | Tasks um die Komprimierung realisieren | Zeitschätzung
----|------|--------------------
3.1 | Eine Klasse erstellen an die ein Link eines Fotos sowie der Link des Desktop-Ornders weitergegeben werden kann für die komprimierung. Darin soll eine Methode gerufen werden die über den Link das Foto ladet, die Auflösung anpasst und das Bild komprimiert sowie in den erstellten Ordner auf dem Desktop abspeichert. | 6-Stunden 
3.2 | JUnit Klasse machen um zu testen ob das Bild tatsächlich kleiner geworden ist. | 2Stunden
3.3 | JUnit Klasse machen um zu testen ob die Auflösung richtig angepasst wird. | 2Stunden 

Story 4 | Tasks um die Abspeicherung auf dem Desktop zu realisieren | Zeitschätzung
----|------|--------------------
4.1 | Eine Weitere Klasse erstellen die auf dem Desktop einen Ordner erstellt in dem die komprimierten Dateien abgelegt werden können. Die Klasse soll eine Methode haben die den Ordner erstellt und den Link des Ordners zurückgibt. | 4-Stunden

Story 5 | Tasks für die Fortschrittanzeige  | Zeitschätzung
----|------|--------------------
5.1 | Mit Scene Builder ein Fenster erstellen der den Fortschritt der Komprimierung anzeigt. Dafür soll es einen Ladebalken geben und ein schriftliche Information die anzeigt wie viele Fotos bereits komprimiert worden sind. | 30min
5.2 | Controllerklasse für die Fortschrittseite erstellen. Sie soll sich automatisch aktualisieren sobald ein Bild komprimiert wurde. | 30min

Story 6 | Taks für das Ende des Programmes | Zeitschätzung
----|------|--------------------
6.1 | Einen Button machen auf der Progressseite der "Fertig" heisst und den man erste Drücken kann wenn alle Fotos komprimiert wurden. | 30min

Story 7 | Taks für das Ende des Programmes | Zeitschätzung
----|------|--------------------
7.1 | Einen Button machen auf der Progressseite der "Fertig" heisst und den man erste Drücken kann wenn alle Fotos komprimiert wurden. | 30min

#### Sprint 2 Planning Meeting
Da wir pro Sprint 20 Punkte verarbeiten können was vierundzwanzig Stunden entspricht haben wir uns 

#### Sprint 2 Review

###### JUnit Test - Komprimierung

```ruby
	@Test
	public void testCompressResolutionResizingToSmallResolution() throws IOException { 
		try {
			new compress(linkOfSmallFile, "./src/test/resources/testCompressed");
			smallImage= new ImageIcon(ImageIO.read(new File(linkOfSmallFile))).getImage();
			smallCompressedImage  = new ImageIcon(ImageIO.read(new File(linkOfSmallCompressedFile))).getImage();
			assertEquals(smallImage.getHeight(null), smallCompressedImage.getHeight(null), "The small images got compressed, even though they should not get compressed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testCompressResolutionResizingBigFile() throws IOException { 
		try {
			new compress(linkOfBigFile, "./src/test/resources/testCompressed");
			bigImage= new ImageIcon(ImageIO.read(new File(linkOfBigFile))).getImage();
			bigCompressedImage  = new ImageIcon(ImageIO.read(new File(linkOfBigCompressedFile))).getImage();
			assertEquals(bigImage.getHeight(null)/2, bigCompressedImage.getHeight(null), "The small images got compressed, even though they should not get compressed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
```

Das Code Snippet (oberhalb) zeigt einen Teil des Codes aus dem JUnit-Test, um zu testen, ob die Bilddateien komprimiert wurden. Der Test unterscheidet kleine (small) Bilder und grosse (big) Bilder, dabei ist die Pixelanzahl entscheidend, ob das Bild klein oder gross ist. Wenn das Bild weniger als 1080 Pixel (1080 Pixel = full HD Auflösung) hat, ist es klein und wird nicht komprimiert. Die Idee dahinter ist, dass die Bilder nicht zu stark komprimiert werden und dann irgendwann eine schlechte Qualität bekommen. Für den Test haben wir ein kleines und ein grosses Bild genommen und dieses mit unserem Programm komprimiert und dann über den Dateipfad in den Test eingelesen.  Beim ersten Test wird geprüft, ob das kleine Bild nicht komprimiert wird, weil es ja zu klein zum Komprimieren ist. Beim zweiten Test wird geprüft, ob das Bild komprimiert wird. Diese Tests werden mit Hilfe von «assertEquals» gemacht. Dabei wird geprüft, ob das erwartete Ergebnis mit dem Programmoutput übereinstimmt.


###### Neuer Ordner für komprimierte Bilder

```ruby

public class createNewFolder {

	public String createFolder() {
		String linkOfNewFolder = null;

		try {

			// Gets todays Date
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			LocalDateTime today = LocalDateTime.now();


			// Gets users home directory and splits it at Desktop
			// Creates new folder with e.g. following path: C:\Users\mkaun\Desktop\Compressed 2018.12.14
			String path = System.getProperty("user.home") + File.separator + "Desktop";
			path += File.separator + "Compressed Images " + dtf.format(today);
			File customDir = new File(path);
			customDir.mkdirs();
			linkOfNewFolder = path.replace("\\","/");
			System.out.println(linkOfNewFolder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linkOfNewFolder;
	}
}

```

Die Klasse createFolder() erstellt einen neuen Ordner auf dem Desktop des Benutzers. Dazu wird das Home-Verzeichnis des Benutzers bestimmt und der Pfad für den Desktop mit der Funktion File.separator definiert. Danach wird diesem Pfad der Ordnername «Compressed Images Datum» hinzugefügt. Das aktuelle Datum wird am Anfang der Methode bestimmt. Als letztes wird eine Datei mit dem neuen Pfad erstellt und mit dem Befehl mkdirs() der Ordner im Ziel des Pfades hergestellt. Der Pfad des neuen Ordners wird von der Methode für weitere Zwecke übergeben. 


###### Bild komprimieren und neuer Bildname

![](https://github.com/atorha/CompressionProject/blob/master/Images/Code_Snipplet_Compress_1.jpg)

Das obige Code-Snippet aus der Klasse «compress.java» zeigt, wie der Pfad des hinzugefügten Bildes, sowie der Ordner, der für die Komprimierung neu angelegt wird, der Methode «compress()» als Konstruktor hinzugefügt wird. Aus dem Pfad des hinzugefügten Bildes wird der Name des Bildes ausgelesen. Es wird daraufhin ein neuer Dateiname für das zu komprimierende Bild nach dem Format [«alter Dateiname» + «_compr»] generiert. 

![](https://github.com/atorha/CompressionProject/blob/master/Images/Code_Snipplet_Compress_2.jpg)

Dieses Code-Snippet zeigt, wie das eingelesene Bild komprimiert und danach im neu generierten Ordner mit dem neu generierten Dateinamen abgespeichert wird. Es wird dabei zuerst die Höhe und Breite des Bildes ausgelesen. Falls die Höhe des Bildes unterhalb der doppelten Full-HD Auflösung liegt, wird das Bild nicht komprimiert, da die Bildqualität ansonsten nicht auf einem akzeptablen Niveau wäre. Wenn die Bildhöhe grösser als 2160 Pixel ist, wird das Bild im weiteren Verlauf komprimiert. Dabei wird die Bildhöhe halbiert und das Bild entsprechend skaliert. Das komprimierte Bild besitzt damit immer eine Auflösung, die mindestens der Full-HD Auflösung entspricht. Danach wird das komprimierte Bild generiert. Das neue Bild wird danach als «jpeg» Datei im neu generierten Ordner auf dem Desktop unter dem neuen Bildnamen abgelegt. Es existieren weitere Konstruktoren, die erweiterte Funktionalitäten beim nächsten Release bieten werden. So soll für professionellere Anwender die Möglichkeit geschaffen werden, das Bild nach einer genauen Eingabe der Pixel oder nach der maximal erwünschten Dateigrösse zu komprimieren. 

#### Testfälle


#### Klassen- und Sequenzdiagramm

###### Klassendiagramm

![](https://github.com/atorha/CompressionProject/blob/master/Images/Class_Diagramm.JPG)

###### Sequenzdiagramm

![](https://github.com/atorha/CompressionProject/blob/master/Images/Sequence_diagram.jpg)

#### Dokumentation wichtiger Code Snipplets

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




## Fazit

Im Rahmen dieser Arbeit konnten die Grundprinzipien der Entwicklungsprogramme Eclipse, Maven und Git erarbeitet und mit einer vertieften Anwendungsbasis von Java verknüpft werden. Das erstellte Programm zur Komprimierung von Bildern hat die ursprünglichen Erwartungen übertroffen. Die Komprimierung von Bildern wurde durch diese Software tatsächlich stark vereinfacht und arbeitet nun kombiniert mit einer grafischen Oberfläche und diversen Sicherheitsfeatures, wie etwa der Dateierweiterungsbegrenzung oder dem Schutz vor duplizierten Dateien zuverlässig. Durch zwei realisierte Sprints konnten die meisten Anforderungen an das Programm bereits implementiert werden. Einige Komponenten des Programms erwiesen sich während der Realisierung als Zeitintensiver als geplant. Vor allem die Möglichkeit zur Anzeige des Programmfortschritts in Form einer Progress Bar gestaltete sich als schwierig, da diese die Implementierung von Threads erforderte. In kommenden Releases werden noch verbliebene Anforderungen an das Programm hinzugefügt. Wichtigste Neuerungen werden sein, dass das Programm auf allen Betriebssystemen lauffähig sein wird, dass die Sprache zwischen Englisch, Französisch und Deutsch gewechselt werden kann und dass die Komprimierungsgrösse nach entsprechenden Kriterien frei wählbar sein wird.

Wir möchten uns an dieser Stelle ganz herzlich bei unserem Betreuer, Matthias Bachmann, bedanken für die kontinuierliche Hilfeleistungen und im Besonderen für seine nützlichen Inputs zur Erstellung von Threads. 

Mit unserer Arbeit sind wir zufrieden, da das Programm tatsächlich Gebrauch findet und einen erheblichen Mehrwert darstellt bei unserer Zielgruppe, die ansonsten nicht von einer einfachen Bildkomprimierung profitieren könnte. Durch das Arbeiten in einem Team konnten wir uns in die Sichtweise der Programmierer grosser Softwares versetzen und haben auch verstanden, inwiefern User Stories, Tasks und Sprints zu einem effizienteren Arbeiten gemäss Software Engineering beitragen können. 


