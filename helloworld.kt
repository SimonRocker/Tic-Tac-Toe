fun main() {

//Speicher:
var IstSpielerEinsDran = true
var ZeileOben = listOf("1","3","3")
var ZeileMitte = listOf("3","2","3")
var ZeileUnten = listOf("3","3","3")

 	while (true) {
 		//Ausgabe:
 		val aktiverSpieler = if(IstSpielerEinsDran) "Spieler 1" else "Spieler 2"
		println("Es ist $aktiverSpieler dran.")

		
	    	println("| ${zahlInSymboleUmwandeln(ZeileOben.elementAt(0))} | ${zahlInSymboleUmwandeln(ZeileOben.elementAt(1))} | ${zahlInSymboleUmwandeln(ZeileOben.elementAt(2))} |")
		println("| ${zahlInSymboleUmwandeln(ZeileMitte.elementAt(0))} | ${zahlInSymboleUmwandeln(ZeileMitte.elementAt(1))} | ${zahlInSymboleUmwandeln(ZeileMitte.elementAt(2))} |")
		println("| ${zahlInSymboleUmwandeln(ZeileUnten.elementAt(0))} | ${zahlInSymboleUmwandeln(ZeileUnten.elementAt(1))} | ${zahlInSymboleUmwandeln(ZeileUnten.elementAt(2))} |")
 		
 		
 		//Eingabe:
 		val (a, b) = readLine()!!.split(' ')
 		if(a == "0") {
 			val symbol = if(IstSpielerEinsDran) "1" else "2"
 			val neueListe = ZeileOben.toMutableList()
 			neueListe[b.toInt()] = symbol
 			ZeileOben = neueListe.toList()
 		} else if(a == "1") {
 			val symbol = if(IstSpielerEinsDran) "1" else "2"
 			val neueListe = ZeileMitte.toMutableList()
 			neueListe[b.toInt()] = symbol
 			ZeileMitte = neueListe.toList()
 		} else if(a == "2") {
 			val symbol = if(IstSpielerEinsDran) "1" else "2"
 			val neueListe = ZeileUnten.toMutableList()
 			neueListe[b.toInt()] = symbol
 			ZeileUnten = neueListe.toList()
 		}
  		//Listen ändern
  		
  		IstSpielerEinsDran = !IstSpielerEinsDran
		
  		
 	}
}

fun zahlInSymboleUmwandeln(a: String): String {
	if(a == "1") {
		return "X"
	} else if(a == "2") {
		return "O"
	} else if(a == "3") {
		return " "
	} else {
		return "Fehler"
	}
}







