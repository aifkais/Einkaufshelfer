import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Einkaufshelfer3 {
    
	
	private int s1 = 0; //step
	private int c1 = 0; //counter
	private int sk = 0; //skip
	private int st = 0; // 
	private int gp = 0;
	private String test = "";
	private String test2 = "";
	private boolean tb = true;

    public static void main(String[] args) throws IOException {
    	
    	
    	
        Einkaufshelfer3 e1 = new Einkaufshelfer3();
        ArrayList<ArrayList<Verkaeufer>> a1 = new ArrayList<>(); 
        ArrayList<ArrayList<Verkaeufer>> a5 = new ArrayList<>(); //Doppelte Einträge werden zusammengefügt
        ArrayList<ArrayList<Verkaeufer2>> a9 = new ArrayList<>();
        
        ArrayList <String>fileList = new ArrayList<>();
        ArrayList <Integer>intList = new ArrayList<>();
        
        fileList.add("file3.txt");
        
        for(int i = 0 ; i<fileList.size(); i++) {
        	intList.add(fileList.size());
        	a1.add(null);
        	System.out.println(fileList.size());
        }
        
        e1.checkncard(a1, a5,a9,fileList,intList);
        
    
  
        

    }
    
    
    public void checkncard( ArrayList<ArrayList<Verkaeufer>> a1,ArrayList<ArrayList<Verkaeufer>> a5,ArrayList<ArrayList<Verkaeufer2>> a9
    		,ArrayList<String> file, ArrayList <Integer> n) {
    	scantxt3(a1,file);
    	//printV(a1);
    	System.out.println(a1.size());
    	
    	createList3(a1,a9);
    	printV3(a9);
    	//filter(3, a5);
    	filtIt3(a9,n);
    	System.out.println();
    	printV3(a9);
    	
    	sortIt3(a9,n);
    	System.out.println();
    	printV3(a9);
    	
    	
    	//sortit(a5, 3);
    	//printV2(a5);
    }
    
    public void printV3(ArrayList<ArrayList<Verkaeufer2>> a9) {
        for (ArrayList<Verkaeufer2> innerList : a9) { // Durch jede innere Liste iterieren
            for (Verkaeufer2 v2 : innerList) { // Über die Verkaeufer2-Objekte iterieren
                System.out.println("Name: " + v2.getName());
                System.out.println("Preisliste: " + v2.getPreisliste());
                System.out.println(); // Leerzeile für bessere Lesbarkeit
            }
        }
    }
    
    
   public void sortIt3 (ArrayList<ArrayList<Verkaeufer2>> a9,ArrayList <Integer> n) {
    	
    	for(int i = 0; i<a9.size(); i++){
    		//sortIt()
    	}
    	
    }
    
    public void sortIt(ArrayList<Verkaeufer2> a9, ArrayList <Integer> n) {
        //a9.sort(Comparator.comparingInt(v -> sumFirstN(v.getPreisliste(), anzahlKarten)));
    }
    
    
   public void filtIt3 (ArrayList<ArrayList<Verkaeufer2>> a9,ArrayList <Integer> n) {
    	
    	for(int i = 0; i<a9.size(); i++){
    		filtIt(a9.get(i),n.get(i));
    	}
    	
    }
   
   
    public void filtIt(ArrayList<Verkaeufer2> a9, int anzahlKarten) {
        Iterator<Verkaeufer2> iterator = a9.iterator();

        while (iterator.hasNext()) {
            Verkaeufer2 verk = iterator.next();
            if (verk.getPreisliste().size() < anzahlKarten) {
                iterator.remove();  // Sicheres Entfernen während der Iteration
            }
        }
    }
    
    
    public void createList3 (ArrayList<ArrayList<Verkaeufer>> a1,ArrayList<ArrayList<Verkaeufer2>> a9) {
    	
    	for(int i = 0; i<a1.size(); i++){
    		createList(a1.get(i),a9.get(i));
    	}
    	
    }
    public void createList(ArrayList<Verkaeufer> a1, ArrayList<Verkaeufer2> a2) {
        System.out.println(a1.size());

        ArrayList<String> tempNameList = new ArrayList<>();
        ArrayList<ArrayList<Double>> preislisten = new ArrayList<>();

        // 1. Namen sammeln und Preisliste initialisieren
        for (Verkaeufer verk : a1) {
            String name = verk.getName();
            if (!tempNameList.contains(name)) {
                tempNameList.add(name);
                preislisten.add(new ArrayList<>()); // Initialisiere Preisliste
            }
            // 2. Füge Preis zum entsprechenden Verkäufer hinzu
            int index = tempNameList.indexOf(name);
            preislisten.get(index).add(verk.getPreis());
        }

        // 3. Erstelle Verkaeufer2-Objekte und füge sie zur Liste hinzu
        for (int i = 0; i < tempNameList.size(); i++) {
            a2.add(new Verkaeufer2(tempNameList.get(i), preislisten.get(i)));
        }
    }
    public void scantxt3(ArrayList<ArrayList<Verkaeufer>> a1,ArrayList<String> file) {
    	
    	for(int i = 0; i<file.size(); i++){
    		scantxt(a1.get(i),file.get(i));
    	}
    	
    }
    
    public void check1card( ArrayList<Verkaeufer> a1,ArrayList<ArrayList<Verkaeufer>> a5,ArrayList<Verkaeufer2> a9 ,String file) {
    	scantxt(a1,file);
    	printV(a1);
    	System.out.println(a1.size());
    	
    	createList(a1,a9);
    	printV3(a9);
    	//filter(3, a5);
    	filtIt(a9,2);
    	System.out.println();
    	printV3(a9);
    	
    	sortIt(a9,2);
    	System.out.println();
    	printV3(a9);
    	
    	
    	//sortit(a5, 3);
    	//printV2(a5);
    }
    

    
    public void showCommon2(ArrayList<ArrayList<Verkaeufer2>>a0,ArrayList<Verkaeufer2> a11,ArrayList<ArrayList<Verkaeufer2>>a12) {
    	
    	for(int i = 0; i<6; i++) {
    		
    	}
    	
    }
    
    public void showCommon(ArrayList<Verkaeufer2> a9,ArrayList<Verkaeufer2> a10,ArrayList<Verkaeufer2> a11) {
    	
    	for(int i = 0; i<a9.size(); i++) {
    		
    	}
    	
    }
    

    


    // Hilfsmethode zur Berechnung der Summe der ersten N Zahlen
    private int sumFirstN(ArrayList<Double> list, int n) {
        int sum = 0;
        for (int i = 0; i < Math.min(n, list.size()); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    // ArrayList hat mehrere Einträge mit den selben Namen.
    //assemble fusioniert jede 
    public void assemble(ArrayList<ArrayList<Verkaeufer>> a1, ArrayList<Verkaeufer> a2) {
        // Iteriere über jeden Verkäufer in der Liste a2
    	
        for (Verkaeufer verkaeufer : a2) {
            boolean found = false;

            // Überprüfe, ob es bereits eine Liste für den Verkäufer mit demselben Namen in a1 gibt
            
            for (ArrayList<Verkaeufer> liste : a1) {
                // Wenn ein Verkäufer mit demselben Namen gefunden wird, füge ihn zur bestehenden Liste hinzu
            	test =liste.get(0).getName();
            	test2 = verkaeufer.getName();
            	tb = liste.get(0).getName().equals(verkaeufer.getName());
            	
                if (!liste.isEmpty() && liste.get(0).getName().equals(verkaeufer.getName())) {
                    liste.add(verkaeufer);
                    found = true;
                    break;
                }
            }

            // Falls keine Liste mit demselben Namen existiert, erstelle eine neue und füge den Verkäufer hinzu
            if (!found) {
                ArrayList<Verkaeufer> neueListe = new ArrayList<>();
                neueListe.add(verkaeufer);
                a1.add(neueListe);
            }
        }
    }

    
    public void hightlight(ArrayList<ArrayList<Verkaeufer>> a1,ArrayList<ArrayList<Verkaeufer>> a2) {
    	int anzahl = 0;
    	ArrayList<String> names = new ArrayList<>();
    	
    	for(int i = 0; i<a1.size(); i++){
    		
    		names.add(a1.get(i).get(0).getName());
    	}
    	for(int i = 0; i<a2.size(); i++){
    		names.add(a2.get(i).get(0).getName());
    	}
    	
        for(int i = 0; i<a1.size();i++) {
        	for(int e = 0; e<a1.get(i).size();e++) {
        		anzahl += a1.get(i).get(0).getStueckzahl();
        	}
        	System.out.print(a1.get(i).get(0).getName()+" ");
        	System.out.println(anzahl);
        	anzahl = 0;
        }
    }
    
    public void printV2(ArrayList<ArrayList<Verkaeufer>> a1) {
    	System.out.println(a1.size());
    	
    	for(int i = 0; i<a1.size();i++) {
    		for(int e = 0; e<a1.get(i).size();e++) {
    			System.out.print(a1.get(i).get(e).getName()+" ");
    			System.out.print(a1.get(i).get(e).getStueckzahl()+" ");

    			System.out.print(a1.get(i).get(e).getPreis()+" ");
    			System.out.println();
    			
    			
    		}
    	}
    }
    
    



    
    public void createList2(ArrayList<ArrayList<Verkaeufer>> a1,ArrayList<Verkaeufer2> a2 ) {
    	System.out.println(a1.size());
    	
    	for(int i = 0; i <a1.size(); i++) {
    		for(int e = 0; e<a2.size(); e++) {
    			if(!(a2.get(e).getName().equals(a1.get(i).get(0).getName()))) {
    				a2.add(new Verkaeufer2(a2.get(e).getName(),new ArrayList<Double>()));
    			}
    			
    			for( int a = 0;a< a2.size(); a++) {
    				for(int u = 0 ; u< a1.get(i).size(); u++) {
            				if(a2.get(a).getName().equals(a1.get(i).get(0).getName())){
            					a2.get(a).getPreisliste().add(a1.get(i).get(0).getPreis());
    					
    				}

    			}
    		}
    	}
    	}

    }
    

    
    //sortiert ArrayList nach besten Preis. Abhängig vom Preis und Stückzahl des Händler
    public void sortit(ArrayList<ArrayList<Verkaeufer>> a1,int mind) {
    	//boolean changed = false;
    	double cost = 0;
    	//int count = 0;
    	//TreeMap<Integer, Double> tm = new TreeMap<>();
    	ArrayList<Double> sa = new ArrayList<>();
    	ArrayList<Double> sa2 = new ArrayList<>();
    	
    	for(int i = 0; i<a1.size(); i++) {
    		
    		for(int e = 0; e<a1.get(i).size(); e++) {

    			for(int f = 0 ; f<a1.get(i).get(e).getStueckzahl();f++) {
    				sa.add(a1.get(i).get(e).getPreis());
    			}
    			
    		}
    		for(int g = 0; g<mind;g++) {
    			cost+=sa.get(g);
    		}
    		sa2.add(cost);
    		cost = 0;
    		sa.clear();
    	}
    	selectionSort(sa2,a1);
    	
    	    
    }
    
    public  void selectionSort(ArrayList<Double> list,ArrayList<ArrayList<Verkaeufer>> a1) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            // Finde das kleinste Element in der unsortierten Liste
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Tausche das gefundene Minimum mit dem ersten unsortierten Element
            ArrayList<Verkaeufer> tempa = a1.get(minIndex);
            double temp = list.get(minIndex);
            
            list.set(minIndex, list.get(i));
            list.set(i, temp);
            
            a1.set(minIndex, a1.get(i));
            a1.set(i,tempa);
        }
    }
    
  
    public void filter(int mind, ArrayList<ArrayList<Verkaeufer>> a1) {
        for (int i = a1.size() - 1; i >= 0; i--) {  // Rückwärts iterieren, um Probleme mit dem Entfernen zu vermeiden
            int anzahl = 0;  // Setze die Stückzahl für jede Liste zurück
            for (int e = 0; e < a1.get(i).size(); e++) {
                // Füge die Stückzahl jedes Verkäufers in der inneren Liste hinzu
                anzahl += a1.get(i).get(e).getStueckzahl();
            }
            
            // Wenn die Summe der Stückzahlen kleiner als "mind" ist, entferne diese Liste
            if (anzahl < mind) {
                a1.remove(i);
            }
        }
    }
    
    public void printV(ArrayList<Verkaeufer> a1) {
    	System.out.println();
        for (int i = 0; i < a1.size(); i++) {
        	System.out.print(a1.get(i).getName()+", ");
        	System.out.print(a1.get(i).getPreis()+"€, ");
        	System.out.println(a1.get(i).getStueckzahl());
        }
    }
    
    
    public void scantxt(ArrayList<Verkaeufer> a1,String file) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line = br.readLine();
            while (line != null) {
            	if( st >0) {
            		
            		if (line.equals("")) {
                		gp++;
                    	if(gp>=2) {
                    		break;
                    	}
                	}else {
                		gp =0;
                	}
                		if(sk >1) {
                    		sk--;
                    	} else {
                    		scanline(line, a1);
                    	}
                        line = br.readLine();  // Lese die nächste Zeile
                        
            	}else {
            		st= 1;
            		line = br.readLine();  // Lese die nächste Zeile
            	}
            	
            	
            	
            	
            } 

        } catch (IOException e) {
            e.printStackTrace();
        }
        s1 = 0;
        c1 = 0;
        st = 0;
        sk = 0;
        gp = 0;
        //s1,c1,st,sk,gp = 0;
    }
    
    

    public void scanline(String line, ArrayList<Verkaeufer> a1) {
        
        switch (s1) {
            case 0:
                s1++; // Wechsle zum nächsten Zustand
                break;
                
            case 1:
                if (!line.equals("K")) {
                    s1++; // Wechsle zum nächsten Zustand
                }
                break;
                
            case 2:
                // Füge den Verkäufer mit dem aktuellen Namen hinzu
                a1.add(new Verkaeufer(line, 0, 0));
                s1 = 5;  // Springe zum Zustand, in dem der Preis hinzugefügt wird
                break;
                
            case 5:
                // Überprüfe, ob die Zeile einem Euro-Betrag entspricht
                String euroPattern = "\\d{1,3},\\d{2} €";
                Pattern pattern = Pattern.compile(euroPattern);
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    String cleanBetrag = line.replace(" €", "").replace(",", ".");
                    double betrag = Double.parseDouble(cleanBetrag);
                    a1.get(c1).setPreis(betrag);  // Setze den Preis des aktuellen Verkäufers
                    s1++;  // Wechsle zum Zustand, um die Stückzahl zu lesen
                }
                break;
                
            case 6:
                // Versuche, die Stückzahl zu parsen
                int foo;
                try {
                	foo = Integer.parseInt(line);
                    
                } catch (NumberFormatException e) {
                    foo = 0;  // Fallback-Wert bei Fehler
                }
                  // Setze die Stückzahl des aktuellen Verkäufers
                
                  // Erhöhe den Verkäuferindex
                
                  // Zurück zum ersten Zustand, um den nächsten Verkäufer zu verarbeiten
                
                if(foo>2) {
                	a1.get(c1).setStueckzahl(foo);
                	s1 = 0;
                	c1++;
                	sk =3;
                } else if(foo==1) {
                	a1.get(c1).setStueckzahl(foo);
                	s1 = 0;
                	c1++;
                }
                
                
            	//c1++;
                break;
            case 7:
            	s1++;
            case 8:
            	s1 = 0;
            	c1++;
        }}
    
    // Diese Methode findet die gemeinsamen Elemente zwischen zwei Listen
    public ArrayList<Verkaeufer> findSame(ArrayList<Verkaeufer> list1, ArrayList<Verkaeufer> list2) {
        // Erstelle eine neue Liste für die gemeinsamen Elemente
        ArrayList<Verkaeufer> commonElements = new ArrayList<>(list1);
        // Behalte nur die Elemente, die in beiden Listen enthalten sind
        commonElements.retainAll(list2);
        return commonElements;
    }
    public void findCommon(ArrayList<Verkaeufer> a1, ArrayList<Verkaeufer> a2,ArrayList<Verkaeufer> a3) {

        
        // Vergleiche die Namen der Verkäufer in den beiden Listen
        for (Verkaeufer v1 : a1) {
            for (Verkaeufer v2 : a2) {
                if (v1.getName().equals(v2.getName())) {
                    a3.add(v1);  // Füge den Verkäufer aus der ersten Liste hinzu
                    
                    break;  // Verlasse die innere Schleife, sobald ein passender Name gefunden wurde
                }
            }
        }
    }
    public void findCommon2(ArrayList<ArrayList<Verkaeufer>> a1, ArrayList<ArrayList<Verkaeufer>> a2, ArrayList<ArrayList<Verkaeufer>> a3) {
        
        // Vergleiche die Namen der Verkäufer in den beiden Listen
        for (int i = 0; i < a1.size(); i++) {
            String nameA1 = a1.get(i).get(0).getName();  // Hole den Namen des Verkäufers in a1
            
            // Überprüfe, ob dieser Verkäufername in a2 existiert
            for (int e = 0; e < a2.size(); e++) {
                String nameA2 = a2.get(e).get(0).getName();  // Hole den Namen des Verkäufers in a2
                
                if (nameA1.equals(nameA2)) {
                    a3.add(a1.get(i));  // Füge die gesamte Liste der Verkäufer in a3 ein
                    break;  // Verlasse die innere Schleife, sobald eine Übereinstimmung gefunden wurde
                }
            }
        }
    }
    public void sortit2( ArrayList<ArrayList<ArrayList<Verkaeufer>>> a1,int mind) {
    	//boolean changed = false;
    	double cost = 0;
    	//int count = 0;
    	//TreeMap<Integer, Double> tm = new TreeMap<>();
    	ArrayList<Double> sa = new ArrayList<>();
    	ArrayList<Double> sa2 = new ArrayList<>();
    	
    	for(int i = 0; i<a1.size(); i++) {
    		
    		for(int e = 0; e<a1.get(i).size(); e++) {

    			for(int f = 0 ; f<a1.get(i).get(e).getStueckzahl();f++) {
    				sa.add(a1.get(i).get(e).getPreis());
    			}
    			
    		}
    		for(int g = 0; g<mind;g++) {
    			cost+=sa.get(g);
    		}
    		sa2.add(cost);
    		cost = 0;
    		sa.clear();
    	}
    	selectionSort(sa2,a1);
    }
    
    public void check2card() {
    e1.scantxt(a1,"file.txt"); //alle Käufer mit Stückzahl und Preis in ArrayList a1
        
        e1.scantxt(a2,"file2.txt");
        
        //e1.printV(a1);
        //e1.printV(a2);
        

        //a3
        e1.printV(a1);
        System.out.println();
        e1.printV(a2);
        System.out.println();
        //e1.printV(a3);
        //e1.printV(a4);
        
        // filter(3,a3,a5)
        e1.assemble(a5, a1);
        e1.assemble(a6,a2);
        System.out.println("a5");
        e1.printV2(a5);
        System.out.println("a6");
        e1.printV2(a6);
        System.out.println();
        
        System.out.println();
        e1.filter(2, a5);
        System.out.println();
        e1.filter(2, a6);
        
        e1.findCommon2(a5, a6,a7); //findet alle Käufer mit Gemeinsmen Karten in a3 und a4
        e1.findCommon2(a6, a5,a8);
        //e1.printV(a4);
        System.out.println("a7");
        System.out.println();
        e1.printV2(a7);
        System.out.println("a8");
        System.out.println();
        e1.printV2(a8);
        

        e1.sortit(a7, 2);
        e1.sortit(a8, 2);
        e1.printV2(a7);

        e1.printV2(a8);
        
        ArrayList<ArrayList<ArrayList<Verkaeufer>>> a9 = new ArrayList<>();
        a9.add(a7); // Füge die erste Liste hinzu
        a9.add(a8); // Füge die zweite Liste hinzu
        //e1.hightlight(a5, a6);
        //e1.printV(a3);
        //e1.printV(a4);
        //e1.findSame(a1, a2);
    }
    
    
}


